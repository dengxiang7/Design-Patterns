package Behavioral_Pattern.Observer_Pattern;

import Behavioral_Pattern.Observer_Pattern.Observer.player;
import Behavioral_Pattern.Observer_Pattern.Subject.Controller;

public class test {

	public static void main(String[] args) {

		Controller  cc=new Controller("��ӹȺ��");
		
		player  p1=new player("���");
		cc.join(p1);
		
		player  p2=new player("�����");
		cc.join(p2);
		
		player  p3=new player("����");
		cc.join(p3);
		
		player  p4=new player("ʯ����");
		cc.join(p4);
		
		
		p1.beAttach(cc);
	}

}
