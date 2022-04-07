package myPackage;

import java.util.Scanner;

public class Myclass 
{

	public static void main(String[] args) 
	{
		//Variable Declaration
			int n,i;
		//Read data from user		
			Scanner obj = new Scanner (System.in);
			System.out.println("Enter any number");
			n=obj.nextInt();
				
			for (i=1;i<=n;i++)
			{
				if (n%i==0)
				System.out.println(i);
				
			}
	}

}
