package com.linkedList;

public class CustomDoubleLinkedList {

	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public Node insertionAtBegining(int item){
		Node newNode = new Node();
		newNode.setPrev(null);
		newNode.setItem(item);
		if(head == null){
			newNode.setPrev(null);
			this.head = newNode;
		}
		else{	
			this.getHead().setPrev(newNode);
			newNode.setNext(this.getHead());
			this.head = newNode;
		}
		return newNode;
	}
	
	public Node inserionAtEnd(int item){
		Node newNode = new Node();
		newNode.setItem(item);
		if(this.getHead() == null){
			newNode.setNext(null);
			newNode.setPrev(null);
			this.head = newNode;
		}
		else{
			Node tempNode = new Node();
			tempNode = this.getHead();
			while(tempNode.getNext()!=null){
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(newNode);
			newNode.setPrev(tempNode);
			newNode.setNext(null);
		}		
		return newNode;
	}	
	
	public Node insertionAtLocation(int item, int location){
		Node newNode = new Node();
		newNode.setItem(item);
		Node tempNode = new Node();
		tempNode = this.getHead();
		for(int i=2;i<location;i++){
			tempNode = tempNode.getNext();
		}		
		newNode.setPrev(tempNode);
		newNode.setNext(tempNode.getNext());
		tempNode.setNext(newNode);
		tempNode.getNext().setPrev(newNode);
		return newNode;
	}	

	public void deleteFromBegining(){
		
	}

	public void deleteFromEnd(){
		
	}
	
	public void deleteFromLocation(int location){
		
	}
	
	public void traversLinkedList(){
		Node tempNode = new Node();
		tempNode = this.getHead();
		while(tempNode != null){
			System.out.println(tempNode.getItem());
			tempNode = tempNode.getNext();
		}
	}
	
	

}
