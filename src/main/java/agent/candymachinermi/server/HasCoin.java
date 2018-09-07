package agent.candymachinermi.server;

import java.util.Random;

public class HasCoin implements State {
	private transient CandyMachine candyMachine;
	
	public HasCoin(CandyMachine candyMachine) {
		this.candyMachine = candyMachine;
	}

	public void insertCoin() {
		// TODO Auto-generated method stub
		System.out.println("you can't insert another coin!");
	}

	public void returnCoin() {
		// TODO Auto-generated method stub
		System.out.println("coin return!");
		candyMachine.setState(candyMachine.onReadyState);
	}

	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("crank turn...");
		Random ranwinner = new Random();
		int winner = ranwinner.nextInt(10);
		if(winner==0){
			candyMachine.setState(candyMachine.winnerState);
		}
		else{
			candyMachine.setState(candyMachine.soldState);
		}
	}

	public void dispense() {
		// TODO Auto-generated method stub

	}

	public void printstate() {
		// TODO Auto-generated method stub
		System.out.println("***HasCoin***");
	}

	public String getstatename() {
		// TODO Auto-generated method stub
		return "HasCoin";
	}

}
