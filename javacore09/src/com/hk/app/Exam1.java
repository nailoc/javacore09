package com.hk.app;

public class Exam1 {

	public static void main(String[] args) {
		
		Dices mydice = new Dices();  	// 참조변수 선언
		mydice.roll(); 					// 주사위 한번 던짐
		int result = mydice.getDice1() + mydice.getDice2();
		
		System.out.println("첫번째 주사위 눈은"+ mydice.getDice1());
		System.out.println("두번째 주사위 눈은"+ mydice.getDice1());
		System.out.println("주사위 눈의 합은"+ result);
		
		

	}

}
