package com.chat.assistant.chatbot.model.ipl;

public class TeamBuilder {

	private Team team = new Team();

	public TeamBuilder() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public Team build() {
		return this.team;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public TeamBuilder setId(long id) {
		this.team.setId(id);
		return this;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public TeamBuilder setName(String name) {
		this.team.setName(name);
		return this;
	}

	/**
	 * @param totalMatches
	 *            the totalMatches to set
	 */
	public TeamBuilder setTotalMatches(long totalMatches) {
		this.team.setTotalMatches(totalMatches);
		this.team.setTotalWinsPercent(populateWinsPercent(
				this.team.getTotalWins(), this.team.getTotalMatches()));
		return this;
	}

	/**
	 * @param totalWins
	 *            the totalWins to set
	 */
	public TeamBuilder setTotalWins(long totalWins) {
		this.team.setTotalWins(totalWins);
		this.team.setTotalWinsPercent(populateWinsPercent(
				this.team.getTotalWins(), this.team.getTotalMatches()));
		return this;
	}

	/**
	 * @param totalTies
	 *            the totalTies to set
	 */
	public TeamBuilder setTotalTies(long totalTies) {
		this.team.setTotalTies(totalTies);
		return this;
	}

	/**
	 * @param totalNoResult
	 *            the totalNoResult to set
	 */
	public TeamBuilder setTotalNoResult(long totalNoResult) {
		this.team.setTotalNoResult(totalNoResult);
		return this;
	}

	/**
	 * @param totalTossWins
	 *            the totalTossWins to set
	 */
	public TeamBuilder setTotalTossWins(long totalTossWins) {
		this.team.setTotalTossWins(totalTossWins);
		return this;
	}

	/**
	 * @param totalTossWinBatFirst
	 *            the totalTossWinBatFirst to set
	 */
	public TeamBuilder setTotalTossWinBatFirst(long totalTossWinBatFirst) {
		this.team.setTotalTossWinBatFirst(totalTossWinBatFirst);
		return this;
	}

	/**
	 * @param totalTossWinFieldFirst
	 *            the totalTossWinFieldFirst to set
	 */
	public TeamBuilder setTotalTossWinFieldFirst(long totalTossWinFieldFirst) {
		this.team.setTotalTossWinFieldFirst(totalTossWinFieldFirst);
		return this;
	}

	/**
	 * @param totalBatFirst
	 *            the totalBatFirst to set
	 */
	public TeamBuilder setTotalBatFirst(long totalBatFirst) {
		this.team.setTotalBatFirst(totalBatFirst);
		return this;
	}

	/**
	 * @param totalFieldFirst
	 *            the totalFieldFirst to set
	 */
	public TeamBuilder setTotalFieldFirst(long totalFieldFirst) {
		this.team.setTotalFieldFirst(totalFieldFirst);
		return this;
	}

	/**
	 * @param totalWinsBatFirst
	 *            the totalWinsBatFirst to set
	 */
	public TeamBuilder setTotalWinsBatFirst(long totalWinsBatFirst) {
		this.team.setTotalWinsBatFirst(totalWinsBatFirst);
		return this;
	}

	/**
	 * @param totalWinsFieldFirst
	 *            the totalWinsFieldFirst to set
	 */
	public TeamBuilder setTotalWinsFieldFirst(long totalWinsFieldFirst) {
		this.team.setTotalWinsFieldFirst(totalWinsFieldFirst);
		return this;
	}

	/**
	 * @param totalWinsByWikets
	 *            the totalWinsByWikets to set
	 */
	public TeamBuilder setTotalWinsByWikets(long totalWinsByWikets) {
		this.team.setTotalWinsByWikets(totalWinsByWikets);
		return this;
	}

	/**
	 * @param totalWinsByRuns
	 *            the totalWinsByRuns to set
	 */
	public TeamBuilder setTotalWinsByRuns(long totalWinsByRuns) {
		this.team.setTotalWinsByRuns(totalWinsByRuns);
		return this;
	}

	private double populateWinsPercent(long totalWins, long totalMatches) {
		double totalWinsPercent = 0;
		if (totalWins > 0 && totalMatches > 0) {
			totalWinsPercent = (totalWins * 100 / totalMatches);
		}
		totalWinsPercent = (((int) totalWinsPercent * 100) / 100);
		return totalWinsPercent;
	}

}
