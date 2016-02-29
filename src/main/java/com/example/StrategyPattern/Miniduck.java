package com.example.StrategyPattern;

public class Miniduck extends Duck{
	
	public Miniduck() {
		iFlyBehavior = new FlyWithWings();
		iQuackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("작은 오리");
		
	}
	
}
