package com.kirusa.response;

import com.google.gson.annotations.SerializedName;

public class ImageUploadRespBean {

	@SerializedName("file_name")
	private String fileName;
	
	@SerializedName("org_file_name")
	private String origFileName;
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getOrigFileName() {
		return origFileName;
	}
	public void setOrigFileName(String origFileName) {
		this.origFileName = origFileName;
	}
	
}
