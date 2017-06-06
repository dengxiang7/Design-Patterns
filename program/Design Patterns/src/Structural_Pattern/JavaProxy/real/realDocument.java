package Structural_Pattern.JavaProxy.real;

import Structural_Pattern.JavaProxy.AbstractSubject.DocumentDao;

public class realDocument implements DocumentDao {

	@Override
	public boolean deleteDocument(String DocumentId) {

		if(DocumentId.equals("D001"))
		{
			System.out.println(DocumentId+"É¾³ý³É¹¦");
			return true;
		}else
		{
			System.out.println(DocumentId+"É¾³ýÊ§°Ü");
			return false;
		}
		
		
	}

}
