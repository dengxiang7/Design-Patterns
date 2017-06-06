package Behavioral_Pattern.Observer_Pattern.Subject;

import Behavioral_Pattern.Observer_Pattern.Observer.AbstractObserve;

public class Controller extends AbstractSubjectt {

	public Controller(String name)
	{
	   this.name=name;
	   System.out.println(this.name+"ս�Ӵ����ɹ�");
	}
	
	@Override
	public void notifyObserver(AbstractObserve s) {

		System.out.println(this.name+"ս�ӽ���֪ͨ   "+s.getName()+"���ڱ�������");
		for(AbstractObserve playerrr:this.player)
		{
			if(!(playerrr.getName().equals(s.getName())))
			{
				playerrr.help();
			}
		}
	}

}
