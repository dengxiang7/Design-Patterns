package Behavioral_Pattern.Strategy_pattern;

import Behavioral_Pattern.Strategy_pattern.Context.Mive_Ticket;
import Behavioral_Pattern.Strategy_pattern.Strategy.Children_Disount;
import Behavioral_Pattern.Strategy_pattern.Util.XMLGetBean;

public class test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Mive_Ticket  mt=new Mive_Ticket();
		mt.setPrice(187.4);
		
		Children_Disount  sd=new Children_Disount();
		mt.setDiscount_Strategy(sd);
		
		System.out.println("原始票价："+mt.getPrice());
		System.out.println("折后票价："+mt.getCurrentPrice());
		
		mt.setDiscount_Strategy(XMLGetBean.getBean("Strategy"));
		System.out.println("原始票价："+mt.getPrice());
		System.out.println("折后票价："+mt.getCurrentPrice());
	}

}
