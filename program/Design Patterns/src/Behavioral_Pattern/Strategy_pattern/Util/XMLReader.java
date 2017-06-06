package Behavioral_Pattern.Strategy_pattern.Util;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XMLReader {

	public Map reader()
	{
		SAXReader sax=new SAXReader();
		Map classpath=new HashMap();
		try {
			Document document=sax.read(new File("src\\Behavioral_Pattern\\Strategy_pattern\\config.xml"));
		
			Element element=document.getRootElement();
		    
			List<Element> list=element.elements();
			
			
			
			Iterator it=list.iterator();
			while(it.hasNext())
			{
				Element el=(Element) it.next();
				List<Element> elist=el.elements();
				String name="";
				String path="";
				name=elist.get(0).getText();
				path=elist.get(1).getText();
				
				classpath.put(name, path);
			}
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
		return classpath;
	}
	
}
