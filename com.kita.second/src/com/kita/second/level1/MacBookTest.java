package com.kita.second.level1;

import java.util.Scanner;

public class MacBookTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	MacBook myMacBook = new MacBook();
	myMacBook.memory = 512;
	myMacBook.won = 1200000;
	myMacBook.color ="white";
	
	myMacBook.webSupig("웹서핑");
	myMacBook.coDing("코딩");
	System.out.print("입력 : ");
	String str = sc.next();
	myMacBook.eMail(str);
}
}
