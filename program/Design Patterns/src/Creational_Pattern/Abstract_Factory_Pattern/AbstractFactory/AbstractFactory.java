package Creational_Pattern.Abstract_Factory_Pattern.AbstractFactory;

import Creational_Pattern.Abstract_Factory_Pattern.product.Button;
import Creational_Pattern.Abstract_Factory_Pattern.product.ComboBox;
import Creational_Pattern.Abstract_Factory_Pattern.product.TextField;

public interface AbstractFactory {

	public Button CreateButton();
	public TextField CreatTextField();
	public ComboBox  CreatComboBox();
	
}
