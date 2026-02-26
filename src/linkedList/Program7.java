package linkedList;

class DemoLinkedList
{
	
	Node head=null;
	Node tail=null;
	int size;
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
		size++;
	}
	
	public void insertAtStart(int val)
	{
		Node temp = new Node(val);
		if(head==null)
		{
			head=temp;
			tail=temp;
		}
		else
		{
			temp.next=head;
			head=temp;
		}
		size++;
		
	}
	public void insertAt(int index, int val)
	{
		
		if(size()==index)
		{
			add(val);
			return ;
		}
		else if(index==0)
		{
			insertAtStart(val);
			return;
		}
		Node t = new Node(val);
		Node temp = head;
		for(int i =0;i<index-1;i++)
		{
			temp = temp.next;
			
		}
		t.next=temp.next;
		temp.next=t;
		size++;
		
		
	}
	
	public int getAt(int index)
	{
		Node temp =head;
		for(int i=0;i<index;i++)
		{
			temp = temp.next;
		}
		return temp.data;
	}
	
	public void deleteAt(int index)
	{
		if(index==0)
		{
			head = head.next;
			return;
		}
		Node temp = head;
		for(int i =0;i<index-1;i++)
		{
			temp = temp.next;
		}
		temp.next = temp.next.next;
		size--;
		if(index==size)
		{
			tail = temp;
		}
		
	}
	
	public void display()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public int size()
	{
		
		return size;
		
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
		l1.add(65);
		l1.add(66);
		l1.display();
		System.out.println("length:"+l1.size());
		
	}

}
