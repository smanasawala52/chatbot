package com.chat.assistant.chatbot.model.ipl;

import java.util.List;
import java.util.Map;

public class MatchInputJsonInning {
	private String team;
	private List<MatchInputJsonOver> overs;
	private List<String> absentHurt;
	private Map<String, Integer> penaltyRuns;
	private boolean declared;
	private boolean forfeited;

	private List<MatchInputJsonPowerPlay> powerplays;
	private Map<String, MatchInputJsonInningMiscountedOvers> miscountedOvers;
	private MatchInputJsonTarget target;
	private boolean superOver;

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public List<MatchInputJsonOver> getOvers() {
		return overs;
	}

	public void setOvers(List<MatchInputJsonOver> overs) {
		this.overs = overs;
	}

	public List<String> getAbsentHurt() {
		return absentHurt;
	}

	public void setAbsentHurt(List<String> absentHurt) {
		this.absentHurt = absentHurt;
	}

	public Map<String, Integer> getPenaltyRuns() {
		return penaltyRuns;
	}

	public void setPenaltyRuns(Map<String, Integer> penaltyRuns) {
		this.penaltyRuns = penaltyRuns;
	}

	public boolean isDeclared() {
		return declared;
	}

	public void setDeclared(boolean declared) {
		this.declared = declared;
	}

	public boolean isForfeited() {
		return forfeited;
	}

	public void setForfeited(boolean forfeited) {
		this.forfeited = forfeited;
	}

	public List<MatchInputJsonPowerPlay> getPowerplays() {
		return powerplays;
	}

	public void setPowerplays(List<MatchInputJsonPowerPlay> powerplays) {
		this.powerplays = powerplays;
	}

	public Map<String, MatchInputJsonInningMiscountedOvers> getMiscountedOvers() {
		return miscountedOvers;
	}

	public void setMiscountedOvers(Map<String, MatchInputJsonInningMiscountedOvers> miscountedOvers) {
		this.miscountedOvers = miscountedOvers;
	}

	public MatchInputJsonTarget getTarget() {
		return target;
	}

	public void setTarget(MatchInputJsonTarget target) {
		this.target = target;
	}

	public boolean isSuperOver() {
		return superOver;
	}

	public void setSuperOver(boolean superOver) {
		this.superOver = superOver;
	}

	@Override
	public String toString() {
		return "MatchInputJsonInning [team=" + team + ", overs=" + overs + ", absentHurt=" + absentHurt
				+ ", penaltyRuns=" + penaltyRuns + ", declared=" + declared + ", forfeited=" + forfeited
				+ ", powerplays=" + powerplays + ", miscountedOvers=" + miscountedOvers + ", target=" + target
				+ ", superOver=" + superOver + "]";
	}

}
