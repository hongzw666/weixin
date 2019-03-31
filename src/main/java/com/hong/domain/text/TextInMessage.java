package com.hong.domain.text;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hong.domain.InMessage;

public class TextInMessage extends InMessage {
	@JsonProperty("Comtent")
	private String comtent;
	
	public TextInMessage() {
		super.setMsgType("text");
	}

	public String getComtent() {
		return comtent;
	}

	public void setComtent(String comtent) {
		this.comtent = comtent;
	}

	@Override
	public String toString() {
		return "TextInMessage [comtent=" + comtent + ", getToUserName()=" + getToUserName() + ", getFormUserName()="
				+ getFormUserName() + ", getCreateTime()=" + getCreateTime() + ", getMsgType()=" + getMsgType()
				+ ", getMsgId()=" + getMsgId() + "]";
	}
	
	
}
