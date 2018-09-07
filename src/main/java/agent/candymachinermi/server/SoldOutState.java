package agent.candymachinermi.server;

public class SoldOutState implements State {
	private transient CandyMachine candyMachine;
	
	public SoldOutState(CandyMachine candyMachine) {
		this.candyMachine = candyMachine;
	}
	public void insertCoin() {
		// TODO Auto-generated method stub
		System.out.println("you can't insert coin,the machine sold out!");
	}

	public void returnCoin() {
		// TODO Auto-generated method stub
		System.out.println("you don't have coin in the machine!");
	}

	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("there are no candies��");
	}

	public void dispense() {
		// TODO Auto-generated method stub

	}

	public void printstate() {
		// TODO Auto-generated method stub
		System.out.println("***SoldOutState***");
	}

	public String getstatename() {
		// TODO Auto-generated method stub
		return "SoldOutState";
	}

}
