package com.chat.assistant.chatbot.service.chat;

import java.util.List;

import com.chat.assistant.chatbot.model.Message;
import com.chat.assistant.chatbot.service.SectorTypeConstants;

import dev.langchain4j.data.document.Document;

public interface ChatService {
	public void initializeChat(String initSystemMessage,
			List<Document> documents, SectorTypeConstants sector);
	public Message getResponse(String input, SectorTypeConstants sector);
	public void resetChatSession(SectorTypeConstants sector);
}
