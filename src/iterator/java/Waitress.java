package iterator.java;

import iterator.tradition.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {

	private ArrayList<java.util.Iterator> iterators = new ArrayList<>();
	
	public Waitress(){
		
	}

	public void addIterators(java.util.Iterator iterator) {
		iterators.add(iterator);
	}
	
	public void printMenu(){
		Iterator iterator;
		MenuItem menuItem;
		for(int i = 0; i<iterators.size();i++){
			iterator = iterators.get(i);
			
			while(iterator.hasNext()){
				menuItem = (MenuItem) iterator.next();
				System.out.println(menuItem.getName()+"***"+menuItem.getPrice()+"***"+menuItem.getDescription());
			}
		}
	}
	
	
}
