package Structural_Pattern.Proxy_Pattern;

import Structural_Pattern.Proxy_Pattern.AbstractSubject.Search;
import Structural_Pattern.Proxy_Pattern.Proxy.ProxySearch;

public class test {

	
	public static void main(String[] args) {
		
		Search s=new ProxySearch();
		
		s.dosearch("Ñî¹ý", "ÖÐ");
		
	}
	
}
