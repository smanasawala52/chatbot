package com.chat.assistant.chatbot.model.ipl;

public class MatchInputJsonOverDeliveryReview {
	private String batter;
	private String by;
	private String decision;
	private String umpire;
	private boolean umpires_call;

	public String getBatter() {
		return batter;
	}

	public void setBatter(String batter) {
		this.batter = batter;
	}

	public String getBy() {
		return by;
	}

	public void setBy(String by) {
		this.by = by;
	}

	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}

	public String getUmpire() {
		return umpire;
	}

	public void setUmpire(String umpire) {
		this.umpire = umpire;
	}

	public boolean isUmpires_call() {
		return umpires_call;
	}

	public void setUmpires_call(boolean umpires_call) {
		this.umpires_call = umpires_call;
	}

	@Override
	public String toString() {
		return "MatchInputJsonOverDeliveryReview [batter=" + batter + ", by=" + by + ", decision=" + decision
				+ ", umpire=" + umpire + ", umpires_call=" + umpires_call + "]";
	}
}
