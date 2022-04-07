package myPackage;

import java.util.Scanner;

public class Myclass 
{

	public static void main(String[] args) 
	{
		//Variable Declaration
		int input;
		String result;
		
		//Read data from User
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the number");
		input = obj.nextInt();
		
		result = (input%2==0)? "Even Number":"Odd Number";
		System.out.println(result);
	
	}

}
