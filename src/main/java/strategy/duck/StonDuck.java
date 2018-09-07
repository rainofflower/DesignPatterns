package strategy.duck;

import strategy.flybehavior.NoFlyBehavior;
import strategy.quackbehavior.NoQuack;

public class StonDuck extends Duck {

	public StonDuck() {
		flyBehavior = new NoFlyBehavior();
		quackBehavior = new NoQuack();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("~~StonDuck~~");
	}

}
