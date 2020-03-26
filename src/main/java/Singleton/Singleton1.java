package Singleton;

public class Singleton1 {
	
	private static volatile Singleton1 uniqueInstance = null;
	
	private Singleton1(){}
	
	public static Singleton1 getInstance(){
		if(uniqueInstance == null){
			synchronized (Singleton1.class) {				
				if(uniqueInstance == null){
					uniqueInstance = new Singleton1();
				}
			}
		}
		return uniqueInstance;
	}
}
