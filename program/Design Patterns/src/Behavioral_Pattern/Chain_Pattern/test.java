package Behavioral_Pattern.Chain_Pattern;

import Behavioral_Pattern.Chain_Pattern.Handler.Congress;
import Behavioral_Pattern.Chain_Pattern.Handler.Director;
import Behavioral_Pattern.Chain_Pattern.Handler.VicePresident;
import Behavioral_Pattern.Chain_Pattern.Handler.president;
import Behavioral_Pattern.Chain_Pattern.Request.request;

public class test {

	public static void main(String[] args) {

		Director dir=new Director("���޼�");
		VicePresident vp=new VicePresident("���");
		president p=new president("����");
		Congress  cg=new Congress("���»�");
		
		dir.setHd(vp);
		vp.setHd(p);
		p.setHd(cg);
		
		request req=new request(1160000, 1001, "������������");
		dir.doRequest(req);
		
	}

}
