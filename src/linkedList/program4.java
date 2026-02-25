package linkedList;

public class program4 
{
	public static void display(Node head)
	{
		
		while(head!=null)
		{
			System.out.println(head.data);
			head = head.next;
		}
		
	}
	
	public static void main(String args[])
	{
		Node a = new Node(31);
		Node b = new Node(32);
		Node c = new Node(33);
		a.next =b;
		b.next =c;
		
		display(c);// This program display a linked list by just giving a head to it.
		
	}

}
