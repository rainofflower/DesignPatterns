package factory.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import factory.pizza.Pizza;

public abstract class OrderPizza {
	public OrderPizza(){
		Pizza pizza = null;
		String ordertype;
		
		do{
			ordertype = gettype();
			pizza = createPizza(ordertype);
			
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}while(true);
	}
	
	abstract Pizza createPizza(String ordertype);

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
