package Behavioral_Pattern.Strategy_pattern.Strategy;

public class Student_Discount implements Abstract_Strategy {

	@Override
	public double DoDiscount(double price) {

		System.out.println("ѧ��Ʊ");
		return price*0.8;
	}

}
