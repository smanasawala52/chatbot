package com.chat.assistant.chatbot.controller.mall;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.chat.assistant.chatbot.service.SectorService;
import com.chat.assistant.chatbot.service.SectorServiceMapInitializer;
import com.chat.assistant.chatbot.service.speech.SpeechToTextService;
@Controller
public class MicrophoneCaptureControllerFullAudio {

	@Autowired
	@Qualifier("GoogleSpeechToTextApi")
	private SpeechToTextService speechToTextService;

	private final Map<String, SectorService> serviceMap;

	@Autowired
	public MicrophoneCaptureControllerFullAudio(
			SectorServiceMapInitializer serviceMapInitializer) {
		this.serviceMap = serviceMapInitializer.getServiceMap();
	}

	@PostMapping(value = "/{type}/captureAudioStream", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> captureAudioStream(
			@PathVariable("type") String type,
			@RequestParam("audioData") MultipartFile audioData) {
		byte[] audioBytes;
		try {
			audioBytes = audioData.getBytes();
			String encodedMessage = speechToTextService.getText(audioBytes);
			SectorService sectorService = serviceMap.get(type);
			return ResponseEntity.ok()
					.body(sectorService.getResponse(encodedMessage));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}

	@PostMapping(value = "/{type}/captureQuery", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> captureQuery(@PathVariable("type") String type,
			@RequestParam("query") String query) {
		try {
			SectorService sectorService = serviceMap.get(type);
			return ResponseEntity.ok().body(sectorService.getResponse(query));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}

	@GetMapping("/{type}/resetChatSession")
	public String showHomeMall(@PathVariable("type") String type) {
		SectorService sectorService = serviceMap.get(type);
		sectorService.resetChatSession();
		return "redirect:/";
	}
}
