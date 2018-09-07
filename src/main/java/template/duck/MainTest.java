package template.duck;

import java.util.Arrays;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Duck[] ducks = {
				new Duck("duck1",(int)(Math.random()*100)),
				new Duck("duck2",(int)(Math.random()*100)),
				new Duck("duck3",(int)(Math.random()*100)),
				new Duck("duck4",(int)(Math.random()*100)),
				new Duck("duck5",(int)(Math.random()*100)),
				new Duck("duck6",(int)(Math.random()*100)),
				new Duck("duck7",(int)(Math.random()*100)),
				new Duck("duck8",(int)(Math.random()*100))
		};
		System.out.println("before sort:");
		display(ducks);
		Arrays.sort(ducks);
		
		System.out.println("after sort:");
		display(ducks);
	}
	
	public static void display(Duck[] ducks){
		for(Duck duck:ducks){
			System.out.println(duck.toString());
		}
	}

}
