package linkedList;

public class Program2 
{
	public static void main(String args[])
	{
		Node a = new Node(11);
		Node b = new Node(12);
		Node c = new Node(13);
		Node d = new Node(14);
		Node e = new Node(15);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		while(a!=null)
		{
			System.out.println(a.data);//11 12 13 14
			a= a.next;
		}
	}

}
