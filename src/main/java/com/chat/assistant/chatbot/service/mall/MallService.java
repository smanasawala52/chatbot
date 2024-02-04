package com.chat.assistant.chatbot.service.mall;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.chat.assistant.chatbot.model.Message;
import com.chat.assistant.chatbot.model.mall.MallModel;
import com.chat.assistant.chatbot.repository.mall.MallModelRepository;
import com.chat.assistant.chatbot.service.SectorService;
import com.chat.assistant.chatbot.service.SectorTypeConstants;
import com.chat.assistant.chatbot.service.chat.ChatService;

import dev.langchain4j.data.document.Document;

@Service
@Component("MallService")
public class MallService implements SectorService {

	@Autowired
	@Qualifier("OpenAIChat")
	private ChatService chatService;
	@Autowired
	private MallModelRepository mallModelRepository;

	public List<MallModel> getAllMallModels() {
		return mallModelRepository.findAll();
	}

	public String initializeChat() {
		List<MallModel> mallModels = mallModelRepository.findAll();
		if (mallModels.isEmpty()) {
			return "redirect:/mall/csv/upload-success";
		}
		String initSystemMessage = "This Chat will Read all Mall Raw Data and "
				+ "will provide answers to users questions in an interactive session manner.";
		List<Document> documents = new ArrayList<Document>();
		for (MallModel mallModel : mallModels) {
			Document document = Document.document(String.valueOf(mallModel));
			System.out.println(mallModel);
			System.out.println(document.text());
			documents.add(document);
		}
		chatService.initializeChat(initSystemMessage, documents,
				SectorTypeConstants.MALL);
		return "redirect:/";
	}
	@Override
	public Message getResponse(String input) {
		return chatService.getResponse(input, getIdentity());
	}

	@Override
	public void resetChatSession() {
		chatService.resetChatSession(getIdentity());
	}
	@Override
	public SectorTypeConstants getIdentity() {
		return SectorTypeConstants.MALL;
	}

}
