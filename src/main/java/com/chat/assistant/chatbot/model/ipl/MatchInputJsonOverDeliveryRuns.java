package com.chat.assistant.chatbot.model.ipl;

public class MatchInputJsonOverDeliveryRuns {
	private int batsman;
	private int extras;
	private boolean nonBoundary;
	private int total;

	public int getBatsman() {
		return batsman;
	}

	public void setBatsman(int batsman) {
		this.batsman = batsman;
	}

	public int getExtras() {
		return extras;
	}

	public void setExtras(int extras) {
		this.extras = extras;
	}

	public boolean isNonBoundary() {
		return nonBoundary;
	}

	public void setNonBoundary(boolean nonBoundary) {
		this.nonBoundary = nonBoundary;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "MatchInputJsonOverDeliveryRuns [batsman=" + batsman + ", extras=" + extras + ", nonBoundary="
				+ nonBoundary + ", total=" + total + "]";
	}

}
