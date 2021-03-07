package com.kita.second.level2;

public class Magicien extends Adventurer {
	// Adeventurer 클래스를 상속 받아서
	//mp필드추가
	int mp;
	//attack메소드를 "마법공격" 재정의
	
	public Magicien() {
		mp = 10;
	}
	
	@Override
	void attack(){
		System.out.println("마법공격을 한다.");
	}
	
	//teleport 메소드 추가
	void teleport() {
		System.out.println("텔레포트를 한다.");
	}
}
