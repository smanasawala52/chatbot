package com.chat.assistant.chatbot.model.ipl;

import java.util.List;

public class MatchInputJsonOverDeliveryReplacement {
	private List<MatchInputJsonOverDeliveryReplacementMatch> match;
	private List<MatchInputJsonOverDeliveryReplacementRole> role;

	public List<MatchInputJsonOverDeliveryReplacementMatch> getMatch() {
		return match;
	}

	public void setMatch(List<MatchInputJsonOverDeliveryReplacementMatch> match) {
		this.match = match;
	}

	public List<MatchInputJsonOverDeliveryReplacementRole> getRole() {
		return role;
	}

	public void setRole(List<MatchInputJsonOverDeliveryReplacementRole> role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "MatchInputJsonOverDeliveryReplacement [match=" + match + ", role=" + role + "]";
	}

}
