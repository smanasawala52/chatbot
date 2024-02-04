package com.chat.assistant.chatbot.service.speech;

import org.springframework.stereotype.Service;

import com.google.cloud.texttospeech.v1.AudioConfig;
import com.google.cloud.texttospeech.v1.AudioEncoding;
import com.google.cloud.texttospeech.v1.SynthesisInput;
import com.google.cloud.texttospeech.v1.SynthesizeSpeechResponse;
import com.google.cloud.texttospeech.v1.TextToSpeechClient;
import com.google.cloud.texttospeech.v1.VoiceSelectionParams;
import com.google.protobuf.ByteString;

@Service
public class TextToSpeechService {

	public byte[] convertToSpeech(String text) {
		try (TextToSpeechClient textToSpeechClient = TextToSpeechClient
				.create()) {
			SynthesisInput input = SynthesisInput.newBuilder().setText(text)
					.build();

			VoiceSelectionParams voice = VoiceSelectionParams.newBuilder()
					.setLanguageCode("en-IN").setName("en-IN-Neural2-A")
					.build();

			AudioConfig audioConfig = AudioConfig.newBuilder()
					.setAudioEncoding(AudioEncoding.LINEAR16).build();

			SynthesizeSpeechResponse response = textToSpeechClient
					.synthesizeSpeech(input, voice, audioConfig);

			ByteString audioContent = response.getAudioContent();
			return audioContent.toByteArray();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
