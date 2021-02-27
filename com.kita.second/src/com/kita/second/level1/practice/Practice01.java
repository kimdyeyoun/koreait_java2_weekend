package com.kita.second.level1.practice;

import java.util.Scanner;

public class Practice01 {
	//구구단 2단 찍기 메소드
	// 2 * 1 =2
	//	2 * 1 =4
	//	2 * 1 =18
	public static void main(String[] args) {
		printGugudan();
		System.out.println();
		printStars(4,5);
		sum(1,2);
	}
	
//	리턴타입 printGugudan(매개변수) {
//		실행코드
//	}
	
	public static void printGugudan() {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("2 * %d = %d\n",i,i*2);
		}
	}
	
	//오버로딩(Overloding)
	//매개변수의 1.개수  2.타입 3.위치
//		public static void printGugudan(int dan) {
//			for (int i = 1; i <= 9; i++) {
//				System.out.printf("%d * %d = %d\n",dan,i,i*dan);
//			}
//	}
//	
//		public static void printGugudan(int dan, int max) {
//			for (int i = 1; i <= 9; i++) {
//				System.out.printf("%d * %d = %d\n",dan,i,i*dan);
//			}
//	}
	//별찍기 메소드
	//내가 입력하는 값에 따라 line(줄)과 star (별개수가)달라지도록
	public static void printStars(int line,int star) {
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static int sum (int n1, int n2) {
		return n1+n2;
	}
	
	
	
	
	
	
	
}
