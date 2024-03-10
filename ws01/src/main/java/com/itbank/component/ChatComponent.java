package com.itbank.component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

// pom.xml에서 라이브러리를 가져와야 상속을 받을 수 있다
public class ChatComponent extends TextWebSocketHandler{

	// 저장 - source - Override/Implements Method
	
	List<WebSocketSession> sessionList = new ArrayList<WebSocketSession>();
	
	@Override	// 연결이 성립된 이후 실행되는 함수
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		System.out.println("연결 생성 : " + session);
		sessionList.add(session);
	}

	@Override	// 텍스트 메시지를 전송받았을 때 실행되는 함수
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		System.out.printf("메시지 받음 : [%s] : %s\n", session, message);
		
		for(WebSocketSession ws : sessionList) {	// 세션리스트에 참여하는 모든 웹소켓에게
			ws.sendMessage(message);				// 받은 메시지를 다시 보낸다 (서버에서 클라이언트에게)
		}
	}

	@Override	// 연결이 끊어졌을 때 실행되는 함수
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		System.out.println("연결 종료 : " + session);
		sessionList.remove(session);
	}

	
	
}
