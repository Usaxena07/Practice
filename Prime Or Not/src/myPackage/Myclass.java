package myPackage;

import java.util.Scanner;

public class Myclass 
{

	public static void main(String[] args) 
	{
		//Variable Declaration
		int a, i=0;
		String result;
		
		//Read data from user
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the number");
		a=obj.nextInt();
		
		for (i=2;i<a;i++)
		{
			if (a%i==0)
				break;
		}
		  result = (a==i)? "Prime":"Not Prime";
		
		System.out.println(result);
	
	}

}
