package com.chat.assistant.chatbot.config;
import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.cloud.speech.v1p1beta1.RecognitionConfig;
import com.google.cloud.speech.v1p1beta1.SpeechClient;
import com.google.cloud.speech.v1p1beta1.SpeechSettings;

@Configuration
public class SpeechToTextConfig {

	@Bean
	public SpeechClient speechClient() throws IOException {
		SpeechSettings speechSettings = SpeechSettings.newBuilder().build();
		return SpeechClient.create(speechSettings);
	}

	@Bean
	public RecognitionConfig recognitionConfig() {
		return RecognitionConfig.newBuilder()
				.setEncoding(RecognitionConfig.AudioEncoding.MP3)
				.setSampleRateHertz(48000).setLanguageCode("en-US")
				.setModel("phone_call").build();
	}
}
