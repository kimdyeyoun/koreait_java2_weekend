package com.kita.second.level1;

import java.util.Scanner;

public class MacBook {
	// 메모리, 가격, 색상
	
	//메모리만
	//메모리,가격
	//메모리,색상
	//메모리, 가격, 색상
	
	//웹서핑을 한다, 코딩을한다
	//ㅇㅇ에게 이메일을 보낸다
	int memory;
	int won;
	String color;
	
	public MacBook() {
		System.out.println(color);
	}
	
	public MacBook(int memory) {
		this.memory = memory;
	}
	public MacBook(int memory, int won) {
		this.memory = memory;
		this.won = won;
	}
	public MacBook(int memory,String color) {
		this.memory = memory;
		this.color = color;
	}
	public MacBook(int memory,int won,String color) {
		this.memory = memory;
		this.won = won;
		this.color = color;
	}
	void webSupig(String web) {
		System.out.println(web+"을 한다");
	}
	void coDing(String coDing) {
		System.out.println(coDing+"을 한다");
	}
	void eMail(String eMail) {
		System.out.printf("%s에게 이메일을 보낸다.",eMail);
	}
}
