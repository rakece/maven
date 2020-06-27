package com.kirusa.common.cmdhandler.sync;

public class BotForCountryRequest {
	  private String cmd;
	  private String timestamp;
	  private String msisdn;
	  private String source;
	  private BotForCountryData data;

	 // Getter Methods 

	  public String getCmd() {
	    return cmd;
	  }

	  public String getTimestamp() {
	    return timestamp;
	  }

	  public String getMsisdn() {
	    return msisdn;
	  }

	  public String getSource() {
	    return source;
	  }

	 // Setter Methods 

	  public void setCmd( String cmd ) {
	    this.cmd = cmd;
	  }

	  public void setTimestamp( String timestamp ) {
	    this.timestamp = timestamp;
	  }

	  public void setMsisdn( String msisdn ) {
	    this.msisdn = msisdn;
	  }

	  public void setSource( String source ) {
	    this.source = source;
	  }

	public BotForCountryData getData() {
		return data;
	}

	public void setData(BotForCountryData data) {
		this.data = data;
	}

}
