package com.hk.app;
import java.io.IOException;


import java.util.Scanner; 

public class Machine1 {

	static int chargeMoney = 0; // 잔액 (다른 함수에도 계산 필요)
	
	final static int Americano = 1000;
	final static int CafeLatte = 2000;
	final static int ChocoLatte = 2500;
	final static int GreenLatte = 3000;
	// 순서도에 따라서 코드를 작성할 수 있다
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		int inMoney = 0; // 투입금액
		int selectMenu = 0;
		
		// 외부에  반복문 - 자판기 종료 여부에 대한 while
		while(true) {
			
			// 1-환영메시지 코드
			System.out.println("**************************************************");
			System.out.println("**                   JAVA                       **");
			System.out.println("**                   COFFEE                     **");
			System.out.println("**                   JAPANGI                    **");
			System.out.println("**************************************************");
			System.out.print("** 금액을 투입하세요[자판기종료(0입력)]: ");
			
			inMoney = reader.nextInt();
			if(inMoney==0) {
				System.out.println("** 자판기를 종료합니다");
				break;   // 자판기 종료
			}else {
				// 2-잔액표시
				chargeMoney += inMoney;
				while(true) {
					System.out.println("** 잔액: "+chargeMoney);
					
					// 3-금액을 입력하고 만약 잔액 > 0 이면 자판기를 시작
					
					System.out.println("** 커피 메뉴입니다 ");
					System.out.println("** 1.아메리카노(1000원) ");
					System.out.println("** 2.카페라떼(2000원) ");
					System.out.println("** 3.쵸코라떼(2500원) ");
					System.out.println("** 4.그린라떼(3000원) ");
					System.out.println("** 5.취소 ");
					System.out.print("** 메뉴를 선택하시오:");
					selectMenu = reader.nextInt();
					// 4-입력금액 저장하고 구매할 메뉴를 출력한다
					if(selectMenu!=5) {     
						buyCoffee(selectMenu, chargeMoney);
					}else {
						System.out.println("** 메뉴를 종료합니다");
						break;
					}
				}
			}
			
		}

	}
	
	// 구매처리에 대한 static 함수
	public static void buyCoffee(int menu, int charge) {
		// 5-1
		// 금액체크?
		// 금액을 더 넣으시오
		// 상품을 구매
		
		
		switch(menu) {
		case 1:
			if(charge-Americano<0) {
				System.out.println("** 잔액이 부족합니다!!");
				System.out.println("                       ");
				
			}else {
				System.out.println("** 아메리카노 맛있게 드세요!!");
				System.out.println("                       ");
				chargeMoney = chargeMoney - Americano;
			}
			break;
		case 2:
			System.out.println("** 카페라떼 맛있게 드세요!!");
			System.out.println("                       ");
			break;
		case 3:
			System.out.println("** 쵸코라떼 맛있게 드세요!!");
			System.out.println("                       ");
			break;
		case 4:
			System.out.println("** 그린라떼 맛있게 드세요!!");
			System.out.println("                       ");
			break;
		default:
			break;
			
		}
		
	}
	
	// 금액체크 함수
	public static void checkMoney(int charge) {
		
	}
	
	// 주제 - 커피 자판기
	// 1 순서도를 작성(ppt, draw.io) 그 순서대로 짜는 방법 = 절차지향 프로그래밍 Machine1.java
	// (나중에) 2 클래스 다이어그램 작성 -> 클래스 정의부분 -> 객체지향 프로그래밍 (모듈화 필요하다면 클래스를 만들어서 분해)
	// 다음시간 - 스스로 자판기 순서도를 작성해보자
	
	public final static void clearConsole()  
	{    
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}   
	}  
	
	

}
