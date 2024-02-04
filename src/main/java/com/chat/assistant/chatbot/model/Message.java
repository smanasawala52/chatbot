package com.chat.assistant.chatbot.model;

public class Message {
	private String role;
	private String content;
	private byte[] audioData;
	private String question;
	public Message() {
	}
	public Message(String role, String content) {
		this.role = role;
		this.content = content;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public byte[] getAudioData() {
		return audioData;
	}
	public void setAudioData(byte[] audioData) {
		this.audioData = audioData;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Role: " + role + " content: " + content + " audioData: "
				+ audioData + " question: " + question;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
}
