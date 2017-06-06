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
 *                ʹ��˫�ؼ�����������
 */

public class LazySingleton {

	private static LazySingleton instance = null;

	private LazySingleton() {

	}

	// ��һ����
	// ��������� ����̶߳�ʱ��Ӱ��Ч��
	/*
	 * synchronized public static LazySingleton getInstance(){
	 * 
	 * if(instance==null) { instance=new LazySingleton(); } return instance; }
	 */

	// �ڶ�����
	//����A��B�߳�ͬʱ���ø÷����Ի�õ�����ʵ��
	/*
	public static LazySingleton getInstance() {

		if (instance == null) {
		    //���������
			synchronized (LazySingleton.class) {
				instance = new LazySingleton();
			}
			
		}
		return instance;
	}
	*/
	
	//�������� ��˫����
	public static LazySingleton getInstance() {

		//һ���ж�
		if (instance == null) {
			//���������
			synchronized (LazySingleton.class) {
				//�����ж�
				if (instance == null) {
				instance = new LazySingleton();
				}
			}
			
		}
		return instance;
	}
	
}
