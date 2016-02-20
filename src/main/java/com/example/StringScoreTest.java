package com.example;

public class StringScoreTest {
	
// 	특정 문자열 계산하는 프로그램 작성
//	영문자를 입력받아 문자열중 bab은 1점, baby는 -2점으로 계산한다.
//	기본점수는 50점이며 babbab(또는 babab, 또는 babybaby),일경우 한 번만 계산되며 babbaby일 경우 baby만 계산한다.
//	(bab과 baby가 하나의 단어처럼 조합된 경우 baby만 처리)
//
//	예) bab is baby  => 50 + 1 - 2  => 결과 : 49
//	    babbab is baby  => 50 + 1 - 2  => 결과 : 49
//	    babbabbaby is babybababy  => 50 -2 - 2  => 결과 : 46
	
	public static void main(String args[]) {
		String bab = "bab";
		String baby = "baby";
		int babScore = 1;
		int babyScore = -2;
		int score = 50;
		
		String text = "bab is baby";
		text = "babbab is baby";
		text = "babbabbaby is babybababy";
		
		String[] str = text.split(" ");
		for(int i=0; i<str.length; i++) {
			if(str[i].matches(bab)) score = score+babScore;
			else if(str[i].matches(baby)) score = score+babyScore;
			else if(str[i].endsWith(bab)) score = score+babScore;
			else if(str[i].endsWith(baby)) score = score+babyScore;
		}
		
		System.out.println(score);
	}

}
