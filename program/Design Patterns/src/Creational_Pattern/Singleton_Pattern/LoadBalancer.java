package Creational_Pattern.Singleton_Pattern;


//������
public class LoadBalancer {

	
	//˽�г�Ա������ֻ��֤����һ��ʵ��
	private static LoadBalancer instance=null;
	
	
	//���캯��˽�л���������֤�ˣ������಻��ʵ��������
	private LoadBalancer()
	{
		
	}
	
	
	//���г�Ա������ ����ʵ��������֤��ʵ��ֻ����һ��
	public static LoadBalancer getInstance()
	{
		if(instance==null)
		{
			instance=new LoadBalancer();
		}
		return instance;
	}
	
}
