package com.kirusa.response;

import com.google.gson.annotations.SerializedName;

public class BotVideo {
	
	@SerializedName("video_id")
	private Integer videoId;
	
	@SerializedName("name")
	private String videoName;
	
	@SerializedName("mime_type")
	private String videoMimeType;
	
	@SerializedName("video_url")
	private String videoUrl;

	
	public Integer getVideoId() {
		return videoId;
	}

	public void setVideoId(Integer videoId) {
		this.videoId = videoId;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getVideoMimeType() {
		return videoMimeType;
	}

	public void setVideoMimeType(String videoMimeType) {
		this.videoMimeType = videoMimeType;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	
}