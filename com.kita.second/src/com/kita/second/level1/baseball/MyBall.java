package com.kita.second.level1.baseball;

import java.util.Scanner;

public class MyBall {
	// 내가 숫자값 입력하고 예외 처리하는 클래스
	// 필드
	private int[] myArr;
	private Scanner scan;
	
	public MyBall(int gameCnt) {
		myArr = new int[gameCnt];
		scan = new Scanner(System.in);
	}
	
	// 메소드
	// 숫자를 입력받기 setNumbers()
	// 내 배열안의 숫자값 뽑기 getMyNum()
	
	private void setNumbers() {
		Scanner sc= new Scanner(System.in);
		for(int i=0; i< myArr.length; i++) {
			System.out.printf("값%d: \n", i+1);
			myArr[i] = sc.nextInt(); 
	}
	
}
	
	int getMyNum(int idx) {
		return myArr[idx];
	}
	
	
	
	
	
	
	
	
	
	
}