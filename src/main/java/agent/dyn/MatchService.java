package agent.dyn;

import java.lang.reflect.Proxy;

public class MatchService {

	public MatchService(){
		PersonBean joe = getPersonInfo("joe", "male", "running");
		PersonBean OwnerProxy = getOwnerProxy(joe);
		
		System.out.println("Name is "+OwnerProxy.getName());
		System.out.println("Interests is "+OwnerProxy.getInterests());
		
		OwnerProxy.setInterests("Bowling");
		System.out.println("Interests is "+OwnerProxy.getInterests());
		OwnerProxy.setHotOrNotRating(50);
		System.out.println("Rating is "+OwnerProxy.getHotOrNotRating());
		
		System.out.println("**************");
		
		PersonBean NonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("Name is "+NonOwnerProxy.getName());
		System.out.println("Interests are "+NonOwnerProxy.getInterests());
		
		NonOwnerProxy.setInterests("movie");
		System.out.println("Interests are "+NonOwnerProxy.getInterests());
		NonOwnerProxy.setHotOrNotRating(60);
		System.out.println("Rating is "+NonOwnerProxy.getHotOrNotRating());
	}
	
	PersonBean getPersonInfo(String name, String gender, String interests){
		PersonBean person = new PersonBeanImpl();
		person.setName(name);
		person.setGender(gender);
		person.setInterests(interests);
		return person;
	}
	
	//用户访问自己的代理
	PersonBean getOwnerProxy(PersonBean person){
		//由Proxy服务产生一个proxy实体
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
	}
	//访问他人信息的代理
	PersonBean getNonOwnerProxy(PersonBean person){
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
	}
}
