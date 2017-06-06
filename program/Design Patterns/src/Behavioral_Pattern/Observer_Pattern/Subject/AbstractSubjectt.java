package Behavioral_Pattern.Observer_Pattern.Subject;

import java.util.ArrayList;
import java.util.List;

import Behavioral_Pattern.Observer_Pattern.Observer.AbstractObserve;

public abstract class AbstractSubjectt {

	protected String name;
	protected List<AbstractObserve>  player=new ArrayList<AbstractObserve>();
	
	public AbstractSubjectt()
	{
		
	}
	
	public AbstractSubjectt(String name)
	{
		this.name=name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void join(AbstractObserve s)
	{
		player.add(s);
	}
	public void delete(AbstractObserve s)
	{
		player.remove(s);
	}
	
	public abstract void notifyObserver(AbstractObserve s);
}
