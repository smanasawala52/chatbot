package com.chat.assistant.chatbot.model.ipl;

import java.util.Arrays;

public class VenueBuilder {

	private Venue venue = new Venue();

	public VenueBuilder() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public Venue build() {
		return this.venue;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public VenueBuilder setId(long id) {
		this.venue.setId(id);
		return this;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public VenueBuilder setCity(String city) {
		this.venue.setCity(city);
		return this;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public VenueBuilder setName(String name) {
		this.venue.setName(name);
		return this;
	}

	/**
	 * @param totalMatches
	 *            the totalMatches to set
	 */
	public VenueBuilder setTotalMatches(long totalMatches) {
		this.venue.setTotalMatches(totalMatches);
		return this;
	}

	/**
	 * @param totalWins
	 *            the totalWins to set
	 */
	public VenueBuilder setTotalWins(long totalWins) {
		this.venue.setTotalWins(totalWins);
		return this;
	}

	/**
	 * @param totalTies
	 *            the totalTies to set
	 */
	public VenueBuilder setTotalTies(long totalTies) {
		this.venue.setTotalTies(totalTies);
		return this;
	}

	/**
	 * @param totalNoResult
	 *            the totalNoResult to set
	 */
	public VenueBuilder setTotalNoResult(long totalNoResult) {
		this.venue.setTotalNoResult(totalNoResult);
		return this;
	}

	/**
	 * @param totalTossWinBatFirst
	 *            the totalTossWinBatFirst to set
	 */
	public VenueBuilder setTotalTossWinBatFirst(long totalTossWinBatFirst) {
		this.venue.setTotalTossWinBatFirst(totalTossWinBatFirst);
		return this;
	}

	/**
	 * @param totalTossWinFieldFirst
	 *            the totalTossWinFieldFirst to set
	 */
	public VenueBuilder setTotalTossWinFieldFirst(long totalTossWinFieldFirst) {
		this.venue.setTotalTossWinFieldFirst(totalTossWinFieldFirst);
		return this;
	}

	/**
	 * @param totalWinsBatFirst
	 *            the totalWinsBatFirst to set
	 */
	public VenueBuilder setTotalWinsBatFirst(long totalWinsBatFirst) {
		this.venue.setTotalWinsBatFirst(totalWinsBatFirst);
		return this;
	}

	/**
	 * @param totalWinsFieldFirst
	 *            the totalWinsFieldFirst to set
	 */
	public VenueBuilder setTotalWinsFieldFirst(long totalWinsFieldFirst) {
		this.venue.setTotalWinsFieldFirst(totalWinsFieldFirst);
		return this;
	}

	/**
	 * @param totalWinsByWikets
	 *            the totalWinsByWikets to set
	 */
	public VenueBuilder setTotalWinsByWikets(long totalWinsByWikets) {
		this.venue.setTotalWinsByWikets(totalWinsByWikets);
		return this;
	}

	/**
	 * @param totalWinsByWikets
	 *            the totalWinsByWikets to set
	 */
	public VenueBuilder setTeams(String teams) {
		if (teams != null) {
			this.venue.getTeams().addAll(Arrays.asList(teams.split(",")));
		}
		return this;
	}

	/**
	 * @param totalWinsByRuns
	 *            the totalWinsByRuns to set
	 */
	public VenueBuilder setTotalWinsByRuns(long totalWinsByRuns) {
		this.venue.setTotalWinsByRuns(totalWinsByRuns);
		return this;
	}

}
