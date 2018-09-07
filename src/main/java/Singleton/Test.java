package Singleton;

public class Test {
	public class A{
		public A(){			
		}
	}
	
	public class B{
		A a1,a2;
		public void test(){
			//两个不同实例（在内存中占用不同的地址）
			a1 = new A();
			a2 = new A();
		}		
	}
}
