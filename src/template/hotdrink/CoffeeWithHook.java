package template.hotdrink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends HotDrink {

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("Brewing Coffee");
	}

	@Override
	public void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding suger and milk");
	}

	@Override
	public boolean wantCondimentsHook() {
		System.out.println("Condiments, yes or no? please input(y/n):");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String result = "";
		try {
			result = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result.equals("y")){
			return true;
		}
		return false;
	}

}
