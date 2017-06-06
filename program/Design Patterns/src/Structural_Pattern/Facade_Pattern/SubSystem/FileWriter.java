package Structural_Pattern.Facade_Pattern.SubSystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class FileWriter {

	
	public void FileWriter(String str,String filenamedesc)
	{
		BufferedWriter bw=null;
		
		try {
			bw=new BufferedWriter(new java.io.FileWriter(new File(filenamedesc)));
		 
			bw.write(str);
			bw.flush();
			bw.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
