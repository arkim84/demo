package com.example;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	
	public static void main(String args[]) {

		List<Integer> result = new ArrayList<Integer>();
		
		int n1 = 1;
		int n2 = 1;
		int n3;
		int count = 1;
		
		result.add(n1);
		result.add(n2);
		
		while(count<10){
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			count++;
			result.add(n3);
		}
		
//		int n1 = 0;
//		int n2 = 0;
//		int n3 = 1;
//		int count = 1;
//		
//		while(count<10) {
//			if(count == 1) result.add(1);
//			n1 = n2;
//			n2 = n3;
//			n3 = n1+n2;
//			count++;
//			result.add(n3);
//		}
		System.out.println(result);
			
			
	} 

}
