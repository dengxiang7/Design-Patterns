package Creational_Pattern.Factory_Method_Pattern.LoggerFactory;

import Creational_Pattern.Factory_Method_Pattern.Logger.DBLogger;
import Creational_Pattern.Factory_Method_Pattern.Logger.Logger;

public class DBLoggerFactory implements Factory {

	@Override
	public Logger CreateLogger() {

		//��һЩ��ʼ�������������ݿ����ӵ�
		Logger logger=new DBLogger();
		
		return logger;
	}

}
