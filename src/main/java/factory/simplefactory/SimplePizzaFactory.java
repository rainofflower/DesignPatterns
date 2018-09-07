package factory.simplefactory;

import factory.pizza.CheesePizza;
import factory.pizza.ChinesePizza;
import factory.pizza.GreekPizza;
import factory.pizza.PepperPizza;
import factory.pizza.Pizza;

public class SimplePizzaFactory {

	public Pizza CreatePizza(String ordertype){
		Pizza pizza = null;
		
		if(ordertype.equals("cheese")){
			pizza = new CheesePizza();
		}
		else if(ordertype.equals("greek")){
			pizza = new GreekPizza();
		}
		else if(ordertype.equals("pepper")){
			pizza = new PepperPizza();
		}
		else if(ordertype.equals("chinese")){
			pizza = new ChinesePizza();
		}
		return pizza;
	}
}
