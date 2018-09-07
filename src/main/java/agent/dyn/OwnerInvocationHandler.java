package agent.dyn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
	PersonBean person;
	
	public OwnerInvocationHandler(PersonBean person) {
		//��������person��Ϊ���ƶ���
		this.person = person;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		if(method.getName().startsWith("get")){
			return method.invoke(person, args);
		}
		else if(method.getName().equals("setHotOrNotRating")){
			return new IllegalAccessError();
		}
		else if(method.getName().startsWith("set")){
			return method.invoke(person, args);
		}
		return null;
	}

}
