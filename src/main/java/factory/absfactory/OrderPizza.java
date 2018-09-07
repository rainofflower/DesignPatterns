package factory.absfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import factory.pizza.Pizza;

public class OrderPizza {
	FactoryInterface factory;
	
	public OrderPizza(FactoryInterface factory){
		
		setFactory(factory);
		
	}

	public void setFactory(FactoryInterface factory) {
		
		Pizza pizza = null;
		String ordertype;
		
		this.factory = factory;
		
		do{
			ordertype = gettype();		
			pizza = factory.createPizza(ordertype);
			if(pizza != null){
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
