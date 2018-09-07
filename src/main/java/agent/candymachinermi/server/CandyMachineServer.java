package agent.candymachinermi.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CandyMachineServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CandyMachine server = new CandyMachine("nanchang", 10);
			LocateRegistry.createRegistry(6666);	
			Naming.bind("rmi://localhost:6666/nanchang", server);
			server.insertCoin();
			server.turnCrank();
			
			server = new CandyMachine("ganzhou", 5);
			Naming.bind("rmi://localhost:6666/ganzhou", server);
			
			System.out.println("远程CandyMachine对象绑定成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 System.out.println("创建远程对象发生异常！"); 
		}
	}

}
