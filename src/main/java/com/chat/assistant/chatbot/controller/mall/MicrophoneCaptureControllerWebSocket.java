package com.chat.assistant.chatbot.controller.mall;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.chat.assistant.chatbot.model.Message;
import com.chat.assistant.chatbot.service.speech.SpeechToTextService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class MicrophoneCaptureControllerWebSocket {

	@Autowired
	@Qualifier("GoogleSpeechToTextApi")
	private SpeechToTextService speechToTextService;

	@MessageMapping("/audio")
	@SendTo("/topic/audioStream")
	public String handleAudio(String jsonString) {
		ObjectMapper objectMapper = new ObjectMapper();
		// Convert the JSON string to a Java object
		Message myObject = null;
		try {
			myObject = objectMapper.readValue(jsonString, Message.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Handle the received audio data (you may want to save it, process it,
		// etc.)
		try {
			// // System.out.println("Received audio data: "
			// + myObject.getAudioData().length + " bytes");
			String encodedMessage = speechToTextService
					.getText(myObject.getAudioData());
			// // System.out.println("Redirecting to: " + encodedMessage);
			return encodedMessage;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	@MessageMapping("/audioData")
	@SendTo("/topic/audioStream")
	public String captureAudio(
			@RequestParam("audioData") MultipartFile audioData) {
		// // System.out.println(
		// "Received audio data: " + audioData.getSize() + " bytes");
		byte[] audioBytes;
		try {
			audioBytes = audioData.getBytes();
			String encodedMessage = speechToTextService.getText(audioBytes);
			// // System.out.println("Redirecting to: " + encodedMessage);
			return encodedMessage;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
}
