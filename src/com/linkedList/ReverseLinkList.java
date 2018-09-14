package com.linkedList;

public class ReverseLinkList {

	Node reverseIterative(Node head){
		
		Node temp, curr, prev;
		curr = head;
		prev = null;

		while(curr != null){
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		head = prev;
		return head;
	}

	public static void main(String[] args) {
		Node head = new ReverseLinkList().createLinkList();		
		new ReverseLinkList().traverseLinkList(head);

		System.out.println("After reversing");
		new ReverseLinkList().traverseLinkList(new ReverseLinkList().reverseIterative(head));
	}

	public void traverseLinkList(Node head){
		Node curr = head;
		while(curr != null){
			System.out.println(curr.item);
			curr = curr.next;
		}
	}

	public Node createLinkList(){

		Node head = null;

		for(int i=1; i<=5; i++){

			Node newNode = new Node();
			newNode.item = i;
			newNode.next = null;

			if(head == null)
				head = newNode;
			else{
				Node temp = head;
				while(temp.next!=null){
					temp = temp.next;
				}
				temp.next = newNode;
			}
		}
		return head;
	}
}

