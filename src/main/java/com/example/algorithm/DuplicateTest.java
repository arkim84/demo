package com.example.algorithm;

import java.util.HashSet;
import java.util.Set;

public class DuplicateTest {

	public static void main(String[] args) {
		
		System.out.println(isDuplicated("1234"));
	}
	
	// 0~9까지의 문자로 된 숫자를 입력 받았을 때, 이 입력 값이 0~9까지의 숫자가 각각
	// 한 번씩만 사용된 것인지 확인하는 함수를 구하시오.
	// 0123456789 = true, 012322456789 = false;

	public static boolean isDuplicated(String str) {
		
		boolean bool = false;
		
		char[] cha = str.toCharArray();
		
		Set<String> set = new HashSet<String>();
		
		for(int i=0; i<cha.length; i++) {
			// Char -> String 변환
			set.add(Character.toString(cha[i]));
		}

		if(cha.length == set.size()) bool = true;
		
		return bool;
	}

}
