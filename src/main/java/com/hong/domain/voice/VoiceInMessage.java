package com.hong.domain.voice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hong.domain.InMessage;

public class VoiceInMessage extends InMessage {
		@JsonProperty("MediaId")
		private String mediaId;
		
		@JsonProperty("Format")
		private String format;
		
		@JsonProperty("Recognition")
		private String recognition;
		
		public VoiceInMessage() {
			super.setMsgType("voice");
		}
		
		public String getMediaId() {
			return mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public String getFormat() {
			return format;
		}

		public void setFormat(String format) {
			this.format = format;
		}

		public String getRecognition() {
			return recognition;
		}

		public void setRecognition(String recognition) {
			this.recognition = recognition;
		}

}
