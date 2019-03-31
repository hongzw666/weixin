package com.hong.domain.link;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hong.domain.InMessage;

public class LinkInMessage extends InMessage {
	@JsonProperty("Title")
	private String Title;
	
	@JsonProperty("Description")
	private String description;
	
	@JsonProperty("Url")
	private String url;
	
	public LinkInMessage() {
		super.setMsgType("link");
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "LinkInMessage [Title=" + Title + ", description=" + description + ", url=" + url + ", getToUserName()="
				+ getToUserName() + ", getFormUserName()=" + getFormUserName() + ", getCreateTime()=" + getCreateTime()
				+ ", getMsgType()=" + getMsgType() + ", getMsgId()=" + getMsgId() + "]";
	}
	
}
