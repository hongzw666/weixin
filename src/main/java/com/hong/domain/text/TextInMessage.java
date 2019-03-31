package com.hong.domain.text;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.hong.domain.InMessage;

@XmlAccessorType(XmlAccessType.FIELD) // JAXB从字段获取配置信息
@XmlRootElement(name = "xml") // JAXB读取XML时根元素名称
public class TextInMessage extends InMessage {
	@XmlElement(name = "Comtent")
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
