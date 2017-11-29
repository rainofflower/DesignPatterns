package compose;

import java.util.Iterator;

public class DinerMenu extends MenuComponent{

	private final static int Max_Item=5;
	public int numberOfItems=0;
	private MenuComponent[] menuItems;

	public DinerMenu() {
		menuItems = new MenuComponent[Max_Item];
		
		addItem("Vegetable Blt", "bacon&lettuce&tomato&cabbage", true, 3.58f);
		addItem("Blt", "bacon&lettuce&tomato", false, 3.00f);
		addItem("Bean soup", "bean&potato salad", true, 3.28f);
		addItem("Hotdog", "onions&cheese&bread", false, 3.05f);
		addSubMenu(new SubMenu());
	}
	
	private void addItem(String name, String description, boolean vegetable,
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
	
	private void addSubMenu(MenuComponent menuComponent){
		if(numberOfItems >= Max_Item){
			System.err.println("sorry,menu is full! can not add another item");
		}
		else{
			menuItems[numberOfItems] = menuComponent;
			numberOfItems++;
		}
	}
	
	public Iterator getIterator(){
		return new ComposeIterator(new DinerIterator());
	}

	class DinerIterator implements Iterator{
		private int position = 0;
		
		public DinerIterator(){
			position = 0;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(position<numberOfItems){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			MenuComponent menuItem = (MenuComponent) menuItems[position];
			position++;
			return menuItem;
		}
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("****This is DinerMenu****");
	}
	
}
