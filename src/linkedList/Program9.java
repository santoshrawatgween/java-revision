package linkedList;

public class Program9 
{
	public static void main(String [] args)
	{
		DemoLinkedList l1 = new DemoLinkedList();
		l1.add(81);
		l1.add(82);
		l1.add(83);
		l1.add(84);
		l1.add(85);
		l1.insertAt(5,90);//insert the new node at last index
		l1.insertAt(0,89);//insert the new node at first index
		l1.display();
		System.out.println(l1.tail.data);
		
	}

}
