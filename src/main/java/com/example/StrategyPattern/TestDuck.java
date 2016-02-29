package com.example.StrategyPattern;

public class TestDuck {
	
	public static void main(String[] args) {
		
		Duck miniDuck = new Miniduck();
		miniDuck.display();
		miniDuck.performFly();
		miniDuck.performQuack();
	}

}
