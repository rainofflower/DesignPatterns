package agent.candymachinermi.server;

public class OnReadyState implements State {

	private transient CandyMachine candyMachine;
	
	public OnReadyState(CandyMachine candyMachine) {
		this.candyMachine = candyMachine;
	}

	@Override
	public void insertCoin() {
		// TODO Auto-generated method stub
		System.out.println("you have inserted a coin,next,please turn crank!");
		candyMachine.setState(candyMachine.hasCoin);
	}

	@Override
	public void returnCoin() {
		// TODO Auto-generated method stub
		System.out.println("you haven't inserted a coin yet!");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("you turned,but you haven't insert a coin!");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printstate() {
		// TODO Auto-generated method stub
		System.out.println("***OnReadyState***");
	}

	@Override
	public String getstatename() {
		// TODO Auto-generated method stub
		return "OnReadyState";
	}

}
