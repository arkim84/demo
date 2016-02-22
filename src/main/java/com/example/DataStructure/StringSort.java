package com.example.DataStructure;

import java.util.Arrays;
import java.util.Collections;

public class StringSort {

	public static void main(String[] args) {
		String s[] = {"맹구",
                 "배용준",
                 "땡칠이",
                 "장동건",
                 "강수정",
                 "송창식",
                 "황당해",
                 "고은아"};

		// 오름차순 정렬
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
	   
		// 내림차순 정렬
		Arrays.sort(s, Collections.reverseOrder());
		System.out.println(Arrays.toString(s));
	}
}
