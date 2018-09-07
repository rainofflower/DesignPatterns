package strategy.duck;

import strategy.flybehavior.GoodFlyBehavior;
import strategy.quackbehavior.GagaQuack;

public class GreenHeadDuck extends Duck {

	public GreenHeadDuck() {
		flyBehavior = new GoodFlyBehavior();
		quackBehavior = new GagaQuack();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("~~GreenDuck~~");
	}

}
