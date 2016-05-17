package me.st1nger13.linkedlist.exercises;

import me.st1nger13.linkedlist.stuff.LinkedListHelper;
import me.st1nger13.linkedlist.stuff.Node;

public class ReverseLinkedListExample 
{
	public static void main(String[] args)
	{
		ReverseLinkedListExample me = new ReverseLinkedListExample() ;
		me.showExample() ;
	}
	
	public void showExample()
	{
		Node head = LinkedListHelper.prepareList(15) ;
		LinkedListHelper.printList(head) ;
		
		head = reverseLinkedList(head) ;
		LinkedListHelper.printList(head) ;
	}
	
	
	public Node reverseLinkedList(Node node)  
	{  
		Node prevNode = null ;  
		Node nextNode ;  
		while(node != null)  
		{  
			nextNode = node.next ;  
			node.next = prevNode ;  
			prevNode = node ;  
			node = nextNode ;  
		}  
		return prevNode ;  
	}  
}
