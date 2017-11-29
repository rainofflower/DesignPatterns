package observer.internetweater.impl;

import observer.internetweater.observer.Observer;

public class ForcastConditions implements Observer {

	private float temperature;
	private float pressure;
	private float humidity;
	
	@Override
	public void update(float temperature, float pressure, float humidity) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		
		display();
		
	}
	
	public void display(){
		System.out.println("***明天温度 :"+(temperature+Math.random())+"***");
		System.out.println("***明天气压 :"+(pressure+Math.random())+"***");
		System.out.println("***明天湿度 :"+(humidity+Math.random())+"***");
	}


}
