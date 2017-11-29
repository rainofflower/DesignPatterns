package facade.hometheater;

public class Popcorn {
	
	private Popcorn(){
		
	}
	
	private static class SingletonHolder{
		static Popcorn instance = new Popcorn();
	}
	
	
	public static Popcorn getInstance(){
		return SingletonHolder.instance;
	}
	
	public void on(){
		System.out.println("Popcorn On");
	}
	
	public void off(){
		System.out.println("Popcorn Off");
	}
	
	public void pop(){
		System.out.println("Popcorn is popping");
	}
}
