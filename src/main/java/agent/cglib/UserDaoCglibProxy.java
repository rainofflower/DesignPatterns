package agent.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * Cglib代理
 * @author yanghui
 *
 */
public class UserDaoCglibProxy implements MethodInterceptor{

	private Object targetObject;
	
	public UserDaoCglibProxy(Object targetObj) {
		this.targetObject = targetObj;
	}
	
	public Object getProxyInstance() {
		//工具类
		Enhancer enhancer = new Enhancer();
		//设置代理父类
		enhancer.setSuperclass(targetObject.getClass());
		//设置回调函数
		enhancer.setCallback(this);
		//创建子类
		return enhancer.create();
	}
	
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy arg) throws Throwable {
		System.out.println("Cglib对象，开启事务...");
		Object ret = method.invoke(targetObject, args);
		System.out.println("Cglib对象，提交/回滚事务...");
		return ret;
	}

}
