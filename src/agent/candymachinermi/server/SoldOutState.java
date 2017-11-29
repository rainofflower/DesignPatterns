package agent.candymachinermi.server;

public class SoldOutState implements State {
	private transient CandyMachine candyMachine;
	
	public SoldOutState(CandyMachine candyMachine) {
		this.candyMachine = candyMachine;
	}
	@Override
	public void insertCoin() {
		// TODO Auto-generated method stub
		System.out.println("you can't insert coin,the machine sold out!");
	}

	@Override
	public void returnCoin() {
		// TODO Auto-generated method stub
		System.out.println("you don't have coin in the machine!");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("there are no candies£¡");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printstate() {
		// TODO Auto-generated method stub
		System.out.println("***SoldOutState***");
	}

	@Override
	public String getstatename() {
		// TODO Auto-generated method stub
		return "SoldOutState";
	}

}
