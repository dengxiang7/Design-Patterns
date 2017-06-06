package Creational_Pattern.Factory_Method_Pattern;

import Creational_Pattern.Factory_Method_Pattern.LoggerFactory.DBLoggerFactory;
import Creational_Pattern.Factory_Method_Pattern.LoggerFactory.Factory;
import Creational_Pattern.Util.XMLGetBean;
import Creational_Pattern.Factory_Method_Pattern.Logger.Logger;
public class test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Factory factory=XMLGetBean.getFactory();
		
		Logger logger=factory.CreateLogger();
		
		logger.writeLogger();
		
	}

}
