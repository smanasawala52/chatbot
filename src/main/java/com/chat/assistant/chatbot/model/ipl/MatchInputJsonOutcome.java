package com.chat.assistant.chatbot.model.ipl;

public class MatchInputJsonOutcome {
	private MatchInputJsonOutcomeBy by;
	private String bowlOut;
	private String eliminator;
	private String method;
	private String result;
	private String winner;

	public MatchInputJsonOutcomeBy getBy() {
		return by;
	}

	public void setBy(MatchInputJsonOutcomeBy by) {
		this.by = by;
	}

	public String getBowlOut() {
		return bowlOut;
	}

	public void setBowlOut(String bowlOut) {
		this.bowlOut = bowlOut;
	}

	public String getEliminator() {
		return eliminator;
	}

	public void setEliminator(String eliminator) {
		this.eliminator = eliminator;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	@Override
	public String toString() {
		return "MatchInputJsonOutcome [by=" + by + ", bowlOut=" + bowlOut + ", eliminator=" + eliminator + ", method="
				+ method + ", result=" + result + ", winner=" + winner + "]";
	}
}
