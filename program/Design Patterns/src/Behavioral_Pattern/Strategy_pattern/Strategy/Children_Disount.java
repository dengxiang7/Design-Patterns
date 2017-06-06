package Behavioral_Pattern.Strategy_pattern.Strategy;

public class Children_Disount implements Abstract_Strategy {

	@Override
	public double DoDiscount(double price) {
		System.out.println("¶ùÍ¯Æ±Æ±");
		return price-10;
	}

}
