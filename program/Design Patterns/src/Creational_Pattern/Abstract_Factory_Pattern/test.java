package Creational_Pattern.Abstract_Factory_Pattern;

import Creational_Pattern.Abstract_Factory_Pattern.AbstractFactory.AbstractFactory;
import Creational_Pattern.Abstract_Factory_Pattern.product.*;
import Creational_Pattern.Util.XMLGetBean;

public class test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		
		AbstractFactory  af=XMLGetBean.getAbstractFactory();
	  	
	   Button bt=af.CreateButton();
	   ComboBox cb=af.CreatComboBox();
	   TextField tf=af.CreatTextField();
	   
	   bt.display();
	   cb.display();
	   tf.display();
	}
	
}
