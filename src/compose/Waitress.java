package compose;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {

	private ArrayList<MenuComponent> iterators = new ArrayList<MenuComponent>();
	
	public Waitress(){
		
	}

	public void addComponent(MenuComponent menuComponent) {
		iterators.add(menuComponent);
	}
	
	public void printMenu(){
		Iterator iterator;
		MenuComponent menuItem;
		for(int i = 0; i<iterators.size();i++){
			iterators.get(i).print();
			iterator = iterators.get(i).getIterator();
			
			while(iterator.hasNext()){
				menuItem = (MenuComponent) iterator.next();
				menuItem.print();
			}
		}
	}
	public void printVegetableMenu(){
		Iterator iterator;
		MenuComponent menuItem;
		for(int i = 0; i<iterators.size();i++){
			iterators.get(i).print();
			iterator = iterators.get(i).getIterator();
			
			while(iterator.hasNext()){
				menuItem = (MenuComponent) iterator.next();
				if(menuItem.isVegetable()){
					menuItem.print();
				}				
			}
		}
	}
	
}
