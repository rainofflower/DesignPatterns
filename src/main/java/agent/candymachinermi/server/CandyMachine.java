package agent.candymachinermi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CandyMachine extends UnicastRemoteObject implements
		CandyMachineRemote {
	State soldOutState;
	State onReadyState;
	State hasCoin;
	State soldState;
	State winnerState;
	private String location = "";
	private State state;
	private int count = 0;
	
	protected CandyMachine(String location, int count) throws RemoteException {
		this.location = location;
		this.count = count;
		soldOutState = new SoldOutState(this);
		onReadyState = new OnReadyState(this);
		hasCoin = new HasCoin(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		if(count > 0){
			state = onReadyState;
		}
		else{
			state = soldOutState;
		}
	}

	public String getLocation() throws RemoteException {
		// TODO Auto-generated method stub
		return location;
	}

	public int getCount() throws RemoteException {
		// TODO Auto-generated method stub
		return count;
	}

	public State getstate() throws RemoteException {
		// TODO Auto-generated method stub
		return state;
	}

	public void setState(State state){
		this.state = state;
	}
	
	public void insertCoin(){
		state.insertCoin();
	}
	
	public void returnCoin(){
		state.returnCoin();
	}
	
	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
	
	void releaseCandy(){
		if(count>0){
			count = count-1;
			System.out.println("a candy rolling out!");
		}
	}
	
	public void printstate(){
		state.printstate();
	}
}
