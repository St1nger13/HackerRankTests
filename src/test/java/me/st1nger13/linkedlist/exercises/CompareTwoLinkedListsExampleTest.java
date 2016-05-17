package me.st1nger13.linkedlist.exercises;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import me.st1nger13.linkedlist.stuff.LinkedListHelper;
import me.st1nger13.linkedlist.stuff.Node;

public class CompareTwoLinkedListsExampleTest 
{
	private Node head1 ;
	private Node head2 ;
	private Node head3 ;
	private Node head4 ;
	private CompareTwoLinkedListsExample obj ;
	
	
	@Before
	public void setUp()
	{
		head1 = LinkedListHelper.prepareList(15) ;
		head2 = LinkedListHelper.prepareList(15) ;
		head3 = LinkedListHelper.prepareList(11) ;
		head4 = LinkedListHelper.prepareList(15) ;
		obj = new CompareTwoLinkedListsExample() ;
	}
	
	@Test 
	public void lists_Should_Be_Equal()
	{
		assertTrue(obj.compareLists(head1, head2)) ;
	}
	
	@Test
	public void lists_Should_Not_Be_Equal()
	{
		assertFalse(obj.compareLists(head3, head4)) ;
		head1.data = 100 ;
		assertFalse(obj.compareLists(head1, head2)) ;
	}
}
