package com.chat.assistant.chatbot.controller.mall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chat.assistant.chatbot.service.speech.TextToSpeechService;

@RestController
public class TextToSpeechController {

	@Autowired
	private TextToSpeechService textToSpeechService;

	@PostMapping("/convertToSpeech")
	public ResponseEntity<byte[]> convertToSpeech(
			@RequestParam String inputText) {
		// Use TextToSpeechService to convert text to audio
		byte[] audioData = textToSpeechService.convertToSpeech(inputText);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		headers.setContentDispositionFormData("attachment", "audio.mp3");

		return new ResponseEntity<>(audioData, headers, HttpStatus.OK);
	}
}