package observer.internetweater.oo;

public class InternetWeather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentConditions currentConditions;
		ForcastConditions forcastConditions;
		WeaterData weaterData;
		
		currentConditions = new CurrentConditions();
		forcastConditions = new ForcastConditions();
		weaterData = new WeaterData();
		
		weaterData.addObserver(currentConditions);
		weaterData.addObserver(forcastConditions);
		weaterData.setData(30, 150, 40);
		
		weaterData.deleteObserver(currentConditions);
		weaterData.setData(40, 200, 30);
	}

}
