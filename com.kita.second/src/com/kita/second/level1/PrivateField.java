package com.kita.second.level1;

public class PrivateField {
	private int field1;
	private String field2;
	
	
	public PrivateField(){
		
	}
	
	PrivateField(int field1,String field2){
		this.field1 = field1;
		this.field2 = field2;
	}

	void setField1(int field1,String field2){
		this.field1 = field1;
		this.field2 = field2;
	}
	
	int getField1(){
		return field1;
	}
	String getField2(){
		field2 = "안녕";
		return field2;
	}
}
