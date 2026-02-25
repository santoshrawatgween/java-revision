package linkedList;

public class program6 
{
	public static int length(Node head)
	{
		int count =0;
		
		while(head!=null)
		{
			count++;
			head= head.next;
		}
		return count;
		
		
	}
	public static void main(String args[])
	{
		Node a = new Node(51);
		Node b = new Node(52);
		Node c = new Node(53);
		Node d = new Node(54);
		Node e = new Node(55);
		a.next =b;
		b.next =c;
		c.next =d;
		d.next =e;
		System.out.println(length(b));//display the length of linkedList;
		
	}

}
