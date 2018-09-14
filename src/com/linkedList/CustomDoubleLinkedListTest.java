package com.linkedList;

public class CustomDoubleLinkedListTest {

	public static void main(String[] args) {
		CustomDoubleLinkedList custom = new CustomDoubleLinkedList();
		
		Node n = null;
		
		n = custom.insertionAtBegining(1);
		System.out.println("node inserted at its begining " + n.getItem());
		n = custom.insertionAtBegining(2);
		System.out.println("node inserted at its begining " + n.getItem());
		n = custom.insertionAtBegining(3);
		System.out.println("node inserted at its begining " + n.getItem());
		n = custom.insertionAtBegining(4);
		System.out.println("node inserted at its begining " + n.getItem());
		n = custom.insertionAtBegining(5);
		System.out.println("node inserted at its begining " + n.getItem());
		n = custom.insertionAtBegining(6);
		System.out.println("node inserted at its begining " + n.getItem());
		
		n = custom.inserionAtEnd(10);
		System.out.println("node inserted at its end " + n.getItem());
		n = custom.inserionAtEnd(20);
		System.out.println("node inserted at its end " + n.getItem());
		n = custom.inserionAtEnd(30);
		System.out.println("node inserted at its end " + n.getItem());
		n = custom.inserionAtEnd(40);
		System.out.println("node inserted at its end " + n.getItem());
		n = custom.inserionAtEnd(50);
		System.out.println("node inserted at its end " + n.getItem());
		n = custom.inserionAtEnd(60);
		System.out.println("node inserted at its end " + n.getItem());
		
		System.out.println("Printing Link List");
		custom.traversLinkedList();
		
		/*custom.deleteFromBegining();
		System.out.println("Printing Link List after delete from begining");
		custom.traversLinkedList();*/
		
		n = custom.insertionAtLocation(200,3);
		System.out.println("node inserted at its location " + n.getItem());
		System.out.println("Printing Link List after item inserted at its location");
		custom.traversLinkedList();
		
		/*custom.deleteFromEnd();
		System.out.println("Printing Link List after delete from End");
		custom.traversLinkedList();*/
		
		n = custom.insertionAtLocation(100,4);
		System.out.println("node inserted at its location " + n.getItem());
		System.out.println("Printing Link List after item inserted at its location");
		custom.traversLinkedList();
		
		/*custom.deleteFromLocation(4);
		System.out.println("Printing Link List after delete from location");
		custom.traversLinkedList();*/
	
		
	}
}
