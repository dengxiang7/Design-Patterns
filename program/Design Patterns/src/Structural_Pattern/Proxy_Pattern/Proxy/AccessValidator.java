package Structural_Pattern.Proxy_Pattern.Proxy;

public class AccessValidator {

	
	public  boolean validator(String userid)
	{
		
		System.out.println("�����ݿ��н�����֤");
	
		if(userid.equals("���"))
		{
			System.out.println("�û����ڣ���¼�ɹ���");
			return true;
		}
		else{
			System.out.println("�û������ڣ���¼ʧ�ܣ�");
			return false;
		}
		
	}
	
}
