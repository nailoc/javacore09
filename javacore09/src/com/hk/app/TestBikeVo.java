package com.hk.app;

public class TestBikeVo {

	public static void main(String[] args) {
		
		BikeVo mbike = new BikeVo(2, "페달"); // 기본생성자에서 wheel 인스턴스변수 초기화
		System.out.println("내 자전거 바퀴 갯수는:"+mbike.getWheel());
		System.out.println("내 자전거 엔진은:"+mbike.getEngineType());
		// 내 자전거의 엔진은 :페달
		
		BikeVo fbike = new BikeVo("전기");
		//BikeVo fbike = new BikeVo(4, "전기"); // 매개변수생성자에서 wheel 초기화함
		System.out.println("아버지 자전거 바퀴 갯수는:"+fbike.getWheel());
		System.out.println("아버지 자전거 엔진은:"+fbike.getEngineType());
		// 아버지 자전거의 엔진은: 전기
		
		AServiceVo mservice = new AServiceVo('n', 2, 10);
		AServiceVo fservice = new AServiceVo(mservice);
		
		//속도계기판
		//내 자전거 최고속도(초기값) 50
		//아버지 자전거 최고속도(초기밧) 30 생성자로 초기화
		
		//두 자전거의 속도를 올렸을 때 10 30, 50
		//현재 속도를 출력하시오 (단 조건은 최고속도 이상 나오면 안됨)

	}

}
