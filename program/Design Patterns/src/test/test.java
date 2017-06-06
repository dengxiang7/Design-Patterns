package test;
import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class test {

	
	public static void main(String[] args) throws DocumentException {
//		SAXReader sax=new SAXReader();
//		
//		
//		
//		Document document=sax.read(new File("src\\Creational_Pattern\\config.xml"));
//		Element element=document.getRootElement();
//		
//		
//		List<Element> list=element.elements();
//		
//		Iterator it=list.iterator();
//		while(it.hasNext()){
//			Element el=(Element) it.next();
//			
//			
//			System.out.println(el.getName());
//			if(el.getName().equals("component-scan"))
//			{
//				String s=el.attributeValue("base-package");
//				System.out.println(s);
//			}
//			
//		}
//		
		
		
		
		String ba="sdfjl;sdjflsdjk;asjdlfjl";
		String []arr=ba.split(";");
		System.out.println(arr[0]+"     "+arr[1]+"       "+arr[2]);
		
	}
	
}
