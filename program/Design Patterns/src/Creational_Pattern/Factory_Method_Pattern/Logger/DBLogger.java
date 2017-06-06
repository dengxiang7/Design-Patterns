package Creational_Pattern.Factory_Method_Pattern.Logger;

public class DBLogger implements Logger{

	@Override
	public void writeLogger() {

		System.out.println("这是数据库日志");
	}

}
