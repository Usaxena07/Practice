package myPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Myclass 
{

	public static void main(String[] args) throws IOException 
	{
		File f = new File ("E:\\JAVA Full Stack\\My Files\\Names.txt");
		FileWriter fw = new FileWriter (f, true);
		
		fw.write("Uday\n");
		
		fw.close();
		
		System.out.println("Writing Successful");

	}

}
