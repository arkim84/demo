package com.example;

public class ReverseSting {
	
	public static void main(String args[]) {
		String str = "김아름";
		StringBuilder builder = new StringBuilder(str);
		System.out.println("reverse: "+builder.reverse().toString());
	}

}
