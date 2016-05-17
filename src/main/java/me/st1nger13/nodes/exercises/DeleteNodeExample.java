package me.st1nger13.nodes.exercises;

import me.st1nger13.nodes.stuff.LinkedListHelper;
import me.st1nger13.nodes.stuff.Node;

/**
 * Delete a Node from own LinkedList <br>
 * @see DeleteNodeExampleTest
 * @author St1nger13
 *
 */
public class DeleteNodeExample 
{
	public static void main(String[] args)
	{
		DeleteNodeExample me = new DeleteNodeExample() ;
		me.showExample() ;
	}
	
	public void showExample()
	{
		Node head = LinkedListHelper.prepareList(5) ;
		LinkedListHelper.printList(head) ;
		
		head = deleteNode(head, 4) ;
		LinkedListHelper.printList(head) ;
	}
	
	/**
	 * 
	 * @param head - first node in a LinkedList
	 * @param position - range between 0 and N - 1
	 * @return first node of LinkedList
	 */
	public Node deleteNode(Node head, int position)
	{
		if(head == null)
			return null ;
		
		if(position == 0)
			return head.next ;
		
		Node node = head ;
		int pointer = 0 ;
		position-- ;
		
		while(pointer < position)
		{
			node = node.next ;
			pointer++ ;
		}
		
		node.next = (node.next != null) ? node.next.next : null ;
		
		return head ;
	}
}
