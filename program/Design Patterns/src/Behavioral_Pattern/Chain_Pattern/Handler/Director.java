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
			System.out.println("主任"+this.name+"对订单："+req.getNumber()+"进行审批：    审批金额："+req.getAmount());
		}
		else{
			this.hd.doRequest(req);
		}
		
	}

}
