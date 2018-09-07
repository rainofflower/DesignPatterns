package observer.internetweater.oo;

import java.util.Observable;
import java.util.Observer;

import observer.internetweater.oo.WeaterData.Data;

public class ForcastConditions implements Observer{
	private float temperature;
	private float pressure;
	private float humidity;
	
	public void display(){
		System.out.println("***Tommorrow Temperature :"+(temperature+1)+"***");
		System.out.println("***Tommorrow Pressure :"+(pressure+1)+"***");
		System.out.println("***Tommorrow Humidity :"+(humidity+1)+"***");
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
