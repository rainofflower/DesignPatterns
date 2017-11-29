package observer.internetweater.oo;

import java.util.Observable;

public class WeaterData extends Observable{

	private float temperature;
	private float pressure;
	private float humidity;
	
	public WeaterData() {
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
		//×¢ÒâĞèÒªsetChange();
		this.setChanged();
		this.notifyObservers(new Data(getTemperature(), getPressure(), getHumidity()));
	}
	
	public void setData(float temperature, float pressure, float humidity){
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		dataChange();
	}
	
	public class Data{
		public float temperature;
		public float pressure;
		public float humidity;
		public Data(float temperature, float pressure, float humidity) {
			this.temperature = temperature;
			this.pressure = pressure;
			this.humidity = humidity;
		}
		
	}
}
