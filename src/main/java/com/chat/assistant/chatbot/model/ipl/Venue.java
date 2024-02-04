package com.chat.assistant.chatbot.model.ipl;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Venue {
	private long id;
	private String name;
	private String city;
	private long totalMatches;
	private long totalWins;
	private long totalTies;
	private long totalNoResult;
	private long totalTossWinBatFirst;
	private long totalTossWinFieldFirst;
	private long totalWinsBatFirst;
	private long totalWinsFieldFirst;
	private long totalWinsByWikets;
	private long totalWinsByRuns;
	private SortedSet<String> teams = new TreeSet<>();

	private List<Match> matches;

	@Override
	public String toString() {
		return "Venue [id=" + id + ", name=" + name + ", city=" + city
				+ ", totalMatches=" + totalMatches + ", totalWins=" + totalWins
				+ ", totalTies=" + totalTies + ", totalNoResult="
				+ totalNoResult + ", totalTossWinBatFirst="
				+ totalTossWinBatFirst + ", totalTossWinFieldFirst="
				+ totalTossWinFieldFirst + ", totalWinsBatFirst="
				+ totalWinsBatFirst + ", totalWinsFieldFirst="
				+ totalWinsFieldFirst + ", totalWinsByWikets="
				+ totalWinsByWikets + ", totalWinsByRuns=" + totalWinsByRuns
				+ ", matches=" + matches + ", teams=" + teams + "]";
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the totalMatches
	 */
	public long getTotalMatches() {
		return totalMatches;
	}

	/**
	 * @param totalMatches
	 *            the totalMatches to set
	 */
	public void setTotalMatches(long totalMatches) {
		this.totalMatches = totalMatches;
	}

	/**
	 * @return the totalWins
	 */
	public long getTotalWins() {
		return totalWins;
	}

	/**
	 * @param totalWins
	 *            the totalWins to set
	 */
	public void setTotalWins(long totalWins) {
		this.totalWins = totalWins;
	}

	/**
	 * @return the totalTies
	 */
	public long getTotalTies() {
		return totalTies;
	}

	/**
	 * @param totalTies
	 *            the totalTies to set
	 */
	public void setTotalTies(long totalTies) {
		this.totalTies = totalTies;
	}

	/**
	 * @return the totalNoResult
	 */
	public long getTotalNoResult() {
		return totalNoResult;
	}

	/**
	 * @param totalNoResult
	 *            the totalNoResult to set
	 */
	public void setTotalNoResult(long totalNoResult) {
		this.totalNoResult = totalNoResult;
	}

	/**
	 * @return the totalTossWinBatFirst
	 */
	public long getTotalTossWinBatFirst() {
		return totalTossWinBatFirst;
	}

	/**
	 * @param totalTossWinBatFirst
	 *            the totalTossWinBatFirst to set
	 */
	public void setTotalTossWinBatFirst(long totalTossWinBatFirst) {
		this.totalTossWinBatFirst = totalTossWinBatFirst;
	}

	/**
	 * @return the totalTossWinFieldFirst
	 */
	public long getTotalTossWinFieldFirst() {
		return totalTossWinFieldFirst;
	}

	/**
	 * @param totalTossWinFieldFirst
	 *            the totalTossWinFieldFirst to set
	 */
	public void setTotalTossWinFieldFirst(long totalTossWinFieldFirst) {
		this.totalTossWinFieldFirst = totalTossWinFieldFirst;
	}

	/**
	 * @return the totalWinsBatFirst
	 */
	public long getTotalWinsBatFirst() {
		return totalWinsBatFirst;
	}

	/**
	 * @param totalWinsBatFirst
	 *            the totalWinsBatFirst to set
	 */
	public void setTotalWinsBatFirst(long totalWinsBatFirst) {
		this.totalWinsBatFirst = totalWinsBatFirst;
	}

	/**
	 * @return the totalWinsFieldFirst
	 */
	public long getTotalWinsFieldFirst() {
		return totalWinsFieldFirst;
	}

	/**
	 * @param totalWinsFieldFirst
	 *            the totalWinsFieldFirst to set
	 */
	public void setTotalWinsFieldFirst(long totalWinsFieldFirst) {
		this.totalWinsFieldFirst = totalWinsFieldFirst;
	}

	/**
	 * @return the totalWinsByWikets
	 */
	public long getTotalWinsByWikets() {
		return totalWinsByWikets;
	}

	/**
	 * @param totalWinsByWikets
	 *            the totalWinsByWikets to set
	 */
	public void setTotalWinsByWikets(long totalWinsByWikets) {
		this.totalWinsByWikets = totalWinsByWikets;
	}

	/**
	 * @return the totalWinsByRuns
	 */
	public long getTotalWinsByRuns() {
		return totalWinsByRuns;
	}

	/**
	 * @param totalWinsByRuns
	 *            the totalWinsByRuns to set
	 */
	public void setTotalWinsByRuns(long totalWinsByRuns) {
		this.totalWinsByRuns = totalWinsByRuns;
	}

	/**
	 * @return the matches
	 */
	public List<Match> getMatches() {
		return matches;
	}

	/**
	 * @param matches
	 *            the matches to set
	 */
	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}

	/**
	 * @return the teams
	 */
	public SortedSet<String> getTeams() {
		return teams;
	}

	/**
	 * @param teams
	 *            the teams to set
	 */
	public void setTeams(SortedSet<String> teams) {
		this.teams = teams;
	}
}
