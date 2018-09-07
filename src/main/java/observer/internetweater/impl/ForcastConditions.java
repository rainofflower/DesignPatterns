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
		System.out.println("***�����¶� :"+(temperature+Math.random())+"***");
		System.out.println("***������ѹ :"+(pressure+Math.random())+"***");
		System.out.println("***����ʪ�� :"+(humidity+Math.random())+"***");
	}


}
