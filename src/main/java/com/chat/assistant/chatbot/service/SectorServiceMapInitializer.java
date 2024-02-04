package com.chat.assistant.chatbot.service;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class SectorServiceMapInitializer {

	private final Map<String, SectorService> serviceMap;

	public SectorServiceMapInitializer(List<SectorService> services) {
		// Initialize the serviceMap using a Map constructor
		serviceMap = services.stream()
				.collect(Collectors.toMap(
						service -> service.getIdentity().getType(),
						Function.identity()));
	}

	public Map<String, SectorService> getServiceMap() {
		return serviceMap;
	}
}
