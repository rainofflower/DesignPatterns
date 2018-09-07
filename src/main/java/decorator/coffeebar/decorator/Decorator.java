package decorator.coffeebar.decorator;

import decorator.coffeebar.Drink;

public class Decorator extends Drink {

	private Drink obj;
	
	public Decorator(Drink obj){
		this.obj = obj;
	}
	
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return super.getPrice() + obj.cost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription()+"&&"+obj.getDescription();
	}

	
}
