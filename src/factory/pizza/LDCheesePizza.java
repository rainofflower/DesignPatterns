package factory.pizza;

public class LDCheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.setName("LDCheesePizza");
		
		System.out.println(name + " preparing...");
	}

}
