package com.example.Algorithm;

public class NexonTest_01 {

//	예금 만기 금액을 구하는 문제. 
//	예금은 복리입니다. 복리라는 것은 예를 들어 10% 이율의 예금에 가입하고 100,000 만원 예치시, 1년 후에는 110,000원, 2년 후에는 121,000원이 되는 겁니다. 
//	그리고 본 예금은 이벤트가 있어서 3의 배수인 연차에는 해당 연차 수를 5로 나눈 나머지 만큼 (예를 들어 12년차 에는 2%, 3년차에는 3%) 더 이율이 추가되어 지급됩니다.
//
//	위를 계산하고 출력하는 함수를 작성해 주시기 바라며, 함수는 재귀적(recursive)로 작성하시기 바랍니다. 
//	  
//	함수 입력값: 원금, 이율(%), 기간(년)
//	함수 출력값: 만기시 원금+이자의 합
	
	final static float f = 10/(float) 100;
	
	/**
	 * money 원금
	 * add 이율
	 * year 거치 기간 
	 */
	public static int cal(int money, int add, int year) {
		// 만기 금액
		int result = 0;
				
		// 이율
		float plus = 0;
		
		for(int i=1; i<year; i++) {
			
			// 3의 배수인 연차에는 이벤트 금리 적용
			if(i%3==0) plus = add / (float) 100 + (i%5);
			else plus = add / (float) 100;
			
			System.out.println("연차 " +i+ " 금리: "+plus);
			
			result = (int) (money + (money*plus));
			
			money = result;
		}
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(cal(100000, 10, 15));
	}
	
}
