package linkedList;

class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
	 	
	 this.data= data;	
	}
}
public class Program1 
{
	public static void main(String args[])
	{
		Node a = new Node(11);
		Node b = new Node(12);
		Node c = new Node(13);
		Node d = new Node(14);
		Node e = new Node(15);
		Node temp = new Node(500);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		temp.next=c;
		b.next=temp;
		System.out.println(a.next.next.next.data);
		
		 
		
	}

}
