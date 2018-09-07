package factory.absfactory;

import factory.pizza.LDCheesePizza;
import factory.pizza.LDPepperPizza;
import factory.pizza.Pizza;

public class LDFactory implements FactoryInterface {

	@Override
	public Pizza createPizza(String ordertype) {
		
		Pizza pizza = null;
		
		if(ordertype.equals("cheese")){
			pizza = new LDCheesePizza();
		}
		else if(ordertype.equals("pepper")){
			pizza = new LDPepperPizza();
		}		
		
		return pizza;
	}

}
