package com.example.Algorithm;

public class FibonacciSum {

//	피보나치 수열의 각 항은 바로 앞의 항 두 개를 더한 것이 됩니다. 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
//	1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//	짝수이면서 4백만 이하인 모든 항을 더하면 얼마가 됩니까?
//	정답: 4613732
	
	public static void main(String[] args) {
		int prev = 1;
		int next = 2;
		int addNum = 0;
		int sum = next;
		
		while(true) {
			addNum = prev+next;
			prev = next;
			next = addNum;
			if(addNum%2==0) sum = sum+addNum;
			if(addNum>4000000) break;
		}		
		System.out.println(sum);
	}
}
