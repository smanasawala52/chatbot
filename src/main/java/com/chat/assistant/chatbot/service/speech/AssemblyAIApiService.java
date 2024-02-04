package com.chat.assistant.chatbot.service.speech;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.assemblyai.api.AssemblyAI;
import com.assemblyai.api.resources.transcripts.types.Transcript;

@Service
@Component("AssembyAIApi")
public class AssemblyAIApiService implements SpeechToTextService {

	public String getText(byte[] audioBytes) {
		long stTime = System.currentTimeMillis();
		String encodedMessage = "";
		AssemblyAI aai = AssemblyAI.builder()
				.apiKey(System.getenv("ASSEMBY_AI_API_KEY")).build();
		AudioFormat audioFormat = new AudioFormat(44100, 16, 1, true, false);
		AudioInputStream audioInputStream = new AudioInputStream(
				new ByteArrayInputStream(audioBytes), audioFormat,
				audioBytes.length / audioFormat.getFrameSize());
		// Write the audio data to a file
		File file = new File("transcribe.mp3");
		try {
			AudioSystem.write(audioInputStream, AudioFileFormat.Type.WAVE,
					file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Path tempAudioFile = null;
		try {
			tempAudioFile = Files.createTempFile("temp_audio_" + stTime,
					".wav");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Write the audio bytes to the temporary file
		try {
			Files.write(tempAudioFile, audioBytes, StandardOpenOption.WRITE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Transcript transcribe = null;
		try {
			File file1 = new File("C:\\openAI.mp3");
			transcribe = aai.transcripts().transcribe(tempAudioFile.toFile());
			encodedMessage = transcribe.getText().get();
			// System.out.println(encodedMessage);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("AssembyAIApi time taken: "
				+ (System.currentTimeMillis() - stTime));
		return encodedMessage;
	}

}
