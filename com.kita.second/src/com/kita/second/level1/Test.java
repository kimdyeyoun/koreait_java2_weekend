package com.kita.second.level1;

import java.io.ObjectInputStream.GetField;

public class Test {
	public static void main(String[] args) {
	Calc myCalc = new Calc();
//	double pi = myCalc.pi;
	double pi = Calc.pi;
	int num = myCalc.num;
	myCalc.num = 15;
	System.out.println("myCalc.num: "+myCalc.num);
	
	Calc yourCalc = new Calc();
	System.out.println("yourCalc.num: "+yourCalc.num);
	
	Calc.pi = 3.14;
	
	PrivateField pri = new PrivateField();
	pri.getField2();
	System.out.println(pri.getField2());
	
	}
}

