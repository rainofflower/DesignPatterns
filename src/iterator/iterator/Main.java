package iterator.iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Waitress waitress = new Waitress();
		CakeHouseMenu cakeHouseMenu =new CakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		waitress.addIterators(cakeHouseMenu.getIterator());
		waitress.addIterators(dinerMenu.getIterator());
		waitress.printMenu();
	}

}
