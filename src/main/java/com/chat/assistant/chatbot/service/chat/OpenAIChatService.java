package com.chat.assistant.chatbot.service.chat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.chat.assistant.chatbot.model.Message;
import com.chat.assistant.chatbot.service.SectorTypeConstants;

import dev.langchain4j.data.document.Document;
import dev.langchain4j.data.document.DocumentSplitter;
import dev.langchain4j.data.document.splitter.DocumentSplitters;
import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.embedding.AllMiniLmL6V2EmbeddingModel;
import dev.langchain4j.model.embedding.EmbeddingModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.openai.OpenAiTokenizer;
import dev.langchain4j.rag.content.retriever.EmbeddingStoreContentRetriever;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.store.embedding.EmbeddingStore;
import dev.langchain4j.store.embedding.EmbeddingStoreIngestor;
import dev.langchain4j.store.embedding.inmemory.InMemoryEmbeddingStore;
@Service
@Component("OpenAIChat")
public class OpenAIChatService implements ChatService {
	Map<SectorTypeConstants, CustomerSupportAgent> agents = new HashMap<SectorTypeConstants, CustomerSupportAgent>();
	@Override
	public void initializeChat(String initSystemMessage,
			List<Document> documents, SectorTypeConstants sector) {
		System.out.println("OpenAIChatService: Reached Here");
		EmbeddingStore<TextSegment> embeddingStore = new InMemoryEmbeddingStore<>();
		int maxResults = 1;
		double minScore = 0.6;
		EmbeddingModel embeddingModel = new AllMiniLmL6V2EmbeddingModel();
		// Metadata metadata = new Metadata();
		// metadata.
		// System.out.println(inputJson);
		// List<Document> documents = new ArrayList<>();
		//
		// Document document = Document.from(inputJson);
		// documents.add(document);
		String model = "gpt-3.5-turbo";
		DocumentSplitter documentSplitter = DocumentSplitters.recursive(100, 0,
				new OpenAiTokenizer(model));
		EmbeddingStoreIngestor ingestor = EmbeddingStoreIngestor.builder()
				.documentSplitter(documentSplitter)
				.embeddingModel(embeddingModel).embeddingStore(embeddingStore)
				.build();
		ingestor.ingest(documents);
		EmbeddingStoreContentRetriever contentRetriever = EmbeddingStoreContentRetriever
				.builder().embeddingStore(embeddingStore)
				.embeddingModel(embeddingModel).maxResults(maxResults)
				.minScore(minScore).build();
		ChatLanguageModel chatLanguageModel = OpenAiChatModel
				.withApiKey(System.getenv("OPENAI_API_KEY"));
		CustomerSupportAgent agent = AiServices
				.builder(CustomerSupportAgent.class)
				.chatLanguageModel(chatLanguageModel)
				.chatMemory(MessageWindowChatMemory.withMaxMessages(20))
				.contentRetriever(contentRetriever).build();
		agents.put(sector, agent);
	}

	@Override
	public Message getResponse(String input, SectorTypeConstants sector) {
		Message m = new Message();
		m.setQuestion(input);
		String agentMessage = agents.get(sector).chat(input);
		m.setContent(agentMessage);
		return m;
	}

	@Override
	public void resetChatSession(SectorTypeConstants sector) {
	}
}
