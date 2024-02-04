package com.chat.assistant.chatbot.service.speech;

public interface SpeechToTextService {
	public String getText(byte[] audioBytes);
}
