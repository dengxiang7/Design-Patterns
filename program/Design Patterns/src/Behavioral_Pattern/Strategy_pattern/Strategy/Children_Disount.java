package Behavioral_Pattern.Strategy_pattern.Strategy;

public class Children_Disount implements Abstract_Strategy {

	@Override
	public double DoDiscount(double price) {
		System.out.println("��ͯƱƱ");
		return price-10;
	}

}
