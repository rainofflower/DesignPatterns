package iterator.tradition;

public class MenuItem {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isVegetable() {
		return vegetable;
	}

	public void setVegetable(boolean vegetable) {
		this.vegetable = vegetable;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}