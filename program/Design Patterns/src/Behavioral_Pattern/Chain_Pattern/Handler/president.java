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
			System.out.println("���³�"+this.name+"�Զ�����"+req.getNumber()+"����������    ������"+req.getAmount());
		}else
		{
			this.hd.doRequest(req);
		}
	}

}
