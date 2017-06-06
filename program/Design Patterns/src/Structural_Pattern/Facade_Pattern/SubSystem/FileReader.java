package Structural_Pattern.Facade_Pattern.SubSystem;

import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;



public class FileReader {

	public String fileReader(String filenamesrc)
	{
		String co="";
		BufferedReader br=null;
	    try {
			br=new BufferedReader(new java.io.FileReader(new File(filenamesrc)));
			
		Stream<String> str=br.lines();
			
	    Iterator<String> it= str.iterator();
	    
	    while(it.hasNext())
	    {
	    	co+=it.next();
	    }
	    
	    
	    br.close();
	    } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return co;
		
	}
}
