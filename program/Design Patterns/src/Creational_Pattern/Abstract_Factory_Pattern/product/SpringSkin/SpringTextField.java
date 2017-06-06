package Creational_Pattern.Abstract_Factory_Pattern.product.SpringSkin;

import Creational_Pattern.Abstract_Factory_Pattern.product.TextField;

public class SpringTextField implements TextField {

	@Override
	public void display() {
		System.out.println("’‚ «SpringTextField");
	}

}
