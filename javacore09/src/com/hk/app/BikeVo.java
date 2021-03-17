package com.hk.app;

public class BikeVo {
	
	// 속성정의
	int wheel;
	String engineType; /*  페달, 전기, 하이브리드 */
	String sn;
	
	// 기능정의
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public int getWheel() {
		return wheel;
	}
	public void setEngineType(String type) {
		engineType = type;
	}
	public String getEngineType() {
		return engineType;
	}
	
	// 모든 클래스는 반드시 하나이상의 생성자 있다
	// BikeVo() { } <= 기본생성자 요거임
	// 기본생성자를 안만들면 자동 생성
	BikeVo() { 
		wheel = 2; // 보통 자전거는 휠이 2개
		engineType = "페달";
	}  // 직접 입력

	BikeVo(int w) {
		wheel = w;
	}
	
	BikeVo(String type) {
		//engineType = type;
		//BikeVo(4, type);
		this(4, type);
	}
	
	BikeVo(int w, String type) {
		wheel = w;
		engineType = type;
	}
}
