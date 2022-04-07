package myPackage;

import java.util.Scanner;

public class Myclass 
{
	public static int factorial (int n)
	{
		int fact =1;
		for (int i=1;i<=n;i++)
			fact = fact * i;
		return fact;
		
	}
	
	public static void main(String[] args) 
	{
		//Variable Declaration
		int input;
		
		//Read data from user
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter any number");
		input = obj.nextInt();
		
		System.out.println("Factorial of "+input+" ="+factorial(input));
		
	}

}
