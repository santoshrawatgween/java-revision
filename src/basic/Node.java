package basic;

public class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
	}
	
	public static int countlength(Node a)
	{
		int count = 0;
		while(a!=null)
		{
			count++;
			a=a.next;
		}
		return count;
	}
	public static void main(String args[])
	{
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		a.next=b;
		b.next=c;
		c.next =d;
		
		System.out.println(countlength(a));
		
		
		

	}

}
