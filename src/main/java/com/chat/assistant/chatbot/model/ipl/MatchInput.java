package com.chat.assistant.chatbot.model.ipl;

public class MatchInput {
	private String id;
	private String city;
	private String date;
	private String player_of_match;
	private String venue;
	private String neutral_venue;
	private String team1;
	private String team2;
	private String toss_winner;
	private String toss_decision;
	private String winner;
	private String result;
	private String result_margin;
	private String eliminator;
	private String method;
	private String umpire1;
	private String umpire2;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the player_of_match
	 */
	public String getPlayer_of_match() {
		return player_of_match;
	}
	/**
	 * @param player_of_match
	 *            the player_of_match to set
	 */
	public void setPlayer_of_match(String player_of_match) {
		this.player_of_match = player_of_match;
	}
	/**
	 * @return the venue
	 */
	public String getVenue() {
		return venue;
	}
	/**
	 * @param venue
	 *            the venue to set
	 */
	public void setVenue(String venue) {
		this.venue = venue;
	}
	/**
	 * @return the neutral_venue
	 */
	public String getNeutral_venue() {
		return neutral_venue;
	}
	/**
	 * @param neutral_venue
	 *            the neutral_venue to set
	 */
	public void setNeutral_venue(String neutral_venue) {
		this.neutral_venue = neutral_venue;
	}
	/**
	 * @return the team1
	 */
	public String getTeam1() {
		return team1;
	}
	/**
	 * @param team1
	 *            the team1 to set
	 */
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	/**
	 * @return the team2
	 */
	public String getTeam2() {
		return team2;
	}
	/**
	 * @param team2
	 *            the team2 to set
	 */
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	/**
	 * @return the toss_winner
	 */
	public String getToss_winner() {
		return toss_winner;
	}
	/**
	 * @param toss_winner
	 *            the toss_winner to set
	 */
	public void setToss_winner(String toss_winner) {
		this.toss_winner = toss_winner;
	}
	/**
	 * @return the toss_decision
	 */
	public String getToss_decision() {
		return toss_decision;
	}
	/**
	 * @param toss_decision
	 *            the toss_decision to set
	 */
	public void setToss_decision(String toss_decision) {
		this.toss_decision = toss_decision;
	}
	/**
	 * @return the winner
	 */
	public String getWinner() {
		return winner;
	}
	/**
	 * @param winner
	 *            the winner to set
	 */
	public void setWinner(String winner) {
		this.winner = winner;
	}
	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}
	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}
	/**
	 * @return the result_margin
	 */
	public String getResult_margin() {
		return result_margin;
	}
	/**
	 * @param result_margin
	 *            the result_margin to set
	 */
	public void setResult_margin(String result_margin) {
		this.result_margin = result_margin;
	}
	/**
	 * @return the eliminator
	 */
	public String getEliminator() {
		return eliminator;
	}
	/**
	 * @param eliminator
	 *            the eliminator to set
	 */
	public void setEliminator(String eliminator) {
		this.eliminator = eliminator;
	}
	/**
	 * @return the method
	 */
	public String getMethod() {
		return method;
	}
	/**
	 * @param method
	 *            the method to set
	 */
	public void setMethod(String method) {
		this.method = method;
	}
	/**
	 * @return the umpire1
	 */
	public String getUmpire1() {
		return umpire1;
	}
	/**
	 * @param umpire1
	 *            the umpire1 to set
	 */
	public void setUmpire1(String umpire1) {
		this.umpire1 = umpire1;
	}
	/**
	 * @return the umpire2
	 */
	public String getUmpire2() {
		return umpire2;
	}
	/**
	 * @param umpire2
	 *            the umpire2 to set
	 */
	public void setUmpire2(String umpire2) {
		this.umpire2 = umpire2;
	}
	@Override
	public String toString() {
		return "MatchInput [id=" + id + ", city=" + city + ", date=" + date
				+ ", player_of_match=" + player_of_match + ", venue=" + venue
				+ ", neutral_venue=" + neutral_venue + ", team1=" + team1
				+ ", team2=" + team2 + ", toss_winner=" + toss_winner
				+ ", toss_decision=" + toss_decision + ", winner=" + winner
				+ ", result=" + result + ", result_margin=" + result_margin
				+ ", eliminator=" + eliminator + ", method=" + method
				+ ", umpire1=" + umpire1 + ", umpire2=" + umpire2 + "]";
	}

}
