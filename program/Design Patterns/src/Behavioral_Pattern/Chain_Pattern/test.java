package Behavioral_Pattern.Chain_Pattern;

import Behavioral_Pattern.Chain_Pattern.Handler.Congress;
import Behavioral_Pattern.Chain_Pattern.Handler.Director;
import Behavioral_Pattern.Chain_Pattern.Handler.VicePresident;
import Behavioral_Pattern.Chain_Pattern.Handler.president;
import Behavioral_Pattern.Chain_Pattern.Request.request;

public class test {

	public static void main(String[] args) {

		Director dir=new Director("ÕÅÎŞ¼É");
		VicePresident vp=new VicePresident("Ñî¹ı");
		president p=new president("¹ù¾¸");
		Congress  cg=new Congress("¶­ÊÂ»á");
		
		dir.setHd(vp);
		vp.setHd(p);
		p.setHd(cg);
		
		request req=new request(1160000, 1001, "¹ºÂòÍÀÁúµ¶£¡");
		dir.doRequest(req);
		
	}

}
