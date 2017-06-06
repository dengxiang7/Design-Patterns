package Behavioral_Pattern.Observer_Pattern.Observer;

import Behavioral_Pattern.Observer_Pattern.Subject.AbstractSubjectt;

public class player implements AbstractObserve {

	private String name;
	

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public player()
	{
		
	}
	public player(String name)
	{
		this.name=name;
	}
	@Override
	public void help() {

		System.out.println(this.name+"正在前往支援！");
	}

	@Override
	public void beAttach(AbstractSubjectt  ac) {
		System.out.println(this.name+"请求支援！");
		ac.notifyObserver(this);
	}

}
