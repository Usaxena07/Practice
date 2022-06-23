package myPackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Myclass 
{

	public static void main(String[] args) throws IOException 
	{
		var allLines = Files.readAllLines(Paths.get ("E:\\JAVA Full Stack\\My Files\\Marks.txt"));
		
		for (var r:allLines)
			System.out.println(r);
	
	}

}
