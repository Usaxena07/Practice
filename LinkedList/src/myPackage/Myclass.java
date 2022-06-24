package myPackage;

import java.util.LinkedList;

public class Myclass 
{

	public static void main(String[] args) 
	{
		
		//Appending new elements at the end of the list
		
		LinkedList<Integer> data = new LinkedList<Integer>();
		
		for (int i = 1; i <= 5; i++)
            data.add(i);
		
		System.out.println(data);
		
		// Remove element at index 3
        data.remove(3);
  
        // Displaying the List
        // after deletion
        System.out.println(data);
		
	}

}
