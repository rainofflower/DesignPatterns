package iterator.tradition;

import java.util.ArrayList;

public class Waitress {

	private CakeHouseMenu cakeHouseMenu;
	private DinerMenu dinerMenu;
	private ArrayList<MenuItem> cakeItems;
	private MenuItem[] dinerItems;
	public Waitress() {
		super();
		cakeHouseMenu = new CakeHouseMenu();
		cakeItems = cakeHouseMenu.getMenuItems();

		dinerMenu = new DinerMenu();		
		dinerItems = dinerMenu.getMenuItems();
	}
	
	public void printMenu(){
		MenuItem menuItem;
		for(int i = 0; i<cakeItems.size(); i++){
			menuItem = cakeItems.get(i);
			System.out.println(menuItem.getName()+"***"+menuItem.getPrice()+"***"+menuItem.getDescription());
		}
		for(int i = 0; i<dinerMenu.numberOfItems; i++){
			menuItem = dinerItems[i];
			System.out.println(menuItem.getName()+"***"+menuItem.getPrice()+"***"+menuItem.getDescription());
		}
	}
	
}
