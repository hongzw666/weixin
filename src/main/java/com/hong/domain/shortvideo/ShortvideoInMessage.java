package com.hong.domain.shortvideo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hong.domain.InMessage;

public class ShortvideoInMessage extends InMessage {
	@JsonProperty("MediaId")
	private String mediaId;
	
	@JsonProperty("ThumbMediaId")
	private String thumbMediaId;
	
	public ShortvideoInMessage() {
		super.setMsgType("shortvideo");
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getThumbMediaId() {
		return thumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}

	@Override
	public String toString() {
		return "ShortvideoInMessage [mediaId=" + mediaId + ", thumbMediaId=" + thumbMediaId + ", getToUserName()="
				+ getToUserName() + ", getFormUserName()=" + getFormUserName() + ", getCreateTime()=" + getCreateTime()
				+ ", getMsgType()=" + getMsgType() + ", getMsgId()=" + getMsgId() + "]";
	}
	
}
