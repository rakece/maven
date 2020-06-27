package com.kirusa.request;

import java.util.ArrayList;

public class BotSettingData {

	Bot bot = new Bot();
	ArrayList<BotDesc> bot_desc= new ArrayList<BotDesc>();
    ArrayList<BotTags> tags=new ArrayList<BotTags> ();
	ArrayList<BotsCountry> supported_country=new ArrayList<BotsCountry> ();
	ArrayList<BotImage> screen_image=new ArrayList<BotImage>();
	ArrayList<BotVideo> video= new ArrayList<BotVideo>();
	ArrayList<BotType> type= new ArrayList<BotType> ();
	ArrayList<BotUpdate> update= new  ArrayList<BotUpdate>();
	ArrayList<BotCarrier> supported_carrier = new  ArrayList<BotCarrier>();
	BotPublisherData publisher_data;
	
	
	public ArrayList<BotUpdate> getUpdate() {
		return update;
	}
	public void setUpdate(ArrayList<BotUpdate> update) {
		this.update = update;
	}
	@Override
	public String toString() {
		return "BotSettingData [bot=" + bot + ", bot_desc=" + bot_desc + ", tags=" + tags + ", supported_country="
				+ supported_country + ", screen_image=" + screen_image + ", video=" + video + ", type=" + type
				+ ", update=" + update + ", carrier=" + supported_carrier + "]";
	}
	public Bot getBot() {
		return bot;
	}
	public void setBot(Bot bot) {
		this.bot = bot;
	}
	public ArrayList<BotDesc> getBot_desc() {
		return bot_desc;
	}
	public void setBot_desc(ArrayList<BotDesc> bot_desc) {
		this.bot_desc = bot_desc;
	}
	public ArrayList<BotTags> getTags() {
		return tags;
	}
	public void setTags(ArrayList<BotTags> tags) {
		this.tags = tags;
	}
	public ArrayList<BotsCountry> getSupported_country() {
		return supported_country;
	}
	public void setSupported_country(ArrayList<BotsCountry> supported_country) {
		this.supported_country = supported_country;
	}
	public ArrayList<BotImage> getScreen_image() {
		return screen_image;
	}
	public void setScreen_image(ArrayList<BotImage> screen_image) {
		this.screen_image = screen_image;
	}
	public ArrayList<BotVideo> getVideo() {
		return video;
	}
	public void setVideo(ArrayList<BotVideo> video) {
		this.video = video;
	}
	public ArrayList<BotType> getType() {
		return type;
	}
	public void setType(ArrayList<BotType> type) {
		this.type = type;
	}
	
	public ArrayList<BotCarrier> getSupported_carrier() {
		return supported_carrier;
	}
	public void setSupported_carrier(ArrayList<BotCarrier> supported_carrier) {
		this.supported_carrier = supported_carrier;
	}
	public BotPublisherData getPublisher_data() {
		return publisher_data;
	}
	public void setPublisher_data(BotPublisherData publisher_data) {
		this.publisher_data = publisher_data;
	}
	

}
