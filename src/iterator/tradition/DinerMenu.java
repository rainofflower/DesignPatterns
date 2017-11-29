package iterator.tradition;

import java.util.ArrayList;

public class DinerMenu {

	private final static int Max_Item=5;
	public int numberOfItems=0;
	private MenuItem[] menuItems;

	public DinerMenu() {
		menuItems = new MenuItem[Max_Item];
		
		addItem("Vegetable Blt", "bacon&lettuce&tomato&cabbage", true, 3.58f);
		addItem("Blt", "bacon&lettuce&tomato", false, 3.00f);
		addItem("Bean soup", "bean&potato salad", true, 3.28f);
		addItem("Hotdog", "onions&cheese&bread", false, 3.05f);
	}
	
	public void addItem(String name, String description, boolean vegetable,
			float price){
		MenuItem menuItem = new MenuItem(name, description, vegetable, price);
		if(numberOfItems >= Max_Item){
			System.err.println("sorry,menu is full! can not add another item");
		}
		else{
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}
	
}
