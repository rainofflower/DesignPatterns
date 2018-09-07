package facade.hometheater;

public class DVDPlayer {
	
	private DVDPlayer(){
		
	}
	
	private static class SingletonHolder{
		static DVDPlayer instance = new DVDPlayer();
	}
	
	
	public static DVDPlayer getInstance(){
		return SingletonHolder.instance;
	}
	
	public void on(){
		System.out.println("DVDPlayer On");
	}
	
	public void off(){
		System.out.println("DVDPlayer Off");
	}
	
	public void play(){
		System.out.println("DVDPlayer is playing");
	}
	
	public void pause(){
		System.out.println("DVDPlayer pause");
	}
	
	public void setdvd(){
		System.out.println("DVDPlayer is setting dvd");
	}
}
