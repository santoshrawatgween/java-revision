package linkedList;

public class Program3 
{

	public static void main(String args[])
	{
		Node a = new Node(21);
		Node b = new Node(22);
		Node c = new Node(23);
		Node d = new Node(24);
		Node e = new Node(25);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		Node head = a;
		while(head!=null)
		{
			System.out.println(head.data);//Code for  printing the linkedList;
			head = head.next;
		}
				
		
	}
}
