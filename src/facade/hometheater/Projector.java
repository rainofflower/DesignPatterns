package facade.hometheater;

public class Projector {
	private int size;
	private Projector(){
		
	}
	
	private static class SingletonHolder{
		static Projector instance = new Projector();
	}
	
	
	public static Projector getInstance(){
		return SingletonHolder.instance;
	}
	
	public void on(){
		System.out.println("Projector On");
	}
	
	public void off(){
		System.out.println("Projector Off");
	}
	
	public void focus(){
		System.out.println("Projector if focus");
	}
	
	public void zoom(int size){
		this.size = size;
		System.out.println("Projector zoom to"+size);
	}
}
