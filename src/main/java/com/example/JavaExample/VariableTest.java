package com.example.JavaExample;

public class VariableTest {
	
	public static void main(String[] args) {
//		char ch = 'A';
//		int code = ch;
//		
//		int code = 65;
//		char ch = (char) code;
//		
//		System.out.println(ch);
//		System.out.println(code);
		
		byte b = 0;
		int i = 0;
		
		// byte가 저장할 수 있는 데이터 범위는 -128~127까지
		// 127을 넘어가면 -128부터 다시 시작함
		for(int x=0; x<=270; x++) {
			System.out.println(b++ +" : "+i++);
		}
		
	}
	
}
