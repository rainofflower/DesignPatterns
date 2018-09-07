package strategy.oo;

public class GreenHeadDuck extends Duck {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("**GreenHead**");
	}
	
	public void fly(){
		System.out.println("~~no fly~~");
	}

}
