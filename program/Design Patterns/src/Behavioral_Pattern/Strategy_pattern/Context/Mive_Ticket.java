package Behavioral_Pattern.Strategy_pattern.Context;

import Behavioral_Pattern.Strategy_pattern.Strategy.Abstract_Strategy;

public class Mive_Ticket {

	
	private double price;
	private Abstract_Strategy discount_Strategy;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Abstract_Strategy getDiscount_Strategy() {
		return discount_Strategy;
	}
	public void setDiscount_Strategy(Abstract_Strategy discount_Strategy) {
		this.discount_Strategy = discount_Strategy;
	}
	
	public double getCurrentPrice()
	{
		return this.discount_Strategy.DoDiscount(price);
	}
}
