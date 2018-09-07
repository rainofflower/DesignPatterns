package agent.candymachinermi.server;

import java.rmi.RemoteException;

public class Test {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		CandyMachine candyMachine = new CandyMachine("до╡Щ",6);
		
		candyMachine.printstate();
		
		candyMachine.insertCoin();
		candyMachine.printstate();
		
		candyMachine.turnCrank();
		candyMachine.printstate();
		
		candyMachine.insertCoin();
		candyMachine.printstate();
		
		candyMachine.turnCrank();
		candyMachine.printstate();
		
		
	}

}
