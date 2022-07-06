package myPackage;

class Node
{
	public int data;
	public Node next;
}

class SinglyLinkedList
{
	private Node head;
	 
	public boolean isEmpty()
	{
		return(head==null);
	}
	
	public void insertFirst (int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next=head;
		head=newNode;
	}
	
	public void insertLast(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		if (head==null)
		{
			head=newNode;
		}
		else
		{
			Node current=head;
			while(current.next!=null)
				current=current.next;
			
			current.next=newNode;
		}
	}
	
	public void printLinkedList()
	{
		Node current = head;
		while (current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
}
public class Myclass 
{

	public static void main(String[] args) 
	{
		SinglyLinkedList data = new SinglyLinkedList();
		data.insertLast(99);
		data.insertLast(86);
		data.insertLast(45);
		
		data.printLinkedList();
	}

}
