package com.kirusa.request;

import com.google.gson.annotations.SerializedName;

public class ImageUploadReqData {

	@SerializedName("mime_type")
	String mimeType;
	
	@SerializedName("image_type")
	String imgType;

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public String getImgType() {
		return imgType;
	}

	public void setImgType(String imgType) {
		this.imgType = imgType;
	}

}
