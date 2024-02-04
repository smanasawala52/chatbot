package com.chat.assistant.chatbot.model.ipl;

import java.util.List;

public class Page<T> {
	private List<T> content;
	private int totalPages;
	private int number;
	private int totalElements;
	private int numberOfElements;

	public List<T> getContent() {
		return content;
	}

	public void setContent(List<T> content) {
		this.content = content;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}

	public int getNumberOfElements() {
		return numberOfElements;
	}

	public void setNumberOfElements(int numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	@Override
	public String toString() {
		return "PageMatch [content=" + content + ", totalPages=" + totalPages + ", number=" + number
				+ ", totalElements=" + totalElements + ", numberOfElements=" + numberOfElements + "]";
	}

}
