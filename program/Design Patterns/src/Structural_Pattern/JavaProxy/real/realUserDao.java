package Structural_Pattern.JavaProxy.real;

import Structural_Pattern.JavaProxy.AbstractSubject.userDao;

public class realUserDao implements userDao {

	@Override
	public boolean FindUser(String userid) {

		if(userid.equals("���޼�"))
		{
			System.out.println("��ѯ�ɹ�");
			return true;
		}else{
			System.out.println("��ѯʧ��");
			return false;
		}
		
		
	}

}
