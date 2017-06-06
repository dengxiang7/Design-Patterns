package Creational_Pattern.Abstract_Factory_Pattern.product.SpringSkin;

import Creational_Pattern.Abstract_Factory_Pattern.product.Button;

public class SpringButton implements Button {

	@Override
	public void display() {
		System.out.println("’‚ «SpringButton");
	}

}
