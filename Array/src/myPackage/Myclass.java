package myPackage;

public class Myclass 
{

	public static void main(String[] args) 
	{
		int data [] = new int [] {88,152,795,851,13};
		 
		int small = data [0];
		
		for (var d:data)
		{
			if (d<small)
				small = d;
		}
			System.out.println("Small =" +small);
	}

}
