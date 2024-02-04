package com.chat.assistant.chatbot.service.speech;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
@Component("WhisperApi")
public class WhisperApiService implements SpeechToTextService {

	private final String WHISPER_ASR_API_URL = "https://api.openai.com/v1/audio/transcriptions";
	public String getText(byte[] audioBytes) {
		long stTime = System.currentTimeMillis();
		String encodedMessage = "";
		try {
			MultiValueMap<String, Object> parts = new LinkedMultiValueMap<>();
			ByteArrayResource resource = new ByteArrayResource(audioBytes) {
				@Override
				public String getFilename() {
					return "C:\\openAI.mp3";
				}
			};
			parts.add("file", resource);
			parts.add("model", "whisper-1");
			parts.add("response_format", "text");

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.MULTIPART_FORM_DATA);
			headers.setBearerAuth(System.getenv("API_KEY"));
			HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(
					parts, headers);

			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> responseEntity = restTemplate.exchange(
					WHISPER_ASR_API_URL, HttpMethod.POST, requestEntity,
					String.class);
			encodedMessage = responseEntity.getBody();
			// System.out.println(encodedMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("WhisperApi time taken: "
				+ (System.currentTimeMillis() - stTime));
		return encodedMessage;
	}

}
