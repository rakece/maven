package com.kirusa.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.kirusa.exception.StorageFileNotFoundException;
import com.kirusa.request.BotDetailsCmdRequest;
import com.kirusa.request.ImageUploadReqData;
import com.kirusa.response.ImageUploadRespBean;
import com.kirusa.service.RcsStorageService;
import com.kirusa.util.RCSConstant;

import net.minidev.json.JSONObject;


@RestController("RcsFileUploadController")
public class RcsFileUploadController {

	@Autowired
	private RcsStorageService storageService;

	@Autowired
	public RcsFileUploadController(RcsStorageService storageService) {
		this.storageService = storageService;
	}

	@GetMapping("/")
	public String listUploadedFiles(Model model) throws IOException {

		model.addAttribute("files", storageService.loadAll().map(
				path -> MvcUriComponentsBuilder.fromMethodName(RcsFileUploadController.class,
						"serveFile", path.getFileName().toString()).build().toString())
				.collect(Collectors.toList()));

		return "uploadForm";
	}

	@GetMapping("/rcsbotdirectory/files/{filename:.+}")
	@ResponseBody
	public ResponseEntity<Resource> serveFile(@PathVariable String filename) {

		Resource file = storageService.loadAsResource(filename);
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
				"attachment; filename=\"" + file.getFilename() + "\"").body(file);
	}

	@CrossOrigin(origins = "*")
	@PostMapping("/rcsbotdirectory/imgupload")
	public ImageUploadRespBean handleImaegUpload(@RequestParam("file") MultipartFile file, @RequestParam("filedata") String fileData,
			RedirectAttributes redirectAttributes) {

		ImageUploadReqData imgData = new Gson().fromJson(fileData, ImageUploadReqData.class);
		ImageUploadRespBean resp = storageService.storeBotScreenImage(file, imgData); 
		return resp;
	}
	
	@PostMapping("/rcsbotdirectory/botprofilepicupload")
	public String handleBotProfilePicUpload(@RequestParam("file") MultipartFile file, @RequestParam("filedata") ImageUploadReqData fileData,
			RedirectAttributes redirectAttributes) {

		storageService.storeBotProfilePic(file, fileData);
		redirectAttributes.addFlashAttribute("message",
				"You successfully uploaded " + file.getOriginalFilename() + "!");

		return "redirect:/";
	}

	@ExceptionHandler(StorageFileNotFoundException.class)
	public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/rcsbotdirectory/copytest") // Test method copying from 'temp' to 'bot-dir'
	public void copyToBotDir() {
		ArrayList<String> files = new ArrayList<String>();
		files.add("2a084b04-ebb6-4408-aa50-d0174c6ee55e");
		files.add("515dfcb5-9eb7-4a2c-b675-b584c30f4df6");
		files.add("b967dfe4-b04a-4731-b8d5-472ee6d6ab95");
		storageService.copyToActualDirectories(files, 1, RCSConstant.BOT_SCREEN_IMAGE_TYPE, true);
	}

}
