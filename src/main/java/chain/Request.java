package chain;

public class Request {
	private int Type = 0;
	private int Number = 0;
	private float Price = 0;
	private int ID = 0;
	
	public Request(int type, int number, float price, int iD) {
		Type = type;
		Number = number;
		Price = price;
		ID = iD;
	}
	
	public int getType() {
		return Type;
	}

	public int getID() {
		ID = (int) (Math.random()*1000);
		return ID;
	}
	
	public float getSum(){
		return Number*Price;
	}
	
}
