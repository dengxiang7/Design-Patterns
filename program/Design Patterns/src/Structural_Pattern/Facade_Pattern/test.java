package Structural_Pattern.Facade_Pattern;

import Structural_Pattern.Facade_Pattern.Facade.EncryFacade;

public class test {

	
	
	public static void main(String[] args) {
		String filesrc="src\\Structural_Pattern\\Facade_Pattern\\description.txt";
		String filedesc="src\\Structural_Pattern\\Facade_Pattern\\anwen.txt";
		
		EncryFacade  cf=new EncryFacade();
		cf.fielEncrypt(filesrc, filedesc);
		
		
	}
	
}
