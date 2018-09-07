package Singleton;

public class TestSingleton {

	public static void main(String[] args) {

		//测试多线程环境下单例模式是否有效
		
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
