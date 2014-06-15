package com.solution;
import com.model.*;

public class LinkedlistSwap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		head.appendToTail(2);
		head.appendToTail(3);
		head.appendToTail(4);
		head.appendToTail(5);
		head.appendToTail(6);
		head.appendToTail(7);
		
		for(Node node1 = head; node1 != null ; node1 = node1.getNext()) {
			System.out.print(node1.getData()+" ");			
		}
		
		
		System.out.println();	
		
		Node preNode = null;
		Node fromNode = head;
		
		while((fromNode != null) && (fromNode.getNext() != null)) {	
			
			Node toNode = fromNode.getNext();
			Node afterNode = toNode.getNext();
			if(preNode != null) {
				preNode.setNext(toNode);
			}
			else {
				head = toNode;
			}
			toNode.setNext(fromNode);
			fromNode.setNext(afterNode);
			preNode = fromNode;
			fromNode = fromNode.getNext();
		}
		
		for(Node node1 = head; node1 != null ; node1 = node1.getNext() ) {
			System.out.print(node1.getData()+" ");
		}
		
		
		
	}

}
