package Singleton;

public class TestSingleton {

	public static void main(String[] args) {

		//���Զ��̻߳����µ���ģʽ�Ƿ���Ч
		
		Thread t1  = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Singleton.getInstance());
			}
		});
		Thread t2  = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Singleton.getInstance());
			}
		});
		
		t1.start();
		t2.start();		
		System.out.println(Singleton.getInstance());
	}

}
