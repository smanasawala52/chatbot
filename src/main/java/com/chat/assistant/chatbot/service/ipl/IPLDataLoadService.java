package com.chat.assistant.chatbot.service.ipl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.chat.assistant.chatbot.model.Message;
import com.chat.assistant.chatbot.model.ipl.Match;
import com.chat.assistant.chatbot.model.ipl.MatchBuilder;
import com.chat.assistant.chatbot.model.ipl.MatchInputJson;
import com.chat.assistant.chatbot.model.ipl.Venue;
import com.chat.assistant.chatbot.service.SectorService;
import com.chat.assistant.chatbot.service.SectorTypeConstants;
import com.chat.assistant.chatbot.service.chat.ChatService;
import com.fasterxml.jackson.databind.ObjectMapper;

import dev.langchain4j.data.document.Document;

@Component("IPLService")
@Service
public class IPLDataLoadService implements SectorService {
	private List<Match> matches = new CopyOnWriteArrayList<>();
	private List<Venue> venues = new CopyOnWriteArrayList<>();
	private String dirLocation = "ipl_json";
	List<Document> documents = new ArrayList<Document>();

	public List<Match> getMatches() {
		return matches;
	}

	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}

	@Autowired
	private ObjectMapper objectMapper;

	@PostConstruct
	public void loadMatchData() throws Exception {
		System.out.println("Dataloading started");

		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
		try {
			List<File> files = Files.list(Paths.get(dirLocation))
					.map(Path::toFile).collect(Collectors.toList());
			for (File file : files) {
				try {
					MatchInputJson value = objectMapper.readValue(
							new File(file.getPath()), MatchInputJson.class);
					System.out.println(value);
					documents.add(Document.document(String.valueOf(value)));
					Match match = new MatchBuilder()
							.setId(Long.valueOf(
									file.getName().replace(".json", "")))
							.setCity(value.getInfo().getCity())
							.setDate(Instant
									.ofEpochMilli(value.getInfo().getDates()
											.get(0).getTime())
									.atZone(ZoneId.systemDefault())
									.toLocalDate())
							.setPlayerOfMatch(
									value.getInfo().getPlayerOfMatch())
							.setEvent(value.getInfo().getEvent())
							.setOutcome(value.getInfo().getOutcome())
							.setTeam1(value.getInfo().getTeams().get(0))
							.setTeam2(value.getInfo().getTeams().get(1))
							.setVenue(value.getInfo().getVenue())
							.setTossDecision(
									value.getInfo().getToss().getDecision())
							.setTossWinner(
									value.getInfo().getToss().getWinner())
							.setOfficials(value.getInfo().getOfficials())
							.build();
					getMatches().add(match);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		Collections.sort(getMatches());
		if (!matches.isEmpty()) {
			initializeChat();
		}
	}

	public List<Venue> getVenues() {
		return venues;
	}

	public MatchInputJson getMatch(Long key) {
		try {
			MatchInputJson value = objectMapper.readValue(
					new File(dirLocation + "/" + key + ".json"),
					MatchInputJson.class);
			System.out.println(value);
			documents.add(Document.from(value.toString()));
			return value;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Autowired
	@Qualifier("OpenAIChat")
	private ChatService chatService;

	@Override
	public String initializeChat() {
		String initSystemMessage = "This Chat will Read all IPL Matches Raw Data and "
				+ "will provide answers to users questions in an interactive session manner.";
		chatService.initializeChat(initSystemMessage, documents,
				SectorTypeConstants.IPL);
		return "redirect:/ipl";
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
		// TODO Auto-generated method stub
		return SectorTypeConstants.IPL;
	}
}
