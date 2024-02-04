package com.chat.assistant.chatbot.model.ipl;

public class MatchInputJsonOutcomeBy {
	private int innings;
	private int runs;
	private int wickets;

	@Override
	public String toString() {
		return "MatchInputJsonOutcomeBy [innings=" + innings + ", runs=" + runs + ", wickets=" + wickets + "]";
	}

	public int getInnings() {
		return innings;
	}

	public void setInnings(int innings) {
		this.innings = innings;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
}
