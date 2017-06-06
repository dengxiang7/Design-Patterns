package Creational_Pattern.Util;

import java.util.List;
import java.util.Map;

import Creational_Pattern.Abstract_Factory_Pattern.AbstractFactory.AbstractFactory;
import Creational_Pattern.Factory_Method_Pattern.LoggerFactory.Factory;

public class XMLGetBean {

	public static Factory getFactory() throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		XMLReader xmlreader=new XMLReader();
		Map map=xmlreader.reader();
		
		Class c=Class.forName((String)map.get("Factory"));
		Factory factory=(Factory) c.newInstance();
		
		return factory;
	}
	
	
	public static AbstractFactory getAbstractFactory() throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		XMLReader xmlreader=new XMLReader();
		Map map=xmlreader.reader();
		
		Class c=Class.forName((String)map.get("AbstractFactory"));
		AbstractFactory abstractfactory=(AbstractFactory) c.newInstance();
		
		return abstractfactory;
	}
}
