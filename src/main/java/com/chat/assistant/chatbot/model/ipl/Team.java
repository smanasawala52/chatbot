package com.chat.assistant.chatbot.model.ipl;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Team implements Comparable<Team> {
	private long id;
	private String name;
	private long totalMatches;
	private long totalWins;
	private double totalWinsPercent;
	private long totalTies;
	private long totalNoResult;
	private long totalTossWins;
	private double totalTossWinsPercent;
	private long totalTossWinBatFirst;
	private double totalTossWinBatFirstPercent;
	private long totalTossWinFieldFirst;
	private double totalTossWinFieldFirstPercent;
	private long totalBatFirst;
	private double totalBatFirstPercent;
	private long totalFieldFirst;
	private double totalFieldFirstPercent;
	private long totalWinsBatFirst;
	private double totalWinsBatFirstPercent;
	private long totalWinsFieldFirst;
	private double totalWinsFieldFirstPercent;
	private long totalWinsByWikets;
	private double totalWinsByWiketsPercent;
	private long totalWinsByRuns;
	private double totalWinsByRunsPercent;
	private Page<Match> matches;
	private SortedSet<Team> teams = new TreeSet<>();
	private SortedSet<String> venues = new TreeSet<>();
	private SortedSet<String> seasons = new TreeSet<>();
	private Map<String, Integer> eventStage = new TreeMap<>();
	private SortedSet<String> eventGroup = new TreeSet<>();
	private SortedSet<String> eventMatchNumber = new TreeSet<>();

	@Override
	public int compareTo(Team o) {
		if (this != null && o != null && this.name != null && o.name != null) {
			return this.name.compareTo(o.name);
		}
		return 0;
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
	 * @return the totalWinsPercent
	 */
	public double getTotalWinsPercent() {
		return totalWinsPercent;
	}
	/**
	 * @param totalWinsPercent
	 *            the totalWinsPercent to set
	 */
	public void setTotalWinsPercent(double totalWinsPercent) {
		this.totalWinsPercent = totalWinsPercent;
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
	 * @return the totalTossWins
	 */
	public long getTotalTossWins() {
		return totalTossWins;
	}
	/**
	 * @param totalTossWins
	 *            the totalTossWins to set
	 */
	public void setTotalTossWins(long totalTossWins) {
		this.totalTossWins = totalTossWins;
	}
	/**
	 * @return the totalTossWinsPercent
	 */
	public double getTotalTossWinsPercent() {
		return totalTossWinsPercent;
	}
	/**
	 * @param totalTossWinsPercent
	 *            the totalTossWinsPercent to set
	 */
	public void setTotalTossWinsPercent(double totalTossWinsPercent) {
		this.totalTossWinsPercent = totalTossWinsPercent;
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
	 * @return the totalTossWinBatFirstPercent
	 */
	public double getTotalTossWinBatFirstPercent() {
		return totalTossWinBatFirstPercent;
	}
	/**
	 * @param totalTossWinBatFirstPercent
	 *            the totalTossWinBatFirstPercent to set
	 */
	public void setTotalTossWinBatFirstPercent(
			double totalTossWinBatFirstPercent) {
		this.totalTossWinBatFirstPercent = totalTossWinBatFirstPercent;
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
	 * @return the totalTossWinFieldFirstPercent
	 */
	public double getTotalTossWinFieldFirstPercent() {
		return totalTossWinFieldFirstPercent;
	}
	/**
	 * @param totalTossWinFieldFirstPercent
	 *            the totalTossWinFieldFirstPercent to set
	 */
	public void setTotalTossWinFieldFirstPercent(
			double totalTossWinFieldFirstPercent) {
		this.totalTossWinFieldFirstPercent = totalTossWinFieldFirstPercent;
	}
	/**
	 * @return the totalBatFirst
	 */
	public long getTotalBatFirst() {
		return totalBatFirst;
	}
	/**
	 * @param totalBatFirst
	 *            the totalBatFirst to set
	 */
	public void setTotalBatFirst(long totalBatFirst) {
		this.totalBatFirst = totalBatFirst;
	}
	/**
	 * @return the totalBatFirstPercent
	 */
	public double getTotalBatFirstPercent() {
		return totalBatFirstPercent;
	}
	/**
	 * @param totalBatFirstPercent
	 *            the totalBatFirstPercent to set
	 */
	public void setTotalBatFirstPercent(double totalBatFirstPercent) {
		this.totalBatFirstPercent = totalBatFirstPercent;
	}
	/**
	 * @return the totalFieldFirst
	 */
	public long getTotalFieldFirst() {
		return totalFieldFirst;
	}
	/**
	 * @param totalFieldFirst
	 *            the totalFieldFirst to set
	 */
	public void setTotalFieldFirst(long totalFieldFirst) {
		this.totalFieldFirst = totalFieldFirst;
	}
	/**
	 * @return the totalFieldFirstPercent
	 */
	public double getTotalFieldFirstPercent() {
		return totalFieldFirstPercent;
	}
	/**
	 * @param totalFieldFirstPercent
	 *            the totalFieldFirstPercent to set
	 */
	public void setTotalFieldFirstPercent(double totalFieldFirstPercent) {
		this.totalFieldFirstPercent = totalFieldFirstPercent;
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
	 * @return the totalWinsBatFirstPercent
	 */
	public double getTotalWinsBatFirstPercent() {
		return totalWinsBatFirstPercent;
	}
	/**
	 * @param totalWinsBatFirstPercent
	 *            the totalWinsBatFirstPercent to set
	 */
	public void setTotalWinsBatFirstPercent(double totalWinsBatFirstPercent) {
		this.totalWinsBatFirstPercent = totalWinsBatFirstPercent;
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
	 * @return the totalWinsFieldFirstPercent
	 */
	public double getTotalWinsFieldFirstPercent() {
		return totalWinsFieldFirstPercent;
	}
	/**
	 * @param totalWinsFieldFirstPercent
	 *            the totalWinsFieldFirstPercent to set
	 */
	public void setTotalWinsFieldFirstPercent(
			double totalWinsFieldFirstPercent) {
		this.totalWinsFieldFirstPercent = totalWinsFieldFirstPercent;
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
	 * @return the totalWinsByWiketsPercent
	 */
	public double getTotalWinsByWiketsPercent() {
		return totalWinsByWiketsPercent;
	}
	/**
	 * @param totalWinsByWiketsPercent
	 *            the totalWinsByWiketsPercent to set
	 */
	public void setTotalWinsByWiketsPercent(double totalWinsByWiketsPercent) {
		this.totalWinsByWiketsPercent = totalWinsByWiketsPercent;
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
	 * @return the totalWinsByRunsPercent
	 */
	public double getTotalWinsByRunsPercent() {
		return totalWinsByRunsPercent;
	}
	/**
	 * @param totalWinsByRunsPercent
	 *            the totalWinsByRunsPercent to set
	 */
	public void setTotalWinsByRunsPercent(double totalWinsByRunsPercent) {
		this.totalWinsByRunsPercent = totalWinsByRunsPercent;
	}
	/**
	 * @return the matches
	 */
	public Page<Match> getMatches() {
		return matches;
	}
	/**
	 * @param matches
	 *            the matches to set
	 */
	public void setMatches(Page<Match> matches) {
		this.matches = matches;
	}
	/**
	 * @return the teams
	 */
	public SortedSet<Team> getTeams() {
		return teams;
	}
	/**
	 * @param teams
	 *            the teams to set
	 */
	public void setTeams(SortedSet<Team> teams) {
		this.teams = teams;
	}
	/**
	 * @return the venues
	 */
	public SortedSet<String> getVenues() {
		return venues;
	}
	/**
	 * @param venues
	 *            the venues to set
	 */
	public void setVenues(SortedSet<String> venues) {
		this.venues = venues;
	}
	/**
	 * @return the seasons
	 */
	public SortedSet<String> getSeasons() {
		return seasons;
	}
	/**
	 * @param seasons
	 *            the seasons to set
	 */
	public void setSeasons(SortedSet<String> seasons) {
		this.seasons = seasons;
	}

	/**
	 * @return the eventStage
	 */
	public Map<String, Integer> getEventStage() {
		return eventStage;
	}

	/**
	 * @param eventStage
	 *            the eventStage to set
	 */
	public void setEventStage(Map<String, Integer> eventStage) {
		this.eventStage = eventStage;
	}

	/**
	 * @return the eventGroup
	 */
	public SortedSet<String> getEventGroup() {
		return eventGroup;
	}

	/**
	 * @param eventGroup
	 *            the eventGroup to set
	 */
	public void setEventGroup(SortedSet<String> eventGroup) {
		this.eventGroup = eventGroup;
	}

	/**
	 * @return the eventMatchNumber
	 */
	public SortedSet<String> getEventMatchNumber() {
		return eventMatchNumber;
	}

	/**
	 * @param eventMatchNumber
	 *            the eventMatchNumber to set
	 */
	public void setEventMatchNumber(SortedSet<String> eventMatchNumber) {
		this.eventMatchNumber = eventMatchNumber;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", totalMatches="
				+ totalMatches + ", totalWins=" + totalWins
				+ ", totalWinsPercent=" + totalWinsPercent + ", totalTies="
				+ totalTies + ", totalNoResult=" + totalNoResult
				+ ", totalTossWins=" + totalTossWins + ", totalTossWinsPercent="
				+ totalTossWinsPercent + ", totalTossWinBatFirst="
				+ totalTossWinBatFirst + ", totalTossWinBatFirstPercent="
				+ totalTossWinBatFirstPercent + ", totalTossWinFieldFirst="
				+ totalTossWinFieldFirst + ", totalTossWinFieldFirstPercent="
				+ totalTossWinFieldFirstPercent + ", totalBatFirst="
				+ totalBatFirst + ", totalBatFirstPercent="
				+ totalBatFirstPercent + ", totalFieldFirst=" + totalFieldFirst
				+ ", totalFieldFirstPercent=" + totalFieldFirstPercent
				+ ", totalWinsBatFirst=" + totalWinsBatFirst
				+ ", totalWinsBatFirstPercent=" + totalWinsBatFirstPercent
				+ ", totalWinsFieldFirst=" + totalWinsFieldFirst
				+ ", totalWinsFieldFirstPercent=" + totalWinsFieldFirstPercent
				+ ", totalWinsByWikets=" + totalWinsByWikets
				+ ", totalWinsByWiketsPercent=" + totalWinsByWiketsPercent
				+ ", totalWinsByRuns=" + totalWinsByRuns
				+ ", totalWinsByRunsPercent=" + totalWinsByRunsPercent
				+ ", matches=" + matches + ", teams=" + teams + ", venues="
				+ venues + ", seasons=" + seasons + ", eventStage=" + eventStage
				+ ", eventGroup=" + eventGroup + ", eventMatchNumber="
				+ eventMatchNumber + "]";
	}
}
