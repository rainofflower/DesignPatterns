package factory.simplefactory;


public class PizzaStroe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
		
		OrderPizza orderPizza;
		orderPizza = new OrderPizza(pizzaFactory);

	}
}
