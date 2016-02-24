package com.example.JavaExample;

public class ReferenceTypeTest {
	
	public static void main(String[] args) {
		
		String strVar1 = "test";
		String strVar2 = "test";
		
		if(strVar1 == strVar2) System.out.println("참조가 같음");
		else System.out.println("참조가 다름");
		
		if(strVar1.equals(strVar2)) System.out.println("문자열이 같음");
		else System.out.println("문자열이 다름");
		
	}

}
