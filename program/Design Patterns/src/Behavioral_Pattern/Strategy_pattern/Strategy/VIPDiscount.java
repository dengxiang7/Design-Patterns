package Behavioral_Pattern.Strategy_pattern.Strategy;

public class VIPDiscount implements Abstract_Strategy {

	@Override
	public double DoDiscount(double price) {
		System.out.println("VIP");
		return price*0.5;
	}

}
