package com.hk.app;

public class Instrument {
	
	//[속성]
	//현재 속도 speed
	int speed;
	//최고 속도 maxSpeed
	int maxSpeed;
	
	// 기본생성자
	Instrument() { }
	// 매개변수가 있는 생성자
	Instrument(int max) { maxSpeed=max; }
	
	
	//[기능]
	//현재속도를 증가시키는 함수 void speedUp(int s)
	public void speedUp(int s) {
		speed = speed + s;
		if(speed > maxSpeed) {
			speed = maxSpeed;
		}
	}
	//현재속도를 보여주는 함수 void showSpeed()
	public int showSpeed() {
		return speed;
	}
	//최고속도를 보여주는 함수 void showMaxSpeed()
	
	//breaker함수
	public void breaker(int b) {
		speed = speed - b;
		if(speed < 0 ) {
			speed = 0;
		}		
	}

}
