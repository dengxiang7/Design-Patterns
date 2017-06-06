package Creational_Pattern.Singleton_Pattern;

/*
 * 饿汉模式和懒汉模式：
 * 形成原因:在创建LoadBalancer()方法中如果私有化的构造函数中要做大量的初始化工作，
 *          而在第一个请求创建实例过程中，又出现第二个请求创建实例，由于第一个为创建成功，所以
 *          第二个请求也会通过，这就导致创建了两个实例。
 *          
 * 解决方法：
 *    饿汉模式：在定义静态变量时初始化   private static LoadBalancer instance=new LoadBalancer();
 *              由于在一开始初始化故为饿汉模式
 *     饿汉模式缺陷：无论系统是否需要调用该实例都会创建
 *     
 *     懒汉模式：在系统调用时在创建，但要考虑多线程问题
 * 
 */
public class EagerSingleton {
	
	private static EagerSingleton instance=new EagerSingleton();
	
	private EagerSingleton()
	{
		
	}
	
	
	public static EagerSingleton getInstance()
	{
		return instance;
	}

}
