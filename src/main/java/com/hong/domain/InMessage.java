package com.hong.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class InMessage {
	@JsonProperty("ToUserName")
	private String toUserName;
	
	@JsonProperty("FormUserName")
	private String formUserName;
	
	@JsonProperty("CreateTime")
	private long createTime;
	
	@JsonProperty("MsgType")
	private String msgType;
	
	@JsonProperty("MsgId")
	private Long msgId;

	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFormUserName() {
		return formUserName;
	}

	public void setFormUserName(String formUserName) {
		this.formUserName = formUserName;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public Long getMsgId() {
		return msgId;
	}

	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}

	@Override
	public String toString() {
		return "InMessage [toUserName=" + toUserName + ", formUserName=" + formUserName + ", createTime=" + createTime
				+ ", msgType=" + msgType + ", msgId=" + msgId + "]";
	}
	
}
