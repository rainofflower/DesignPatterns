package factory.absfactory;

import factory.pizza.Pizza;

public interface FactoryInterface {
	Pizza createPizza(String ordertype);
}
