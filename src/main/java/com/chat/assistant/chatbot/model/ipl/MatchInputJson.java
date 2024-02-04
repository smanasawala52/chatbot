package com.chat.assistant.chatbot.model.ipl;

import java.util.List;

public class MatchInputJson {
	private MatchInputJsonInfo info;
	private List<MatchInputJsonInning> innings;

	public MatchInputJsonInfo getInfo() {
		return info;
	}

	public void setInfo(MatchInputJsonInfo info) {
		this.info = info;
	}

	public List<MatchInputJsonInning> getInnings() {
		return innings;
	}

	public void setInnings(List<MatchInputJsonInning> innings) {
		this.innings = innings;
	}

	@Override
	public String toString() {
		return "MatchInputJson [info=" + info + ", innings=" + innings + "]";
	}

}
