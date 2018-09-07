package strategy.duck;

import strategy.flybehavior.BadFlyBehavior;
import strategy.quackbehavior.GegeQuack;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		flyBehavior = new BadFlyBehavior();
		quackBehavior = new GegeQuack();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("~~RedHeadDuck~~");
	}

}
