package com.tree;

public class CustomBinaryTree {

	BNode rootNode;
	TQueue queue;

	public BNode getRootNode() {
		return rootNode;
	}

	public void setRootNode(BNode rootNode) {
		this.rootNode = rootNode;
	}

	public void insert(int item){		
		TQueue tq = new TQueue();
		
		BNode newNode = new BNode();
		newNode.setItem(item);
		newNode.setNext(null);
		
		if(this.rootNode==null){
			this.rootNode = newNode;
			this.queue = tq.enqueue(newNode,queue);
		}
		
		this.queue = tq.enqueue(newNode,queue);
	}	
	
	public void display(){
		TQueue tq = new TQueue();
		tq.dequeue(this.queue);
	}
}

class TQueue {
	BNode front;
	BNode rear;
	public BNode getFront() {
		return front;
	}
	public void setFront(BNode front) {
		this.front = front;
	}
	public BNode getRear() {
		return rear;
	}
	public void setRear(BNode rear) {
		this.rear = rear;
	}	
	
	public TQueue enqueue(BNode newNode, TQueue q){
		this.front = null!=q.getFront()?q.getFront():null;
		this.rear = q.getRear()!=null?q.getRear():null;
		if(this.front == null){
			this.front = newNode;
			this.rear = newNode;
			System.out.println("front inserted : "+this.front.getItem());
		}
		else{
			rear.setNext(newNode);
			rear = rear.getNext();			
		}
		System.out.println("rear inserted is "+this.rear.getItem());
		
		TQueue q1 = new TQueue();
		q1.setFront(front);
		q1.setRear(rear);
		return q1;
	}
	
	public void dequeue(TQueue q){
		this.front = q.getFront();
		if(front != null){
			do{
			System.out.println(front.getItem());
			front = front.getNext();
			}while(front != null);
		}
		else{
			System.out.println("No item in Queue to display");
		}
	}
}


class BNode {
	
	private int item;
	private BNode next;
	private BNode prev;

	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public BNode getNext() {
		return next;
	}
	public void setNext(BNode BNode) {
		this.next = BNode;
	}
	public BNode getPrev() {
		return prev;
	}
	public void setPrev(BNode prev) {
		this.prev = prev;
	}
}
