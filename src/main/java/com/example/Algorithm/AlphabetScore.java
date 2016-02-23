package com.example.Algorithm;

public class AlphabetScore {
	
	public static void main(String[] args) {
		
		// 알파벳 아스키코드 출력
		String str = "abcdefghijklmn";
		
		int num = 0;
		
		for(int i=0; i<str.length(); i++) {
			num = str.charAt(i);
			System.out.println(num);
		}
	} 

}
