package linkedList;

public class Program5 
{
	public static void display(Node head)
	{
		if(head==null) return ;
		display(head.next);
		System.out.println(head.data);
		//display(head.next);--> print reverse linkedList;
		
	}
	public static void main(String args[])
	{
		Node a = new Node(41);
		Node b = new Node(42);
		Node c = new Node(43);
		Node d = new Node(44);
		a.next =b;
		b.next =c;
		c.next =d;
		display(a);//Print LinkedList via recursion
		
	}

}
