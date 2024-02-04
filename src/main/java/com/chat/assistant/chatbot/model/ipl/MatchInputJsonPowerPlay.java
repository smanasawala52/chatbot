package com.chat.assistant.chatbot.model.ipl;

public class MatchInputJsonPowerPlay {
	private float from;
	private float to;
	private String type;

	public float getFrom() {
		return from;
	}

	public void setFrom(float from) {
		this.from = from;
	}

	public float getTo() {
		return to;
	}

	public void setTo(float to) {
		this.to = to;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "MatchInputJsonPowerPlay [from=" + from + ", to=" + to + ", type=" + type + "]";
	}

}
