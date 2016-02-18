package com.example;

public class Generator {
	
	// 각 자리수 더하기
	// 1+2+3+4+5+6+7+8+9+1+0 = 46
	private static final int LIMIT = 10;

	public static void sum() {
		
		int addTotal = 0;
		
		for(int i=0; i<=LIMIT; i++) {
			
			String str = String.valueOf(i);
			
			for(int idx=0; idx < str.length(); idx++){
				addTotal += Integer.parseInt(str.substring(idx, idx+1));
			}
		}
		
		System.out.println("sum:" +addTotal);
	}
	
	public static void main(String args[]) {
		sum();
	}
	
	
}
