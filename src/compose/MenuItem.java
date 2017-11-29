package compose;

public class MenuItem extends MenuComponent {
	private String name,description;
	private boolean vegetable;
	private float price;
	public MenuItem(String name, String description, boolean vegetable,
			float price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetable = vegetable;
		this.price = price;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	@Override
	public boolean isVegetable() {
		// TODO Auto-generated method stub
		return vegetable;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "***" + getPrice() + "***" + getDescription());
	}
	
}
