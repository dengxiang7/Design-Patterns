package Behavioral_Pattern.Chain_Pattern.Handler;

import Behavioral_Pattern.Chain_Pattern.Request.request;

public abstract class  AbstractHandler {

	protected AbstractHandler hd;
	protected String name;
	
	
	
	public void setHd(AbstractHandler hd) {
		this.hd = hd;
	}



	public abstract void doRequest(request req);
	
}
