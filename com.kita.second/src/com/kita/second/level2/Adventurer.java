package com.kita.second.level2;

public class Adventurer {
	//필드
		int strength ;
		int dextreity;
		int intellegence;
		int luck;
		int hp;
		
		//생성자
		 public Adventurer(){
			strength = 10 ;
			dextreity = 10;
			intellegence = 10;
			luck = 10;
			hp = 10;
		}
		 public Adventurer(int strength, int dextreity){
			this.strength = 13 ;
			this.dextreity = 12;
		}
		//메소드
		void attack(){
			System.out.println("공격을 한다.");
		}
		void jump() {
			System.out.println("점프를 한다.");
		}
	}

