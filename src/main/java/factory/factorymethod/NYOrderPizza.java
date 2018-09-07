package factory.factorymethod;

import factory.pizza.NYCheesePizza;
import factory.pizza.NYPepperPizza;
import factory.pizza.Pizza;

public class NYOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
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
