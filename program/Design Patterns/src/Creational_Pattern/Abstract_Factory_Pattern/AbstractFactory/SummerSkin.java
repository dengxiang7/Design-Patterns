package Creational_Pattern.Abstract_Factory_Pattern.AbstractFactory;

import Creational_Pattern.Abstract_Factory_Pattern.product.Button;
import Creational_Pattern.Abstract_Factory_Pattern.product.ComboBox;
import Creational_Pattern.Abstract_Factory_Pattern.product.TextField;
import Creational_Pattern.Abstract_Factory_Pattern.product.SummerSkin.*;

public class SummerSkin implements AbstractFactory {

	@Override
	public Button CreateButton() {

		return new SummerButton();
	}

	@Override
	public TextField CreatTextField() {
		return new SummerTextField();
	}

	@Override
	public ComboBox CreatComboBox() {
		return new SummerComboBox();
	}

}
