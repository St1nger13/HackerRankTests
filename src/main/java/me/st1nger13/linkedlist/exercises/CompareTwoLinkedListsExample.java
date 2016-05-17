package me.st1nger13.linkedlist.exercises;

import me.st1nger13.linkedlist.stuff.LinkedListHelper;
import me.st1nger13.linkedlist.stuff.Node;

/**
 * The lists are equal only if they have the same number of nodes and 
 * corresponding nodes contain the same data. Either head pointer given may be 
 * null meaning that the corresponding list is empty.
 * @author St1nger13
 *
 */
public class CompareTwoLinkedListsExample 
{
	public static void main(String[] args)
	{
		CompareTwoLinkedListsExample me = new CompareTwoLinkedListsExample() ;
		me.showExample() ;
	}
	
	public void showExample()
	{
		Node head1 = LinkedListHelper.prepareList(10) ;
		Node head2 = LinkedListHelper.prepareList(10) ;	
		System.out.println((compareLists(head1, head2)) ? "Equals" : "Not equals") ;
		
		head1 = LinkedListHelper.prepareList(10) ;
		head2 = LinkedListHelper.prepareList(12) ;
		System.out.println((compareLists(head1, head2)) ? "Equals" : "Not equals") ;
		
		head2 = LinkedListHelper.prepareList(10) ;
		System.out.println((compareLists(head1, head2)) ? "Equals" : "Not equals") ;
		
		head1.data = 100 ;
		System.out.println((compareLists(head1, head2)) ? "Equals" : "Not equals") ;
	}
	
	public boolean compareLists(Node head1, Node head2)
	{
		if(head1 == null || head2 == null)
			return false ;
		
		Node node1 = head1 ;
		Node node2 = head2 ;
		
		while(node1 != null && node2 != null)
		{
			if(node1.data != node2.data)
				return false ;
			
			node1 = node1.next ;
			node2 = node2.next ;
		}
		
		if((node1 == null) ^ (node2 == null))
			return false ;
		return true ;
	}
}
