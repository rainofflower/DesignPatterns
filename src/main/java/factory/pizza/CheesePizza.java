package factory.pizza;

public class CheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setName("CheesePizza");
		
		System.out.println(name + " preparing...");
	}

}
