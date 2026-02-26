package linkedList;

public class Program11 
{
	public static void main(String args[])
	{
		DemoLinkedList l1 = new DemoLinkedList();
		l1.add(101);
		l1.add(102);
		l1.add(103);
		l1.add(104);
		l1.add(105);
		l1.deleteAt(2);
		l1.display();
//		System.out.println(l1.size);
		System.out.println(l1.tail.data);
	}

}
