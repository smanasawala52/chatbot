package com.chat.assistant.chatbot.model.ipl;

import java.util.List;
import java.util.Map;

public class MatchInputJsonOverDeliveryWicket {
	// bowled, caught, caught and bowled, lbw, stumped, run out, retired hurt, hit
	// wicket, obstructing the field, hit the ball twice, handled the ball, or timed
	// out.
	private String kind;
	private String playerOut;
	private List<Map<String, String>> fielders;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getPlayerOut() {
		return playerOut;
	}

	public void setPlayerOut(String playerOut) {
		this.playerOut = playerOut;
	}

	public List<Map<String, String>> getFielders() {
		return fielders;
	}

	public void setFielders(List<Map<String, String>> fielders) {
		this.fielders = fielders;
	}

	@Override
	public String toString() {
		return "MatchInputJsonOverDeliveryWicket [kind=" + kind + ", playerOut=" + playerOut + ", fielders=" + fielders
				+ "]";
	}

}
