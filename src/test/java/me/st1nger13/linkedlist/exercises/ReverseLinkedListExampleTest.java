package me.st1nger13.linkedlist.exercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.* ;

import me.st1nger13.linkedlist.stuff.LinkedListHelper;
import me.st1nger13.linkedlist.stuff.Node;

public class ReverseLinkedListExampleTest 
{
	private Node head ;
	private ReverseLinkedListExample obj ;
	
	
	@Before
	public void setUp()
	{
		head = LinkedListHelper.prepareList(15) ;
		obj = new ReverseLinkedListExample() ;
	}
	
	@Test
	public void first_Node_Should_Be_Last_Before_Reverse()
	{
		head = obj.reverseLinkedList(head) ;
		assertEquals(14, LinkedListHelper.getNodeAt(head, 0).data) ;
	}
}
