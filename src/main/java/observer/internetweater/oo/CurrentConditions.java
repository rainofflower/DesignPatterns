package observer.internetweater.oo;

import java.util.Observable;
import java.util.Observer;

import observer.internetweater.oo.WeaterData.Data;

public class CurrentConditions implements Observer{
	
	private float temperature;
	private float pressure;
	private float humidity;
	
	public void display(){
		System.out.println("***Today Temperature :"+temperature+"***");
		System.out.println("***Today Pressure :"+pressure+"***");
		System.out.println("***Today Humidity :"+humidity+"***");
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		this.temperature = ((Data)(arg)).temperature;
		this.pressure = ((Data)(arg)).pressure;
		this.humidity = ((Data)arg).humidity;
		
		display();
	}
}
