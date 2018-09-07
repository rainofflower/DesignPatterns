package compose;

import java.util.Iterator;
import java.util.Stack;

public class ComposeIterator implements Iterator {

	private Stack<Iterator> stack = new Stack<Iterator>();
	
	public ComposeIterator(Iterator iterator) {
		stack.push(iterator);
	}
	
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(stack.empty()){
			return false;
		}
		Iterator iterator = stack.peek();
		if(!iterator.hasNext()){
			stack.pop();
			return hasNext();
		}
		else{
			return true;
		}
	}

	
	public Object next() {
		// TODO Auto-generated method stub
		if(hasNext()){
			Iterator iterator = stack.peek();
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			stack.push(menuComponent.getIterator());
			return menuComponent;
		}
		return null;
	}

}
