package com.example.StrategyPattern;

public class Quack implements IQuackBehavior{

	@Override
	public void quack() {
		System.out.println("꽥꽥꽥");		
	}
}
