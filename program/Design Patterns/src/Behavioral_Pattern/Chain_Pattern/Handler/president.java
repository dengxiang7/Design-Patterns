package Behavioral_Pattern.Chain_Pattern.Handler;

import Behavioral_Pattern.Chain_Pattern.Request.request;

public class president extends AbstractHandler {

	public president() {

	}

	public president(String name) {
		this.name = name;
	}

	@Override
	public void doRequest(request req) {

		
		if(req.getAmount()<500000)
		{
			System.out.println("董事长"+this.name+"对订单："+req.getNumber()+"进行审批：    审批金额："+req.getAmount());
		}else
		{
			this.hd.doRequest(req);
		}
	}

}
