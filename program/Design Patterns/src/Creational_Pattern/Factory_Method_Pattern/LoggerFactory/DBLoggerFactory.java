package Creational_Pattern.Factory_Method_Pattern.LoggerFactory;

import Creational_Pattern.Factory_Method_Pattern.Logger.DBLogger;
import Creational_Pattern.Factory_Method_Pattern.Logger.Logger;

public class DBLoggerFactory implements Factory {

	@Override
	public Logger CreateLogger() {

		//做一些初始化工作，如数据库连接等
		Logger logger=new DBLogger();
		
		return logger;
	}

}
