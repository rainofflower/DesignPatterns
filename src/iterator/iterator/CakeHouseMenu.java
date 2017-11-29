package iterator.iterator;

import iterator.tradition.MenuItem;

import java.util.ArrayList;

public class CakeHouseMenu {

	private ArrayList<MenuItem> menuItems;

	public CakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("KFC Cake BreakFast", "boiled eggs&toast&cabbage", true, 3.99f);
		addItem("MDL Cake BreakFast", "fried eggs&toast", false, 3.59f);
		addItem("Stawberry Cake", "fresh stawberry", true, 3.29f);
		addItem("Regular Cake BreakFast", "toast&sausage", true, 2.59f);
	}
	
	public void addItem(String name, String description, boolean vegetable,
			float price){
		MenuItem menuItem = new MenuItem(name, description, vegetable, price);
		menuItems.add(menuItem);
	}

	public Iterator getIterator(){
		return new CakeHouseIterator();
	}
	
	class CakeHouseIterator implements Iterator{

		private int position = 0;
		
		public CakeHouseIterator() {
			position = 0;
		}

		@Override
		public boolean hasNext() {
			if(position < menuItems.size()){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			MenuItem menuItem = menuItems.get(position);
			position++;
			return menuItem;
		}
		
	}

}
