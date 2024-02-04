package com.chat.assistant.chatbot.model.ipl;

import java.util.List;

public class MatchInputJsonInfoOfficials {
	private List<String> matchReferees;
	private List<String> reserveUmpires;
	private List<String> tvUmpires;
	private List<String> umpires;

	public List<String> getMatchReferees() {
		return matchReferees;
	}

	public void setMatchReferees(List<String> matchReferees) {
		this.matchReferees = matchReferees;
	}

	public List<String> getReserveUmpires() {
		return reserveUmpires;
	}

	public void setReserveUmpires(List<String> reserveUmpires) {
		this.reserveUmpires = reserveUmpires;
	}

	public List<String> getTvUmpires() {
		return tvUmpires;
	}

	public void setTvUmpires(List<String> tvUmpires) {
		this.tvUmpires = tvUmpires;
	}

	public List<String> getUmpires() {
		return umpires;
	}

	public void setUmpires(List<String> umpires) {
		this.umpires = umpires;
	}

	@Override
	public String toString() {
		return "MatchInputJsonInfoOfficials [matchReferees=" + matchReferees + ", reserveUmpires=" + reserveUmpires
				+ ", tvUmpires=" + tvUmpires + ", umpires=" + umpires + "]";
	}

}
