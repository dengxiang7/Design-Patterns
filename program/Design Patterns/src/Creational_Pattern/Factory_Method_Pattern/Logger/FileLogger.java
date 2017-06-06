package Creational_Pattern.Factory_Method_Pattern.Logger;

public class FileLogger implements Logger{

	@Override
	public void writeLogger() {
		System.out.println("这是文件日志");		
	}

}
