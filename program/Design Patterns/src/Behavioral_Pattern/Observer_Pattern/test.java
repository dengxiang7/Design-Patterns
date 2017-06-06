package Behavioral_Pattern.Observer_Pattern;

import Behavioral_Pattern.Observer_Pattern.Observer.player;
import Behavioral_Pattern.Observer_Pattern.Subject.Controller;

public class test {

	public static void main(String[] args) {

		Controller  cc=new Controller("金庸群侠");
		
		player  p1=new player("杨过");
		cc.join(p1);
		
		player  p2=new player("令狐冲");
		cc.join(p2);
		
		player  p3=new player("郭靖");
		cc.join(p3);
		
		player  p4=new player("石中天");
		cc.join(p4);
		
		
		p1.beAttach(cc);
	}

}
