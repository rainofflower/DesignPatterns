package observer.internetweater.impl;

public class InternetWeater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentConditionns currentConditionns;
		ForcastConditions forcastConditions;
		WeatherDataSt weatherDataSt;
		
		weatherDataSt = new WeatherDataSt();
		currentConditionns = new CurrentConditionns();
		forcastConditions = new ForcastConditions();
		
		weatherDataSt.registerObserver(currentConditionns);
		weatherDataSt.registerObserver(forcastConditions);
		
		weatherDataSt.setData(30, 150, 40);
		weatherDataSt.removeObserver(currentConditionns);
		weatherDataSt.setData(33, 250, 35);
	}

}
