package Structural_Pattern.JavaProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import Structural_Pattern.JavaProxy.AbstractSubject.DocumentDao;
import Structural_Pattern.JavaProxy.AbstractSubject.userDao;
import Structural_Pattern.JavaProxy.proxy.DaoHandler;
import Structural_Pattern.JavaProxy.real.realDocument;
import Structural_Pattern.JavaProxy.real.realUserDao;

public class test {

	public static void main(String[] args) {

		InvocationHandler hd=null;
		
		userDao  Reus=new realUserDao();
		userDao  ProxyUD=null;
		 hd=new DaoHandler(Reus);
		 ProxyUD =(userDao) Proxy.newProxyInstance(userDao.class.getClassLoader(), new  Class[]{userDao.class}, hd);
		
		System.out.println( ProxyUD.FindUser("уенч╪и"));
		
		
		System.out.println("--------------------------");
		
		DocumentDao  Redd=new realDocument();
		DocumentDao  ProxyDD=null;
		 hd=new DaoHandler(Redd);
		 ProxyDD =(DocumentDao) Proxy.newProxyInstance(DocumentDao.class.getClassLoader(), new  Class[]{DocumentDao.class}, hd);
		
		System.out.println( ProxyDD.deleteDocument("D001"));
		
	}

}
