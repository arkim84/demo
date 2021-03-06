package com.example.Algorithm;

import java.util.ArrayList;
import java.util.List;

public class FibonacciPrint {
	
	public static void main(String args[]) {

//		피보나치 수열이란 n번째 숫자와 n1번째 숫자를 더한 값이 n2번째 숫자로 나타내는 수열이며 기본 생성 규칙은 처음 두항의 숫자는 1입니다.
//		그래서 세번째항은 기본적으로 1+1의 값인 2가 되죠.
//		이런 규칙으로 네번째항은 두번째항과 세번째항의 숫자를 더한 1+2의 값으로 3이 됩니다. 
//		이번 예제에서는 10번째항까지만 표현해보도록 하겠습니다.
//		[1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
		
		List<Integer> result = new ArrayList<Integer>();
			
		int n1 = 1;
		int n2 = 1;
		int n3;
		int count = 1;
		
		result.add(n1);
		result.add(n2);
		
		while(true){
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			count++;
			result.add(n3);
			if(count>8) break;
		}
		System.out.println(result);
	} 

}
