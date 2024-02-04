package com.chat.assistant.chatbot.service;

import com.chat.assistant.chatbot.model.Message;

public interface SectorService {
	public String initializeChat();
	public Message getResponse(String input);
	public void resetChatSession();
	public SectorTypeConstants getIdentity();
}
