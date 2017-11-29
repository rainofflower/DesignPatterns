package facade.hometheater;

public class Screen {
	
	private Screen(){
		
	}
	
	private static class SingletonHolder{
		static Screen instance = new Screen();
	}
	
	
	public static Screen getInstance(){
		return SingletonHolder.instance;
	}
	
	public void up(){
		System.out.println("Screen up");
	}
	
	public void down(){
		System.out.println("Screen down");
	}
}
