package Creational_Pattern.Factory_Method_Pattern.LoggerFactory;

import Creational_Pattern.Factory_Method_Pattern.Logger.FileLogger;
import Creational_Pattern.Factory_Method_Pattern.Logger.Logger;

public class FileLoggerFactory implements Factory{

	@Override
	public Logger CreateLogger() {

		Logger logger=new FileLogger();
		return logger;
	}

}
