package Singleton;

public class Test {
	public class A{
		public A(){			
		}
	}
	
	public class B{
		A a1,a2;
		public void test(){
			//������ͬʵ�������ڴ���ռ�ò�ͬ�ĵ�ַ��
			a1 = new A();
			a2 = new A();
		}		
	}
}
