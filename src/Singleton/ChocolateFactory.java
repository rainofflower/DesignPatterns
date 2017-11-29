package Singleton;

public class ChocolateFactory {
	private boolean empty;
	private boolean boiled;
	private static ChocolateFactory uniqueInstance = null;
	
	private ChocolateFactory(){
		empty = true;
		boiled = false;
	}
	
	public static synchronized ChocolateFactory getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new ChocolateFactory();
		}
		return uniqueInstance;
	}
	
	public void fill(){
		if(empty){
			empty = false;
			boiled = false;
		}
	}
	
	public void drain(){
		if((!empty)&&boiled){
			empty = true;
		}
	}
	
	public void boil(){
		if((!empty)&&(!boiled)){
			boiled = true;
		}
	}
}
