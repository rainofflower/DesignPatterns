package agent.candymachinermi.server;

import java.rmi.RemoteException;

public class WinnerState implements State {
	private transient CandyMachine candyMachine;
	
	public WinnerState(CandyMachine candyMachine) {
		this.candyMachine = candyMachine;
	}
	public void insertCoin() {
		// TODO Auto-generated method stub
		System.out.println("please wait!we are giving you a candy!");
	}

	public void returnCoin() {
		// TODO Auto-generated method stub
		System.out.println("you don't have coin in the machine!");
	}

	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("we are giving you a candy!");
	}

	public void dispense() {
		// TODO Auto-generated method stub
		candyMachine.releaseCandy();
		try {
			if(candyMachine.getCount() == 0){
				candyMachine.setState(candyMachine.soldOutState);
			}else{
				System.out.println("you are a winner!you get another candy��");
				candyMachine.releaseCandy();
				if(candyMachine.getCount()>0){
					candyMachine.setState(candyMachine.onReadyState);
				}
				else{
					System.out.println("Oo,out of candies");
					candyMachine.setState(candyMachine.soldOutState);
				}
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void printstate() {
		// TODO Auto-generated method stub
		System.out.println("***WinnerState***");
	}

	public String getstatename() {
		// TODO Auto-generated method stub
		return "WinnerState";
	}

}
