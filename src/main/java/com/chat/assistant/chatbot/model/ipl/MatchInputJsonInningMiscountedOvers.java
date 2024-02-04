package com.chat.assistant.chatbot.model.ipl;

public class MatchInputJsonInningMiscountedOvers {
	private int balls;
	private String umpire;

	public int getBalls() {
		return balls;
	}

	public void setBalls(int balls) {
		this.balls = balls;
	}

	public String getUmpire() {
		return umpire;
	}

	public void setUmpire(String umpire) {
		this.umpire = umpire;
	}

	@Override
	public String toString() {
		return "MatchInputJsonInningMiscountedOvers [balls=" + balls + ", umpire=" + umpire + "]";
	}

}
