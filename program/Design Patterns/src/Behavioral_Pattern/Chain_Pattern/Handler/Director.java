package Behavioral_Pattern.Chain_Pattern.Handler;

import Behavioral_Pattern.Chain_Pattern.Request.request;

public class Director extends AbstractHandler {

	
	public Director(String name)
	{
		this.name=name;
	}
	
	public Director()
	{
	
	}
	
	@Override
	public void doRequest(request req) {

		
		if(req.getAmount()<50000)
		{
			System.out.println("����"+this.name+"�Զ�����"+req.getNumber()+"����������    ������"+req.getAmount());
		}
		else{
			this.hd.doRequest(req);
		}
		
	}

}
