package com.chat.assistant.chatbot.model.ipl;

public class MatchInputJsonTarget {
	private int overs;
	private int runs;

	public int getOvers() {
		return overs;
	}

	public void setOvers(int overs) {
		this.overs = overs;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	@Override
	public String toString() {
		return "MatchInputJsonTarget [overs=" + overs + ", runs=" + runs + "]";
	}
}
