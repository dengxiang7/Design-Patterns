package Creational_Pattern.Singleton_Pattern;

public class test {

	public static void main(String[] args) {

		
//		LoadBalancer  l1=LoadBalancer.getInstance();
//		LoadBalancer l2=LoadBalancer.getInstance();
//		if(l1==l2)
//		{
//			System.out.println("l1和l2为同一个实例");
//		}
		
		
		EagerSingleton  e1=EagerSingleton.getInstance();
		EagerSingleton  e2=EagerSingleton.getInstance();
		if(e1==e2)
		{
				System.out.println("e1和e2为同一个实例");
			}
		
		
		
		LazySingleton  l1=LazySingleton.getInstance();
		LazySingleton  l2=LazySingleton.getInstance();
		if(l1==l2)
			{
				System.out.println("l1和l2为同一个实例");
			}
		
	}

}
