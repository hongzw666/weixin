package com.hong.domain.location;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hong.domain.InMessage;

public class LocationInMessage  extends InMessage {
	@JsonProperty("Location_X")
	private String location_X;
	
	@JsonProperty("Location_Y")
	private String location_Y;
	
	@JsonProperty("Scale")
	private String scale;
	
	@JsonProperty("Label")
	private String label;
	
	public LocationInMessage() {
		super.setMsgType("location");
	}

	public String getLocation_X() {
		return location_X;
	}

	public void setLocation_X(String location_X) {
		this.location_X = location_X;
	}

	public String getLocation_Y() {
		return location_Y;
	}

	public void setLocation_Y(String location_Y) {
		this.location_Y = location_Y;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "LocationInMessage [location_X=" + location_X + ", location_Y=" + location_Y + ", scale=" + scale
				+ ", label=" + label + ", getToUserName()=" + getToUserName() + ", getFormUserName()="
				+ getFormUserName() + ", getCreateTime()=" + getCreateTime() + ", getMsgType()=" + getMsgType()
				+ ", getMsgId()=" + getMsgId() + "]";
	}
	
}
