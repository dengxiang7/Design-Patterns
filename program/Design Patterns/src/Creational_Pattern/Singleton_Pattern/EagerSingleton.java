package Creational_Pattern.Singleton_Pattern;

/*
 * ����ģʽ������ģʽ��
 * �γ�ԭ��:�ڴ���LoadBalancer()���������˽�л��Ĺ��캯����Ҫ�������ĳ�ʼ��������
 *          ���ڵ�һ�����󴴽�ʵ�������У��ֳ��ֵڶ������󴴽�ʵ�������ڵ�һ��Ϊ�����ɹ�������
 *          �ڶ�������Ҳ��ͨ������͵��´���������ʵ����
 *          
 * ���������
 *    ����ģʽ���ڶ��徲̬����ʱ��ʼ��   private static LoadBalancer instance=new LoadBalancer();
 *              ������һ��ʼ��ʼ����Ϊ����ģʽ
 *     ����ģʽȱ�ݣ�����ϵͳ�Ƿ���Ҫ���ø�ʵ�����ᴴ��
 *     
 *     ����ģʽ����ϵͳ����ʱ�ڴ�������Ҫ���Ƕ��߳�����
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
