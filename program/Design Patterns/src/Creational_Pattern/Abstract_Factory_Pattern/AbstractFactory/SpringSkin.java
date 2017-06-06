package Creational_Pattern.Abstract_Factory_Pattern.AbstractFactory;

import Creational_Pattern.Abstract_Factory_Pattern.product.Button;
import Creational_Pattern.Abstract_Factory_Pattern.product.ComboBox;
import Creational_Pattern.Abstract_Factory_Pattern.product.TextField;
import Creational_Pattern.Abstract_Factory_Pattern.product.SpringSkin.SpringButton;
import Creational_Pattern.Abstract_Factory_Pattern.product.SpringSkin.SpringComboBox;
import Creational_Pattern.Abstract_Factory_Pattern.product.SpringSkin.SpringTextField;
import Creational_Pattern.Abstract_Factory_Pattern.product.SummerSkin.*;

public class SpringSkin implements AbstractFactory {

	@Override
	public Button CreateButton() {
		return new SpringButton();
	}

	@Override
	public TextField CreatTextField() {
		return new SpringTextField();
	}

	@Override
	public ComboBox CreatComboBox() {
		return new SpringComboBox();
	}

}
