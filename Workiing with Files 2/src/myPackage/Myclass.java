package myPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Myclass 
{

	public static void main(String[] args) throws IOException 
	{
		Scanner obj = new Scanner (System.in);
		String Subject;
		System.out.println("Enter subject name:");
		Subject = obj.nextLine();
		boolean isFound=false;
		
		//Step 1: Create file object
		File f = new File ("E:\\JAVA Full Stack\\My Files\\Marks.txt");
		FileReader fr = new FileReader (f);
		BufferedReader br = new BufferedReader (fr);
		
		//Step 2: Read the first line in ASCII value
		String line = br.readLine();
		
		while (line!=null)
		{
			var data = line.split(",");
			if (data[0].equals(Subject))
			{
			System.out.println(data[1]);
			isFound=true;
			break;
			
		}
			line = br.readLine();
		}
			br.close();
		
			if(isFound==false)
			System.out.println("Subject not found");
	}

}
