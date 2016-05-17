package me.st1nger13.linkedlist.exercises;

import me.st1nger13.linkedlist.stuff.LinkedListHelper;
import me.st1nger13.linkedlist.stuff.Node;

public class MergeTwoListsExample 
{
	public static void main(String[] args)
	{
		MergeTwoListsExample me = new MergeTwoListsExample() ;
		me.showExample() ;
	}
	
	public void showExample()
	{
		Node head1 = LinkedListHelper.prepareList(5) ;
		Node head2 = LinkedListHelper.prepareList(8) ;
		head2 = head2.next.next.next ;
		LinkedListHelper.printList(head1) ;
		LinkedListHelper.printList(head2) ;
		
		head1 = mergeLists(head1, head2) ;
		LinkedListHelper.printList(head1) ;
	}
	
	public Node mergeLists(Node head1, Node head2)
	{
		Node head = new Node() ;
		Node p = head ;

		while (head1 != null && head2 != null) 
		{
			if (head1.data <= head2.data) 
			{
				p.next = head1 ;
				head1 = head1.next ;
			} else 
			{
				p.next = head2 ;
				head2 = head2.next ;
			}

			p = p.next ;
		}

		if (head1 != null)
			p.next = head1 ;
		if (head2 != null)
			p.next = head2 ;

		return head.next ;
	}
}
