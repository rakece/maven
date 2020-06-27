package com.kirusa.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.kirusa.exception.StorageException;
import com.kirusa.exception.StorageFileNotFoundException;
import com.kirusa.request.ImageUploadReqData;
import com.kirusa.response.ImageUploadRespBean;
import com.kirusa.util.AppConfig;
import com.kirusa.util.RCSConstant;

@Service("RcsStorageService")
public class RcsStorageServiceImpl implements RcsStorageService {

	private Path baseStoragePath;
	private Path tempDirLocation;
	private Path baseImageBotPath;
	private Path baseVideoBotPath;

	public RcsStorageServiceImpl() {
//		this.tempDirLocation = Paths.get(AppConfig.getTempDirectoryPath());
	}

//	@PostConstruct
//	public void initMethod() {
//		this.tempDirLocation = Paths.get(AppConfig.getTempDirectoryPath());
//	}

	@Override
	public void store(MultipartFile file) {
		String origFileName = StringUtils.cleanPath(file.getOriginalFilename());
		String filename = getUniqueRandomId();
		try {
			if (file.isEmpty()) {
				throw new StorageException("Failed to store empty file " + origFileName);
			}
			if (filename.contains("..")) {
				// This is a security check
				throw new StorageException(
						"Cannot store file with relative path outside current directory " + origFileName);
			}
			try (InputStream inputStream = file.getInputStream()) {
				Files.copy(inputStream, this.tempDirLocation.resolve(filename), StandardCopyOption.REPLACE_EXISTING);
			}
		} catch (IOException e) {
			throw new StorageException("Failed to store file " + origFileName, e);
		}
	}

	@Override
	public ImageUploadRespBean storeBotProfilePic(MultipartFile file, ImageUploadReqData data) {
		String origFileName = StringUtils.cleanPath(file.getOriginalFilename());
		String filename = getUniqueRandomId();
		ImageUploadRespBean respBean = new ImageUploadRespBean();
		try {
			if (file.isEmpty()) {
				throw new StorageException("Failed to store empty file " + origFileName);
			}
			if (filename.contains("..")) {
				// This is a security check
				throw new StorageException(
						"Cannot store file with relative path outside current directory " + origFileName);
			}
			try (InputStream inputStream = file.getInputStream()) {

				if (this.tempDirLocation == null)
					this.tempDirLocation = Paths.get(AppConfig.getTempDirectoryPath());

				Files.copy(inputStream, this.tempDirLocation.resolve(filename), StandardCopyOption.REPLACE_EXISTING);

				respBean.setOrigFileName(origFileName);
				respBean.setFileName(filename);
			}
		} catch (IOException e) {
			throw new StorageException("Failed to store file " + origFileName, e);
		}
		return respBean;
	}

	@Override
	public ImageUploadRespBean storeBotScreenImage(MultipartFile file, ImageUploadReqData data) {
		String origFilename = StringUtils.cleanPath(file.getOriginalFilename());
		String filename = getUniqueRandomId() + "." + data.getMimeType();
		ImageUploadRespBean respBean = new ImageUploadRespBean();
		try {
			if (file.isEmpty()) {
				throw new StorageException("Failed to store empty file " + origFilename);
			}
			if (filename.contains("..")) {
				// This is a security check
				throw new StorageException(
						"Cannot store file with relative path outside current directory " + origFilename);
			}
			try (InputStream inputStream = file.getInputStream()) {

				if (this.tempDirLocation == null)
					this.tempDirLocation = Paths.get(AppConfig.getTempDirectoryPath());

				Files.copy(inputStream, this.tempDirLocation.resolve(filename), StandardCopyOption.REPLACE_EXISTING);
			}
		} catch (IOException e) {
			throw new StorageException("Failed to store file " + origFilename, e);
		}

		respBean.setOrigFileName(origFilename);
		respBean.setFileName(filename);

		return respBean;
	}

	@Override
	public void storeBotScreenVideo(MultipartFile file, String data) {
		String filename = StringUtils.cleanPath(file.getOriginalFilename());
		try {
			if (file.isEmpty()) {
				throw new StorageException("Failed to store empty file " + filename);
			}
			if (filename.contains("..")) {
				// This is a security check
				throw new StorageException(
						"Cannot store file with relative path outside current directory " + filename);
			}
			try (InputStream inputStream = file.getInputStream()) {
				Files.copy(inputStream, this.tempDirLocation.resolve(filename), StandardCopyOption.REPLACE_EXISTING);
			}
		} catch (IOException e) {
			throw new StorageException("Failed to store file " + filename, e);
		}
	}

	@Override
	public Stream<Path> loadAll() {
		try {
			return Files.walk(this.tempDirLocation, 1).filter(path -> !path.equals(this.tempDirLocation))
					.map(this.tempDirLocation::relativize);
		} catch (IOException e) {
			throw new StorageException("Failed to read stored files", e);
		}

	}

	@Override
	public Path load(String filename) {
		return tempDirLocation.resolve(filename);
	}

	@Override
	public Resource loadAsResource(String filename) {
		try {
			Path file = load(filename);
			Resource resource = new UrlResource(file.toUri());
			if (resource.exists() || resource.isReadable()) {
				return resource;
			} else {
				throw new StorageFileNotFoundException("Could not read file: " + filename);

			}
		} catch (MalformedURLException e) {
			throw new StorageFileNotFoundException("Could not read file: " + filename, e);
		}
	}

	@Override
	public void deleteAll() {
		FileSystemUtils.deleteRecursively(tempDirLocation.toFile());
	}

	@Override
	public void init() {
		try {
			Files.createDirectories(tempDirLocation);
		} catch (IOException e) {
			throw new StorageException("Could not initialize storage", e);
		}
	}

	@Override
	public void copyToActualDirectories(ArrayList<String> filesList, Integer botId, String imgType, boolean retryCopy) {

		if (this.tempDirLocation == null)
			this.tempDirLocation = Paths.get(AppConfig.getTempDirectoryPath());

		// String baseImgPath = AppConfig.getStorePath()+"/"+botId+"/";

		Path basePath = getBasePathForType(imgType, botId);

		ArrayList<String> failedList = new ArrayList<String>();

		for (int i = 0; i < filesList.size(); i++) {
			Path srcFile = Paths.get(this.tempDirLocation + "/" + filesList.get(i));
			Path destFile = basePath.resolve(filesList.get(i));

			// copy source to target using Files Class
			try {
				Files.copy(srcFile, destFile);
				Files.delete(srcFile); // To delete file once copied from temp source
			} catch (IOException e) {
				failedList.add(filesList.get(i));
				e.printStackTrace();
				continue;
			}
		}

		if (retryCopy && failedList.size() > 0) {
			// Check what to if failed to copy
			copyToActualDirectories(failedList, botId, imgType, false);
		}
	}

	@Override
	public boolean deleteFile(String fileName, Integer botId, String imgType, boolean retryCopy) {
		boolean fileDeleted = false;
		try {
			Path basePath = getBasePathForType(imgType, botId);
			Path filePath = basePath.resolve(fileName);
			fileDeleted = Files.deleteIfExists(filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fileDeleted = false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fileDeleted = false;
		}
		// if(!fileDeleted)
		// fileDeleted = deleteFile(fileName, botId, imgType, false);
		return fileDeleted;
	}

	private String getUniqueRandomId() {
		return UUID.randomUUID().toString();
	}

	private Path getBasePathForType(String imgType, Integer botId) {

		Path basePath = null;

		switch (imgType) {
		case RCSConstant.BOT_SCREEN_IMAGE_TYPE:
			Path botScreenImgPath = Paths.get(AppConfig.getStorePath() + AppConfig.getBotScrenImage(botId));
			if (Files.notExists(botScreenImgPath)) {
				try {
					basePath = Files.createDirectories(botScreenImgPath);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			break;
		case RCSConstant.BOT_LOGO_IMAGE_TYPE:
			Path botLogoImgPath = Paths.get(AppConfig.getStorePath() + AppConfig.getBotLogoImage(botId));
			if (Files.notExists(botLogoImgPath)) {
				try {
					basePath = Files.createDirectories(botLogoImgPath);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			break;
		case RCSConstant.BOT_SCREEN_VIDEO_TYPE:
			Path botScreenVidePath = Paths.get(AppConfig.getStorePath() + AppConfig.getBotScreenVideo(botId));
			if (Files.notExists(botScreenVidePath)) {
				try {
					basePath = Files.createDirectories(botScreenVidePath);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			break;

		case RCSConstant.DIR_LOGO_TYPE:
			Path botDirLogoPath = Paths.get(AppConfig.getStorePath() + AppConfig.getBotDirectoryLogo());
			if (Files.notExists(botDirLogoPath)) {
				try {
					basePath = Files.createDirectories(botDirLogoPath);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			break;

		default:
			break;
		}

		return basePath;
	}
}