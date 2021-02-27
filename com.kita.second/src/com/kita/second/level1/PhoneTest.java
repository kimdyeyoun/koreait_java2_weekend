package com.kita.second.level1;

import java.util.Scanner;

public class PhoneTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Phone myPhone = new Phone();
		myPhone.color = "파랑";
		myPhone.phoneName = "아이폰 12";
		myPhone.owner = "김대용";
		myPhone.memory = 512;
		
		myPhone.call("엄마");
		Phone yourPhone = new Phone();
	}
}

