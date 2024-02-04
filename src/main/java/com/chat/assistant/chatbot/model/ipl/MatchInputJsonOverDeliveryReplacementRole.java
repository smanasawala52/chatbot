package com.chat.assistant.chatbot.model.ipl;

public class MatchInputJsonOverDeliveryReplacementRole {
	private String in;
	private String out;
	private String reason;
	private String role;

	public String getIn() {
		return in;
	}

	public void setIn(String in) {
		this.in = in;
	}

	public String getOut() {
		return out;
	}

	public void setOut(String out) {
		this.out = out;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "MatchInputJsonOverDeliveryReplacementRole [in=" + in + ", out=" + out + ", reason=" + reason + ", role="
				+ role + "]";
	}

}
