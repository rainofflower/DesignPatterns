package factory.absfactory;

import factory.pizza.NYCheesePizza;
import factory.pizza.NYPepperPizza;
import factory.pizza.Pizza;

public class NYFactory implements FactoryInterface {

	@Override
	public Pizza createPizza(String ordertype) {
		
		Pizza pizza = null;
		
		if(ordertype.equals("cheese")){
			pizza = new NYCheesePizza();
		}
		else if(ordertype.equals("pepper")){
			pizza = new NYPepperPizza();
		}
		
		return pizza;
	}

}
