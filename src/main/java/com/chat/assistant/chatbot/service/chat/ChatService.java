package com.chat.assistant.chatbot.service.chat;

import com.chat.assistant.chatbot.model.Message;
import com.chat.assistant.chatbot.service.SectorTypeConstants;

public interface ChatService {
	public void initializeChat(String initSystemMessage, String inputJson,
			SectorTypeConstants sector);
	public Message getResponse(String input, SectorTypeConstants sector);
	public void resetChatSession(SectorTypeConstants sector);
}
