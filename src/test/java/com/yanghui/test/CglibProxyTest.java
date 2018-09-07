package com.yanghui.test;

import org.junit.Test;

import agent.cglib.UserDao;
import agent.cglib.UserDaoCglibProxy;

public class CglibProxyTest {

	@Test
	public void test1() {
		UserDao userDao = new UserDao();
		UserDao proxy = (UserDao) new UserDaoCglibProxy(userDao).getProxyInstance(); 
		proxy.insert();
	}
}
