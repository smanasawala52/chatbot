package com.chat.assistant.chatbot.controller.mall;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {

	@GetMapping("/")
	public String showHomeMall() {
		return "homeMall";
	}

	@GetMapping("/ipl")
	public String showHomeIPL() {
		return "homeIPL";
	}

	@GetMapping("/global")
	public String showHomeGlobalIndustrial() {
		return "homeGlobalIndustrial";
	}

	@GetMapping("/homeSendAudioUsingWebSocket")
	public String showHomeSendAudioUsingWebSocketPage() {
		return "homeSendAudioUsingWebSocket";
	}

	@GetMapping("/homeSendTextUsingWebSocket")
	public String showHomeSendTextUsingWebSocketPage() {
		return "homeSendTextUsingWebSocket";
	}
	@GetMapping("/homeFullAudioDemo")
	public String showHomeFullAudioDemoPage() {
		return "homeFullAudioDemo";
	}
	@GetMapping("/stream")
	public String showStreamPage() {
		return "stream";
	}
}
