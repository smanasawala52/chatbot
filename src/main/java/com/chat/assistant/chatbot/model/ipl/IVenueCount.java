package com.chat.assistant.chatbot.model.ipl;

public interface IVenueCount {
	String getVenueName();
	String getCity();
	Long getTotalMatches();
	Long getTotalWins();
	Long getTotalTies();
	Long getTotalNoResult();
	Long getTotalTossWinBatFirst();
	Long getTotalTossWinFieldFirst();
	Long getTotalWinsBatFirst();
	Long getTotalWinsFieldFirst();
	Long getTotalWinsByRuns();
	Long getTotalWinsByWikets();
	String getTeams();
}
