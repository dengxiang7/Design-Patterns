package Behavioral_Pattern.Chain_Pattern.Handler;

import Behavioral_Pattern.Chain_Pattern.Request.request;

public class Congress extends AbstractHandler {

	
	public Congress(String name)
	{
		this.name=name;
	}
	
	public Congress()
	{
		
	}
	
	
	@Override
	public void doRequest(request req) {

	System.out.println("�ٿ����»�ԣ� "+req.getNumber()+"��������������");
		
	}

}
