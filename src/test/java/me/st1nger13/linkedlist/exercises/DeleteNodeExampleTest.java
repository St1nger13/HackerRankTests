package me.st1nger13.linkedlist.exercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.* ;

import me.st1nger13.linkedlist.exercises.DeleteNodeExample;
import me.st1nger13.linkedlist.stuff.LinkedListHelper;
import me.st1nger13.linkedlist.stuff.Node;


public class DeleteNodeExampleTest
{
	private Node head ;
	private DeleteNodeExample obj ;
	
	
	@Before
	public void setUp()
	{
		head = LinkedListHelper.prepareList(15) ;
		obj = new DeleteNodeExample() ;
	}
	
	@Test 
	public void delete_First_Node()
	{
		head = obj.deleteNode(head, 0) ;
		assertEquals(1, LinkedListHelper.getNodeAt(head, 0).data) ;
		assertEquals(2, LinkedListHelper.getNodeAt(head, 1).data) ;
	}
	
	@Test
	public void delete_Middle_Node()
	{
		head = obj.deleteNode(head, 3) ;
		assertEquals(4, LinkedListHelper.getNodeAt(head, 3).data) ;
		assertEquals(5, LinkedListHelper.getNodeAt(head, 4).data) ;
	}
	
	@Test
	public void delete_Last_Node()
	{
		head = obj.deleteNode(head, 12) ; 
		assertEquals(10, LinkedListHelper.getNodeAt(head, 10).data) ;
		assertEquals(11, LinkedListHelper.getNodeAt(head, 11).data) ;
	}
}
