package iterator.java;

import iterator.tradition.MenuItem;

import java.util.Hashtable;
import java.util.Iterator;

public class CoffeeMenu {

	private Hashtable<String, MenuItem> menuItems = new Hashtable<>();
	
	CoffeeMenu(){
		addItem("Moca Burger", "moca&bruger&tomato", true, 3.56f);
		addItem("Soup Latte", "Latte&salad&soup", true, 3.26f);
		addItem("Burrito", "bacon&beans", false, 3.96f);
	}
	
	public void addItem(String name, String description, boolean vegetable,
			float price){
		MenuItem menuItem = new MenuItem(name, description, vegetable, price);
		menuItems.put(name, menuItem);
	}
	
	public Iterator getiIterator(){
		return menuItems.values().iterator();
	}
}
