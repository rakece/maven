package com.kirusa.response;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class BotMultimedia {
	
	@SerializedName("video")
	BotVideo video;
	
	@SerializedName("images")
	ArrayList< BotImage > images = new ArrayList < BotImage > ();

	public BotVideo getVideo() {
		return video;
	}

	public void setVideo(BotVideo video) {
		this.video = video;
	}

	public ArrayList<BotImage> getImages() {
		return images;
	}

	public void setImages(ArrayList<BotImage> images) {
		this.images = images;
	}

	
}
