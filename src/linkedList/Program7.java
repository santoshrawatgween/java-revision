package linkedList;

class DemoLinkedList
{
	
	Node head=null;
	Node tail=null;
	public void add(int val)
	{
		Node temp = new Node(val);
		
		if(head==null)
		{
			head =temp;
			tail=temp;
		}
		else
		{
			tail.next = temp;
			tail =temp;
		}
	}
	
	public void display()
	{
		while(head!=null)
		{
			System.out.println(head.data);
			head = head.next;
		}
	}
	
}

public class Program7 
{
	public static void main(String args[])
	{
		
		DemoLinkedList l1 = new DemoLinkedList();
		l1.add(61);
		l1.add(62);
		l1.add(63);
		l1.add(64);
		l1.display();
	}

}
