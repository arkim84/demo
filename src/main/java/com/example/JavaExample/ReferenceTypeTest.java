package com.example.JavaExample;

public class ReferenceTypeTest {
	
	public static void main(String[] args) {
		
		// 문자열 리터럴이 동일하면 String 객체를 공유한다.
		String strVar1 = "test";
		String strVar2 = "test";
		//String strVar2 = new String("test");
		
		if(strVar1 == strVar2) System.out.println("주소가 같음");
		else System.out.println("주소가 다름");
		
		if(strVar1.equals(strVar2)) System.out.println("문자열이 같음");
		else System.out.println("문자열이 다름");
		
	}

}
