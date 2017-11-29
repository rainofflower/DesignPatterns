package agent.candymachinermi.server;

import java.util.Random;

public class HasCoin implements State {
	private transient CandyMachine candyMachine;
	
	public HasCoin(CandyMachine candyMachine) {
		this.candyMachine = candyMachine;
	}

	@Override
	public void insertCoin() {
		// TODO Auto-generated method stub
		System.out.println("you can't insert another coin!");
	}

	@Override
	public void returnCoin() {
		// TODO Auto-generated method stub
		System.out.println("coin return!");
		candyMachine.setState(candyMachine.onReadyState);
	}

	@Override
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

	@Override
	public void dispense() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printstate() {
		// TODO Auto-generated method stub
		System.out.println("***HasCoin***");
	}

	@Override
	public String getstatename() {
		// TODO Auto-generated method stub
		return "HasCoin";
	}

}
