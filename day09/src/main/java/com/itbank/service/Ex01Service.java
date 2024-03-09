package com.itbank.service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class Ex01Service {
	// 공공데이터포털, 부산 축제 정보
	
	private final String serviceKey = "PqtrAzOuvlzRm1uKPctGTXV1FraWwfq9wGiAv1WVx4Vo1jX71c9k1HTKAK4TVbZaJy6Jl9jCQ8yCHByr16HXmQ%3D%3D";
	
	public String getFestivalJson() throws MalformedURLException, IOException {
		// 1) 요청 주소 및 파라미터 준비
		String url = "https://apis.data.go.kr/6260000/FestivalService/getFestivalKr";
		HashMap<String, String> param = new HashMap<>();
		param.put("pageNo", "1");
		param.put("numOfRows", "10");
		param.put("resultType", "json");
		param.put("serviceKey", serviceKey);
		url += "?";
		for(String key : param.keySet()) {
			url += key + "=" + param.get(key) + "&";
		}
		
		// 2) 요청을 전송하여 응답을 받아서 저장
		Scanner sc = null;
		String response = "";
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		
		if(conn.getResponseCode() == 200) {	// 정상
			sc = new Scanner(conn.getInputStream());
			while(sc.hasNextLine()) {
				response += sc.nextLine();
			}
			sc.close();
			conn.disconnect();
		}
		
		return response;
	}

}
