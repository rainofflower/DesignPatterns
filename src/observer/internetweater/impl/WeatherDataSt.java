package observer.internetweater.impl;

import java.util.ArrayList;

import observer.internetweater.observer.Observer;
import observer.internetweater.observer.Subject;
import observer.internetweater.oo.CurrentConditions;

public class WeatherDataSt implements Subject {

	private float temperature;
	private float pressure;
	private float humidity;
	private ArrayList<Observer> observers;
	
	public WeatherDataSt() {
		observers = new ArrayList<Observer>();
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	
	public void dataChange(){
		notifyObservers();
	}
	
	public void setData(float temperature, float pressure, float humidity){
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		dataChange();
	}
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		if(observers.contains(o)){
			observers.remove(o);
		}		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o:observers){
			o.update(getTemperature(), getPressure(), getHumidity());			
		}
	}
}
