package me.st1nger13.linkedlist.exercises;

import me.st1nger13.linkedlist.stuff.LinkedListHelper;
import me.st1nger13.linkedlist.stuff.Node;

public class GetNodeByBackwardPositionExample 
{
	public static void main(String[] args)
	{
		GetNodeByBackwardPositionExample me = new GetNodeByBackwardPositionExample() ;
		me.showExample() ;
	}
	
	public void showExample()
	{
		Node head = LinkedListHelper.prepareList(15) ;
		LinkedListHelper.printList(head) ;
		
		Node node = getNodeByBackwardPos(head, 5) ;
		System.out.println(node.data) ;
	}
	
	public Node getNodeByBackwardPos(Node head, int position)
	{
		if(head == null)
			return null ;
		
		int size = 0 ;
		Node node = head ;
		
		while(node != null)
		{
			size++ ;
			node = node.next ;
		}
		
		position = size - position - 1 ;
		node = head ;
		
		for(int i = 0; i < position; i++)
			node = node.next ;
		
		return node ;
	}
}
