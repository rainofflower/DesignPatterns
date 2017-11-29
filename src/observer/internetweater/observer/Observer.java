package observer.internetweater.observer;

public interface Observer {
	void update(float temperature, float pressure, float humidity);
}
