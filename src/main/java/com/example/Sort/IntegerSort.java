package com.example.Sort;

import java.util.Arrays;

public class IntegerSort {
	
	public static void main(String[] args) {
		int[] array = {5,3,7644,234};
		Arrays.sort(array);
		
		for(int num : array) {
			System.out.println(num);
		}
	}

}
