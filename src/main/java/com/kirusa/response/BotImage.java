package com.kirusa.response;

import com.google.gson.annotations.SerializedName;

public class BotImage {
	
	@SerializedName("image_id")
	int imageId;
	
	@SerializedName("name")
    String imgName;
	
	@SerializedName("mime_type")
    String imgMimeType;
	
	@SerializedName("image_url")
    String imgUrl;

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public String getImgMimeType() {
		return imgMimeType;
	}

	public void setImgMimeType(String imgMimeType) {
		this.imgMimeType = imgMimeType;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imUrl) {
		this.imgUrl = imUrl;
	}
    
}
