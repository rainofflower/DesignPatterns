package facade.hometheater;

public class TheaterLights {
	
	private TheaterLights(){
		
	}
	
	private static class SingletonHolder{
		static TheaterLights instance = new TheaterLights();
	}
	
	
	public static TheaterLights getInstance(){
		return SingletonHolder.instance;
	}
	
	public void on(){
		System.out.println("TheaterLights On");
	}
	
	public void off(){
		System.out.println("TheaterLights Off");
	}
	
	public void dim(int d){
		System.out.println("TheaterLights dim to "+d+"%");
	}
	
	public void bright(){
		dim(100);
		System.out.println("TheaterLights bright");
	}
}
