package Creational_Pattern.Singleton_Pattern;


//单例类
public class LoadBalancer {

	
	//私有成员变量，只保证存在一个实例
	private static LoadBalancer instance=null;
	
	
	//构造函数私有化，这样保证了，其他类不能实例化该类
	private LoadBalancer()
	{
		
	}
	
	
	//共有成员方法， 创建实例，并保证该实例只存在一个
	public static LoadBalancer getInstance()
	{
		if(instance==null)
		{
			instance=new LoadBalancer();
		}
		return instance;
	}
	
}
