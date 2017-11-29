package agent.candymachinermi.server;

import java.rmi.RemoteException;

public class SoldState implements State {
	private transient CandyMachine candyMachine;
	
	public SoldState(CandyMachine candyMachine) {
		this.candyMachine = candyMachine;
	}

	@Override
	public void insertCoin() {
		// TODO Auto-generated method stub
		System.out.println("please wait!we are giving you a candy£¡");
	}

	@Override
	public void returnCoin() {
		// TODO Auto-generated method stub
		System.out.println("you haven't inserted a coin yet!");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("we are giving you a candy,turning another get nothing");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		candyMachine.releaseCandy();
		try {
			if(candyMachine.getCount()>0){
				candyMachine.setState(candyMachine.onReadyState);
			}
			else{
				System.out.println("Oo,out of candies");
				candyMachine.setState(candyMachine.soldOutState);
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void printstate() {
		// TODO Auto-generated method stub
		System.out.println("***SoldState***");
	}

	@Override
	public String getstatename() {
		// TODO Auto-generated method stub
		return "SoldState";
	}

}
