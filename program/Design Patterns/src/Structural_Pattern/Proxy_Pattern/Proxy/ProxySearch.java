package Structural_Pattern.Proxy_Pattern.Proxy;

import Structural_Pattern.Proxy_Pattern.AbstractSubject.Search;
import Structural_Pattern.Proxy_Pattern.Real.RealSearch;

public class ProxySearch implements Search {

	private RealSearch  real=new RealSearch();
	
	private AccessValidator  av=new AccessValidator();
	
	private Logger lo=new Logger();
	
	@Override
	public String dosearch(String userid, String KeyWord) {
		
		
		if(av.validator(userid))
		{
			String res=real.dosearch(userid, KeyWord);
			lo.WriteLogg();
			return res;
		}
		
		return null;
	}

}
