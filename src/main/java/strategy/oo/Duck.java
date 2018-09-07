package strategy.oo;

public abstract class Duck {
	public Duck(){	}
	
	public void Quack(){
		System.out.println("~~gaga~~");
	}
	
	public abstract void display();
	
	public void swim(){
		System.out.println("~~swim~~");
	}
	
	public void fly(){
		System.out.println("~~fly~~");
	}
}
