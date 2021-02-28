package com.kita.second.level1;

import java.util.Scanner;

public class PhoneTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Phone myPhone = new Phone();
		//myPhone.color = "파랑";
		myPhone.phoneName = "아이폰 12";
		myPhone.owner = "김대용";
		myPhone.memory = 512;
		
		Phone p1 = new Phone("갤럭시", "빨강", 256);
		
		myPhone.call("엄마");
		Phone yourPhone = new Phone();
		p1.setColor("파랑");
		String p1Memory = p1.getColor();
		System.out.println(p1Memory);
	}
}

