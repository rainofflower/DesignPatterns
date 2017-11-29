package strategy.duck;

import strategy.flybehavior.FlyBehavior;
import strategy.quackbehavior.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){
		
	}
	
	public void Fly(){
		flyBehavior.fly();
	}
	
	public void Quack(){
		quackBehavior.quack();
	}
	
	public abstract void display();

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}

