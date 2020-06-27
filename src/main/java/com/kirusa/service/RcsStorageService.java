package com.kirusa.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import com.kirusa.request.ImageUploadReqData;
import com.kirusa.response.ImageUploadRespBean;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.stream.Stream;

public interface RcsStorageService {

	void init();

	void store(MultipartFile file);
	
	public ImageUploadRespBean storeBotProfilePic(MultipartFile file, ImageUploadReqData data);
	
	public ImageUploadRespBean storeBotScreenImage(MultipartFile file, ImageUploadReqData data);
	
	public void storeBotScreenVideo(MultipartFile file, String data);

	Stream<Path> loadAll();

	Path load(String filename);

	Resource loadAsResource(String filename);
	
	public void copyToActualDirectories(ArrayList<String> filesList, Integer botId, String inmgType, boolean retryCopy);

	public boolean deleteFile(String fileName, Integer botId, String inmgType, boolean retryCopy);
	
	void deleteAll();

}
