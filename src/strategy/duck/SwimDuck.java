package strategy.duck;

import strategy.swimbehavior.Swim;

public class SwimDuck extends Duck{

	Swim swimbehavior;
	
	public void swim() {
		// TODO Auto-generated method stub
		swimbehavior.swim();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("~~swimDuck~~");
	}

	public void setSwimbehavior(Swim swimbehavior) {
		this.swimbehavior = swimbehavior;
	}

}
