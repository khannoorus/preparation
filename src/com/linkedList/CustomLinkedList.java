package com.linkedList;

public class CustomLinkedList {

	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public Node insertionAtBegining(int item){
		Node newNode = new Node();
		newNode.setItem(item);		
		if(head == null){
			newNode.setNext(null);
			head = newNode;
		}
		else{
			newNode.setNext(head);
			head = newNode;
		}
		return newNode;
	}
	
	public Node inserionAtEnd(int item){
		Node tempNode = null;
		Node newNode = new Node();
		newNode.setItem(item);
		newNode.setNext(null);

		if(this.getHead() == null){
			head = newNode;
		}
		else{
			tempNode = head;
			while(tempNode.getNext()!=null){
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(newNode);
		}	
		return newNode;
	}	
	
	public Node insertionAtLocation(int item, int location){
		Node newNode = new Node();
		newNode.setItem(item);
		Node tempNode = new Node();
		tempNode = head;
		for(int i=2;i<location;i++){
			tempNode = tempNode.getNext();
		}
		newNode.setNext(tempNode.getNext());
		tempNode.setNext(newNode);
		return newNode;
	}

	public void deleteFromBegining(){
		head = head.getNext();
	}

	public void deleteFromEnd(){
        Node tempNode = new Node();
        Node previousNode = new Node();
        tempNode = this.getHead();
		while(tempNode.getNext() != null){
			previousNode = tempNode;
			tempNode = tempNode.getNext();
		}
		previousNode.setNext(null);
	}
	
	public void deleteFromLocation(int location){
		Node tempNode = new Node();
		tempNode = this.getHead();
		for(int i=2;i<location;i++){
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(tempNode.getNext().getNext());
	}
	
	public void traversLinkedList(){
		Node node = new Node();
		node = this.getHead();
		do{
			System.out.println(node.getItem());
			node = node.getNext();
		}while(node!=null);
	}
	
	

}
