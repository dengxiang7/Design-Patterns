package Structural_Pattern.Proxy_Pattern.Real;

import Structural_Pattern.Proxy_Pattern.AbstractSubject.Search;

public class RealSearch implements Search {

	@Override
	public String dosearch(String userid, String KeyWord) {

		
		
		System.out.println("�û���"+userid+"  ʹ�ã�"+KeyWord+"���в�ѯ");
		
		return "��ѯ����������������";
	}

}
