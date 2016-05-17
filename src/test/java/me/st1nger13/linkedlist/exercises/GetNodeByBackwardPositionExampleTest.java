package me.st1nger13.linkedlist.exercises;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import me.st1nger13.linkedlist.stuff.LinkedListHelper;
import me.st1nger13.linkedlist.stuff.Node;

public class GetNodeByBackwardPositionExampleTest 
{
	private Node head ;
	private GetNodeByBackwardPositionExample obj ;
	
	
	@Before
	public void setUp()
	{
		head = LinkedListHelper.prepareList(15) ;
		obj = new GetNodeByBackwardPositionExample() ;
	}
	
	@Test
	public void fifth_Should_Be_Nine()
	{
		head = obj.getNodeByBackwardPos(head, 5) ;
		assertEquals(9, head.data) ;
	}
}
