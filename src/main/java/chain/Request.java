package chain;

public class Request {
	private int type = 0;
	private int number = 0;
	private float price = 0;
	private int id = 0;

	public Request(int number){
		this.number = number;
	}
	
	public Request(int type, int number, float price, int id) {
		this.type = type;
		this.number = number;
		this.price = price;
		this.id = id;
	}
	
	public int getType() {
		return type;
	}

	public int getId() {
		id = (int) (Math.random()*1000);
		return id;
	}

	public int getNumber(){
		return number;
	}
	
	public float getSum(){
		return number * price;
	}
	
}
