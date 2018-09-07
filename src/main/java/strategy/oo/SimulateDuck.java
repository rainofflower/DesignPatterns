package strategy.oo;

public class SimulateDuck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreenHeadDuck mGreenHeadDuck = new GreenHeadDuck();
		RedHeadDuck mRedHeadDuck = new RedHeadDuck();
		
		mGreenHeadDuck.display();
		
		mGreenHeadDuck.Quack();
		mGreenHeadDuck.swim();
		mGreenHeadDuck.fly();
		
		mRedHeadDuck.display();
		
		mRedHeadDuck.Quack();
		mRedHeadDuck.swim();
		mRedHeadDuck.fly();
	}

}
