package agent.candymachinermi.server;

import java.io.Serializable;

public interface State extends Serializable{
	void insertCoin();
	void returnCoin();
	void turnCrank();
	void dispense();
	void printstate();
	String getstatename();
}
