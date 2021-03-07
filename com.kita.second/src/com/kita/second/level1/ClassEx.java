package com.kita.second.level1;

public class ClassEx {
	public static void main(String[] args) {
		ClassEx cl = new ClassEx();//새로운 인스턴스를 쓸떼 new를 쓴다.물건이 생긴다 물건안의 코드를 가지고와서 쓴다.
		int result1 = cl.sum(3,8,4,1,2,5);
		System.out.println("result =" +  result1);
		int result2 = cl.sum(4,5,9,6,2,4);
		System.out.println("result =" +  result2);
	}//static final 상수 조건 클래스
	 // final 상수조건 메인메소드
	//필드(상태, 속성)
	int field1;
	String field2;
	int [] field3;
	
	int field4;
	static int field5;
	
	void method4() {}
	static void method5() {}
	
	static void methodTest() {
//		field4 = 10;
//		this.method4();
		
		field5 = 10;
		method5();
	}
	
	//생성자(필드 초기화) 생성클래스랑 이름동일
	public ClassEx() {
	// super(); 생략이되어있다. object와 부모와 자식관계
	}
	public ClassEx(int field1) {
		this.field1 = field1; 
	}
	public ClassEx(int field1, String field2) {
		this(field1); // ClassEx(field1);
		this.field2 = field2;
	}
	public ClassEx(int field1, String field2, int[] field3) {
		this(field1, field2);
//		this.field1 = field1;
//		this.field2 = field2;
		this.field3 = field3;
	}
	
	//메소드(동작)
	public int sum(int n1, int n2) {
		int result = n1 + n2 ;
		return result;
	}
	
	public int sum(int n1, int n2, int n3) {
		int result = sum(n1, n2) + n3;
		return result;
	}
	int sum(int...arr) {
		// 실행코드
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}
		
		return total;
	}
	String sum(String...arr) {
		// 실행코드
		return null;
	}
	// 매개변수의 1.타입2.개수3.위치
}
