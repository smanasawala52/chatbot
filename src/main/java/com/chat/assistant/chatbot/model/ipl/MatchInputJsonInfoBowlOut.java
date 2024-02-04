package com.chat.assistant.chatbot.model.ipl;

public class MatchInputJsonInfoBowlOut {
	private String bowler;
	private String outcome;

	public String getBowler() {
		return bowler;
	}

	public void setBowler(String bowler) {
		this.bowler = bowler;
	}

	public String getOutcome() {
		return outcome;
	}

	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

	@Override
	public String toString() {
		return "MatchInputJsonInfoBowlOut [bowler=" + bowler + ", outcome=" + outcome + "]";
	}
}
