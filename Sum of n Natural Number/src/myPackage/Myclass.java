package myPackage;

import java.util.Scanner;

public class Myclass 
{

	public static void main(String[] args) 
	{
		//Variable Declaration
		int a, sum=0;
		
		//Read data from user
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the number");
		a=obj.nextInt();
		
		//Logic
		for (int i=1;i<=a;i++)
			sum+=i;
		
		System.out.println(sum);
		
	}

}
