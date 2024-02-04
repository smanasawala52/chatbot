package com.chat.assistant.chatbot.service;

public enum SectorTypeConstants {
	MALL("mall"), IPL("ipl"), INTERVIEW("interview"), TRAVEL("travel");

	private final String type;

	SectorTypeConstants(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
