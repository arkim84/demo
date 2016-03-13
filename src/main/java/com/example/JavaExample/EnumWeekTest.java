package com.example.JavaExample;

import java.util.Calendar;

public class EnumWeekTest {
	
	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		switch(week) {
			case 1:
				today = Week.SUNDAY; break;
			case 2:
				today = Week.MONDAY; break;
		}
		System.out.println(today);
		
		Week week1 = Week.MONDAY;
		Week week2 = Week.SUNDAY;
		
		System.out.println(week1.ordinal());
		System.out.println(week2.ordinal());
		// 열거 객체를 비교해서 순번 차이를 리턴
		System.out.println(week1.compareTo(week2));
		
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}

}
