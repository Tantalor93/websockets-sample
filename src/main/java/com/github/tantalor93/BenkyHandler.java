package com.github.tantalor93;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class BenkyHandler extends TextWebSocketHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(BenkyHandler.class);

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		LOGGER.info("Incoming message '{}'", message.getPayload());
		session.sendMessage(new TextMessage("server received"));
	}
}
