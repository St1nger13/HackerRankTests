package me.st1nger13.linkedlist.exercises;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import me.st1nger13.linkedlist.stuff.LinkedListHelper;
import me.st1nger13.linkedlist.stuff.Node;

public class MergeTwoLinkedListsExampleTest 
{
	private Node head1 ;
	private Node head2 ;
	private MergeTwoListsExample obj ;
	
	
	@Before
	public void setUp()
	{
		head1 = LinkedListHelper.prepareList(5) ;
		head2 = LinkedListHelper.prepareList(10) ;
		head2 = head2.next.next.next.next.next ; // move to 5 position
		obj = new MergeTwoListsExample() ;
	}
	
	@Test
	public void merged_List_Should_Be_Sorted()
	{
		head1 = obj.mergeLists(head1, head2) ;
		for(int i = 0; i < 10; i++)
			assertEquals(i, LinkedListHelper.getNodeAt(head1, i).data) ;
	}
}
