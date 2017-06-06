package Structural_Pattern.Proxy_Pattern.Real;

import Structural_Pattern.Proxy_Pattern.AbstractSubject.Search;

public class RealSearch implements Search {

	@Override
	public String dosearch(String userid, String KeyWord) {

		
		
		System.out.println("用户："+userid+"  使用："+KeyWord+"进行查询");
		
		return "查询。。。。。。。。";
	}

}
