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
			System.out.println("������ַ�� "+c1.getLocation());
			System.out.println("����״̬�� "+c1.getstate().getstatename());
			System.out.println("����ʣ���ǹ��� "+c1.getCount());
			
			CandyMachineRemote c2 = (CandyMachineRemote) Naming.lookup("rmi://localhost:6666/ganzhou");
			System.out.println("������ַ�� "+c2.getLocation());
			System.out.println("����״̬�� "+c2.getstate().getstatename());
			System.out.println("����ʣ���ǹ��� "+c2.getCount());
			
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
