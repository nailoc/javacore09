package com.hk.app;

public class AServiceVo {
	
	//서비스 속성
	//1-제품등록여부 char reg - y, n
	//2-as기간 int aperiod 1년 2년 3년
	//3-할인서비스 int sale 10% 20% 30%
	char reg;
	int aperiod;
	int sale;
	
	//게터(리턴함수)와 세터(변경함수)를 생성하시오
	public int getAperiod() {
		return aperiod;
	}
	public void setAperiod(int aperiod) {
		this.aperiod = aperiod;
	}
	
	public char getReg() {
		return reg;
	}
	public void setReg(char reg) {
		this.reg = reg;
	}
	
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	
	// 생성자를 만들었다
	AServiceVo(char reg, int aperiod, int sale) {
		this.reg=reg;
		this.aperiod= aperiod;
		this.sale= sale;
	}
	AServiceVo(AServiceVo as) { // 매개변수를 참조변수로 입력
		this(as.reg, as.aperiod, as.sale);
	}
	
	
	

}
