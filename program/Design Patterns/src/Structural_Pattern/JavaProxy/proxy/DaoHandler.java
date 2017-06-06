package Structural_Pattern.JavaProxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import Structural_Pattern.JavaProxy.real.realDocument;
import Structural_Pattern.JavaProxy.real.realUserDao;

public class DaoHandler<T> implements InvocationHandler {

	
	private T a;
	
	
	public DaoHandler()
	{
		
	}
	
	public DaoHandler(T b)
	{
		this.a=b;
	}
	
	@Override
	public Object invoke(Object arg0, Method method, Object[] arg2) throws Throwable {
		
		before();
		Object re=method.invoke(a, arg2);
		after();
		return re;
	}

	
	public void before()
	{
		System.out.println("���÷���֮ǰ����");
	}
	
	public void after()
	{
		System.out.println("���÷���֮����");
	}
}
