package basic;

public class Driver 
{
	public static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}
	public static class MyLinkedList
	{
		Node head = null;
		Node tail = null;
		
		void insertAtEnd(int val)
		{
			Node temp = new Node(val);
			if(head==null)
			{
				head= temp;
				tail=temp;
			}
			else
			{
				tail.next= temp;
				tail = temp;
			}
			
		}
		void display()
		{
			Node temp = head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
	}
	
	public static void main(String[] args)
	{
		MyLinkedList l1 = new MyLinkedList();
		l1.insertAtEnd(1);
		l1.insertAtEnd(2);
		l1.insertAtEnd(3);
		l1.insertAtEnd(4);
		l1.display();
		
		
		
	}

}
