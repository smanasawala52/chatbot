package com.chat.assistant.chatbot.model.ipl;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class MatchInputJsonInfo {
	private int ballsPerOver;
	private List<MatchInputJsonInfoBowlOut> bowlOut;
	private String city;
	private List<Date> dates;
	private MatchInputJsonInfoEvent event;
	private String gender;
	private String matchType;
	private int matchTypeNumber;
	private List<Object> missing;
	private MatchInputJsonInfoOfficials officials;
	private MatchInputJsonOutcome outcome;
	private int overs;
	private List<String> playerOfMatch;
	private Map<String, List<String>> players;
	private String season;
	private String teamType;
	private List<String> teams;
	private MatchInputJsonInfoToss toss;
	private String venue;

	public int getBallsPerOver() {
		return ballsPerOver;
	}

	public void setBallsPerOver(int ballsPerOver) {
		this.ballsPerOver = ballsPerOver;
	}

	public List<MatchInputJsonInfoBowlOut> getBowlOut() {
		return bowlOut;
	}

	public void setBowlOut(List<MatchInputJsonInfoBowlOut> bowlOut) {
		this.bowlOut = bowlOut;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Date> getDates() {
		return dates;
	}

	public void setDates(List<Date> dates) {
		this.dates = dates;
	}

	public MatchInputJsonInfoEvent getEvent() {
		return event;
	}

	public void setEvent(MatchInputJsonInfoEvent event) {
		this.event = event;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMatchType() {
		return matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public int getMatchTypeNumber() {
		return matchTypeNumber;
	}

	public void setMatchTypeNumber(int matchTypeNumber) {
		this.matchTypeNumber = matchTypeNumber;
	}

	public List<Object> getMissing() {
		return missing;
	}

	public void setMissing(List<Object> missing) {
		this.missing = missing;
	}

	public MatchInputJsonInfoOfficials getOfficials() {
		return officials;
	}

	public void setOfficials(MatchInputJsonInfoOfficials officials) {
		this.officials = officials;
	}

	public MatchInputJsonOutcome getOutcome() {
		return outcome;
	}

	public void setOutcome(MatchInputJsonOutcome outcome) {
		this.outcome = outcome;
	}

	public int getOvers() {
		return overs;
	}

	public void setOvers(int overs) {
		this.overs = overs;
	}

	public List<String> getPlayerOfMatch() {
		return playerOfMatch;
	}

	public void setPlayerOfMatch(List<String> playerOfMatch) {
		this.playerOfMatch = playerOfMatch;
	}

	public Map<String, List<String>> getPlayers() {
		return players;
	}

	public void setPlayers(Map<String, List<String>> players) {
		this.players = players;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getTeamType() {
		return teamType;
	}

	public void setTeamType(String teamType) {
		this.teamType = teamType;
	}

	public List<String> getTeams() {
		return teams;
	}

	public void setTeams(List<String> teams) {
		this.teams = teams;
	}

	public MatchInputJsonInfoToss getToss() {
		return toss;
	}

	public void setToss(MatchInputJsonInfoToss toss) {
		this.toss = toss;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	@Override
	public String toString() {
		return "MatchInputJsonInfo [ballsPerOver=" + ballsPerOver + ", bowlOut=" + bowlOut + ", city=" + city
				+ ", dates=" + dates + ", event=" + event + ", gender=" + gender + ", matchType=" + matchType
				+ ", matchTypeNumber=" + matchTypeNumber + ", missing=" + missing + ", officials=" + officials
				+ ", outcome=" + outcome + ", overs=" + overs + ", playerOfMatch=" + playerOfMatch + ", players="
				+ players + ", season=" + season + ", teamType=" + teamType + ", teams=" + teams + ", toss=" + toss
				+ ", venue=" + venue + "]";
	}
}
