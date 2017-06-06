package Behavioral_Pattern.Observer_Pattern.Subject;

import Behavioral_Pattern.Observer_Pattern.Observer.AbstractObserve;

public class Controller extends AbstractSubjectt {

	public Controller(String name)
	{
	   this.name=name;
	   System.out.println(this.name+"战队创建成功");
	}
	
	@Override
	public void notifyObserver(AbstractObserve s) {

		System.out.println(this.name+"战队紧急通知   "+s.getName()+"正在被攻击！");
		for(AbstractObserve playerrr:this.player)
		{
			if(!(playerrr.getName().equals(s.getName())))
			{
				playerrr.help();
			}
		}
	}

}
