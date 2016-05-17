package me.st1nger13.nodes.stuff;

public class LinkedListHelper 
{
	public static Node prepareList(int size)
	{
		Node head = null ;
		Node node = null ;
		
		for(int i = 0; i < size; i++)
		{
			node = (node == null) ? new Node() : (node.next = new Node()) ;
			node.data = i ;	
			
			if(i == 0)
				head = node ;
		}
		
		return head ;
	}
	
	public static void printList(Node head)
	{
		if(head != null)
		{
			Node node = head ;
			
			while(node != null)
			{
				System.out.print(node.data + " -> ") ;
				node = node.next ;
			}
		}
		
		System.out.println("NULL") ;
	}
	
	public static Node getNodeAt(Node head, int position)
	{
		if(head == null)
			throw new IllegalArgumentException("First Node should be not null!") ;
		
		if(position == 0)
			return head ;
		
		Node node = head ;
		
		for(int i = 0; i < position; i++)
			node = node.next ;
		
		return node ;
	}
}
