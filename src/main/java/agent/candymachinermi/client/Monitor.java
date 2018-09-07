package agent.candymachinermi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import agent.candymachinermi.server.CandyMachineRemote;

public class Monitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CandyMachineRemote c1 = (CandyMachineRemote) Naming.lookup("rmi://localhost:6666/nanchang");
			System.out.println("机器地址： "+c1.getLocation());
			System.out.println("机器状态： "+c1.getstate().getstatename());
			System.out.println("机器剩余糖果： "+c1.getCount());
			
			CandyMachineRemote c2 = (CandyMachineRemote) Naming.lookup("rmi://localhost:6666/ganzhou");
			System.out.println("机器地址： "+c2.getLocation());
			System.out.println("机器状态： "+c2.getstate().getstatename());
			System.out.println("机器剩余糖果： "+c2.getCount());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
