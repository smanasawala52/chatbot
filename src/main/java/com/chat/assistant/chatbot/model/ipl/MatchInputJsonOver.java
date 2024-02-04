package com.chat.assistant.chatbot.model.ipl;

import java.util.List;

public class MatchInputJsonOver {
	private int over;
	private List<MatchInputJsonOverDelivery> deliveries;

	public int getOver() {
		return over;
	}

	public void setOver(int over) {
		this.over = over;
	}

	public List<MatchInputJsonOverDelivery> getDeliveries() {
		return deliveries;
	}

	public void setDeliveries(List<MatchInputJsonOverDelivery> deliveries) {
		this.deliveries = deliveries;
	}

	@Override
	public String toString() {
		return "MatchInputJsonOver [over=" + over + ", deliveries=" + deliveries + "]";
	}
}
