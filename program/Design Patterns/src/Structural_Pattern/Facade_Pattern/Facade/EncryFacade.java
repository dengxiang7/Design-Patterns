package Structural_Pattern.Facade_Pattern.Facade;

import Structural_Pattern.Facade_Pattern.SubSystem.*;

public class EncryFacade extends AbstractEncryptFacade {

	private CipherMachine  cm=null;
	
	private FileReader  fr=null;
	private FileWriter fw=null;
	
	@Override
	public void fielEncrypt(String filenamesrc, String filenameDesc) {
		
		String str=fr.fileReader(filenamesrc);
		String anwen=cm.Encrypt(str);
		fw.FileWriter(anwen, filenameDesc);
		
		
	}

	public EncryFacade()
	{
		cm=new CipherMachine();
		fr=new FileReader();
		fw=new FileWriter();
	}
	
}
