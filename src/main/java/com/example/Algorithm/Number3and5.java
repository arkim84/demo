package com.example.Algorithm;

public class Number3and5 {

	// 10 미만의 자연수에서 3과 5의 배수를 구하면 3, 5, 6, 9이다. 이들의 총합은 23이다. 
	// 1000미만의 자연수에서 3, 5의 배수의 총합을 구하라.
	
    int max;
    public Number3and5(int max) {
        this.max = max;
    }
    
    public int sumOf3And5() {
        int sum = 0;
        for(int i=0; i<max; i++) {
            if (i%3 == 0 || i%5 == 0) {
                sum += i;
            }
        }
        
        return sum;
    }
    
	public static void main(String[] args) {
		
		System.out.println(new Number3and5(10).sumOf3And5());
		System.out.println(new Number3and5(1000).sumOf3And5());
		
//		int limit = 1000;
//		int sum = 0;
//		
//		for(int i=0; i<limit; i++) {
//			if(i % 3 == 0 || i % 5 == 0) sum = sum+i;
//		}
//		System.out.println("합치기:" +sum);
		
	}

}
