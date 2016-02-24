package com.example.JavaExample;

import java.util.Stack;

public class StackTest {
	
	public static void main(String[] args) {
		
		char v1 = 'c';
		System.out.println(v1);
		
		if(v1 == 'A') {
			int v2 = 100;
			double v3 = 3.14;
		}
		boolean v4 = true;
		
		// stack 생성
		Stack myStack = new Stack();
		
		myStack.push("test1");
		myStack.push("test2");
		myStack.push("test3");
		
		while(!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
		System.out.println(myStack.isEmpty());
	}

}
