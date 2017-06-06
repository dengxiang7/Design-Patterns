package Behavioral_Pattern.Strategy_pattern.Strategy;

public class Student_Discount implements Abstract_Strategy {

	@Override
	public double DoDiscount(double price) {

		System.out.println("Ñ§ÉúÆ±");
		return price*0.8;
	}

}
