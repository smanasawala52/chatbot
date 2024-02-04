package com.chat.assistant.chatbot.model.ipl;

public interface ITeamCount {
	String getTeamName();
	Long getTotalMatches();
	Long getTotalWins();
	Long getTotalTies();
	Long getTotalNoResult();
	Long getTotalTossWins();
	Long getTotalTossWinBatFirst();
	Long getTotalTossWinFieldFirst();
	Long getTotalBatFirst();
	Long getTotalFieldFirst();
	Long getTotalWinsBatFirst();
	Long getTotalWinsFieldFirst();
	Long getTotalWinsByRuns();
	Long getTotalWinsByWikets();
	String getTeams();
}
