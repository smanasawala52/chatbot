package com.chat.assistant.chatbot.model.ipl;

public class MatchInputJsonOverDeliveryReplacementMatch {
	private String in;
	private String out;
	private String reason;
	private String team;

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

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "MatchInputJsonOverDeliveryReplacementMatch [in=" + in + ", out=" + out + ", reason=" + reason
				+ ", team=" + team + "]";
	}

}
