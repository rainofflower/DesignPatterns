package strategy.duck;

import strategy.flybehavior.GoodFlyBehavior;
import strategy.flybehavior.NoFlyBehavior;
import strategy.quackbehavior.GegeQuack;
import strategy.swimbehavior.GoodSwim;
import strategy.swimbehavior.Swim;

public class Strategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck greenHeadDuck = new GreenHeadDuck();
		Duck redHeadDuck = new RedHeadDuck();
		Duck stonDuck = new StonDuck();
		//通过接口添加新行为，同时不影响其他的鸭子
		SwimDuck swimDuck = new SwimDuck();
		
		greenHeadDuck.display();
		greenHeadDuck.Fly();
		greenHeadDuck.Quack();
		
		redHeadDuck.display();
		redHeadDuck.Fly();
		redHeadDuck.Quack();
		redHeadDuck.setFlyBehavior(new NoFlyBehavior());
		redHeadDuck.Fly();
		
		stonDuck.display();
		stonDuck.Fly();
		stonDuck.Quack();
		
		swimDuck.setFlyBehavior(new GoodFlyBehavior());
		swimDuck.setQuackBehavior(new GegeQuack());
		swimDuck.display();
		swimDuck.Fly();
		swimDuck.Quack();
		swimDuck.setSwimbehavior(new GoodSwim());
		swimDuck.swim();
	}

}
