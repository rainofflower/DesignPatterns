package compose;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Waitress waitress = new Waitress();
		CakeHouseMenu cakeHouseMenu =new CakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		waitress.addComponent(cakeHouseMenu);
		waitress.addComponent(dinerMenu);
		//waitress.printMenu();
		waitress.printVegetableMenu();
	}

}
