package com.hong.weixin.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.hong.domain.InMessage;
import com.hong.domain.Image.ImageInMessage;
import com.hong.domain.event.EventInMessage;
import com.hong.domain.link.LinkInMessage;
import com.hong.domain.location.LocationInMessage;
import com.hong.domain.shortvideo.ShortvideoInMessage;
import com.hong.domain.text.TextInMessage;
import com.hong.domain.video.VideoInMessage;
import com.hong.domain.voice.VoiceInMessage;

public class MessageTypeMapper {
	private static Map<String,Class<? extends InMessage>> typeMap = new ConcurrentHashMap<>();
	// 通过一个Map记录了消息类型和类的关系
	static {
		typeMap.put("text", TextInMessage.class);
		typeMap.put("image", ImageInMessage.class);
		typeMap.put("voice", VoiceInMessage.class);
		typeMap.put("video", VideoInMessage.class);
		typeMap.put("shortvideo", ShortvideoInMessage.class);
		typeMap.put("location", LocationInMessage.class);
		typeMap.put("link", LinkInMessage.class);
		typeMap.put("event", EventInMessage.class);
	}
	// 通过消息类型获取对应的类
	@SuppressWarnings("unchecked")
	public static <T extends InMessage> Class<T> getClass (String type){
		
		return (Class<T>) typeMap.get(type);	
	}
	
}
