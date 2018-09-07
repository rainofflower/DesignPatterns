package agent.candymachinermi.server;

public class OnReadyState implements State {

	private transient CandyMachine candyMachine;
	
	public OnReadyState(CandyMachine candyMachine) {
		this.candyMachine = candyMachine;
	}

	public void insertCoin() {
		// TODO Auto-generated method stub
		System.out.println("you have inserted a coin,next,please turn crank!");
		candyMachine.setState(candyMachine.hasCoin);
	}

	public void returnCoin() {
		// TODO Auto-generated method stub
		System.out.println("you haven't inserted a coin yet!");
	}

	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("you turned,but you haven't insert a coin!");
	}

	public void dispense() {
		// TODO Auto-generated method stub
		
	}

	public void printstate() {
		// TODO Auto-generated method stub
		System.out.println("***OnReadyState***");
	}

	public String getstatename() {
		// TODO Auto-generated method stub
		return "OnReadyState";
	}

}
