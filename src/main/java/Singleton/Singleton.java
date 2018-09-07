package Singleton;

public class Singleton {
	private Singleton(){
		
	}
	
	private static class SingletonHolder{
		static Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance(){
		return SingletonHolder.instance;
	}
}
