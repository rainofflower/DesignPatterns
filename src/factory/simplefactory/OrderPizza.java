package factory.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import factory.pizza.CheesePizza;
import factory.pizza.GreekPizza;
import factory.pizza.PepperPizza;
import factory.pizza.Pizza;

public class OrderPizza {
	
	SimplePizzaFactory pizzaFactory;
	
	public OrderPizza(SimplePizzaFactory pizzaFactory){
		
		setFactory(pizzaFactory);
		
	}
	
	public void setFactory(SimplePizzaFactory pizzaFactory){
		
		this.pizzaFactory = pizzaFactory;
		Pizza pizza = null;
		String ordertype;
		
		do{
			ordertype = gettype();
			pizza = pizzaFactory.CreatePizza(ordertype);
			
			if(pizza!=null){
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}					
		}while(true);		
	}
	
	private String gettype(){
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input Pizza Type:");
			String str;
			str = strin.readLine();
		
			return str;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
	}
}
