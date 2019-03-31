package com.hong.domain.Image;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hong.domain.InMessage;

public class ImageInMessage  extends InMessage {
	@JsonProperty("PicUrl")
	private String url;
	
	@JsonProperty("MediaId")
	private String mediaId;
	
	
	public ImageInMessage() {
		super.setMsgType("image");
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getMediaId() {
		return mediaId;
	}


	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}


	@Override
	public String toString() {
		return "ImageInMessage [url=" + url + ", mediaId=" + mediaId + ", getToUserName()=" + getToUserName()
				+ ", getFormUserName()=" + getFormUserName() + ", getCreateTime()=" + getCreateTime()
				+ ", getMsgType()=" + getMsgType() + ", getMsgId()=" + getMsgId() + "]";
	}

}
