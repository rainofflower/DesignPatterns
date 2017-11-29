package template.hotdrink;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HotDrink coffee = new Coffee();
		//HotDrink tea = new Tea();
		coffee.prepareRecipe();
		//tea.prepareRecipe();
		HotDrink coffeeWithHook = new CoffeeWithHook();
		coffeeWithHook.prepareRecipe();
	}

}
