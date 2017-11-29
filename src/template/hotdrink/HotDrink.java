package template.hotdrink;

public abstract class HotDrink {

	public final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		//addCondiments();
		if(wantCondimentsHook()){
			addCondiments();
		}
		else{
			System.out.println("No Condiments");
		}
	}
	
	public boolean wantCondimentsHook(){
		return true;
	}
	
	public final void boilWater(){
		System.out.println("Boiling water");
	}
	
	public abstract void brew();
	
	public final void pourInCup(){
		System.out.println("Pouring into cup");		
	}
	
	public abstract void addCondiments();
}
