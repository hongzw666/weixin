package com.hong.weixin.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.hong.domain.InMessage;
import com.hong.domain.Image.ImageInMessage;
import com.hong.domain.link.LinkInMessage;
import com.hong.domain.location.LocationInMessage;
import com.hong.domain.shortvideo.ShortvideoInMessage;
import com.hong.domain.text.TextInMessage;
import com.hong.domain.video.VideoInMessage;
import com.hong.domain.voice.VoiceInMessage;

public class MessageTypeMapper {
	private static Map<String,Class<? extends InMessage>> typeMap = new ConcurrentHashMap<>();
	static {
		typeMap.put("text", TextInMessage.class);
		typeMap.put("image", ImageInMessage.class);
		typeMap.put("voice", VoiceInMessage.class);
		typeMap.put("video", VideoInMessage.class);
		typeMap.put("shortvideo", ShortvideoInMessage.class);
		typeMap.put("location", LocationInMessage.class);
		typeMap.put("link", LinkInMessage.class);
	}
	public static <T extends InMessage> Class<T> getClass (String type){
		
		return (Class<T>) typeMap.get(type);	
	}
	
}
