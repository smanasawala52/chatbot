package com.chat.assistant.chatbot.model.ipl;

import java.util.List;

public class PageBuilder<T> {
	Page<T> page = new Page<T>();

	public PageBuilder<T> setContent(List<T> content) {
		this.page.setContent(content);
		return this;
	}

	public PageBuilder<T> setTotalPages(int totalPages) {
		this.page.setTotalPages(totalPages);
		return this;
	}

	public PageBuilder<T> setNumber(int number) {
		this.page.setNumber(number);
		return this;
	}

	public PageBuilder<T> setTotalElements(int totalElements) {
		this.page.setTotalElements(totalElements);
		return this;
	}

	public PageBuilder<T> setNumberOfElements(int numberOfElements) {
		this.page.setNumberOfElements(numberOfElements);
		return this;
	}

	public Page<T> build() {
		return page;
	}
}
