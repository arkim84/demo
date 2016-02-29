package com.example.StrategyPattern;

public abstract class Duck {
	
	IFlyBehavior iFlyBehavior;
	IQuackBehavior iQuackBehavior; 
	
	public Duck() {}
	
	public abstract void display();
	
	public void performFly() {
		iFlyBehavior.fly();
	}
	
	public void performQuack() {
		iQuackBehavior.quack();
	}
	
	public void setFlyBehavoir(IFlyBehavior fb) {
		iFlyBehavior = fb;
	}
	
	public void setQuackBehavior(IQuackBehavior fb) {
		iQuackBehavior = fb;
	}

}
