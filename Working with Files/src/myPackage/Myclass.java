package myPackage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Myclass 
{

	public static void main(String[] args) throws IOException 
	{
		// Step 1: Create file object
		File f = new File ("E:\\JAVA Full Stack\\My Files\\Marks.txt");
		FileReader fr = new FileReader (f);
		
		// Step 2: Read the first char in ASCII value
		int i = fr.read();
		
		while (i!=-1)
		{
			System.out.print((char)i);
			i=fr.read();			
		}
		
		fr.close();
	}

}
