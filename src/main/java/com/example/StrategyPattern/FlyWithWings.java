package com.example.StrategyPattern;

public class FlyWithWings implements IFlyBehavior{

	@Override
	public void fly() {
		System.out.println("날고 있어요");
	}
}
