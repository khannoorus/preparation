package com.linkedList;

public class CheckLinklistPalindrome {

	public static void main(String[] args) {
		Node head = new CheckLinklistPalindrome().createLinkList();		
		new CheckLinklistPalindrome().traverseLinkList(head);
		
		System.out.println("isPalindrome : " + new CheckLinklistPalindrome().isPalindrome(head));
	}

	Boolean isPalindromeUtil(Node head1, Node head2){
		Node curr1 = head1;
		Node curr2 = head2;
		while(curr1!=null && curr2!=null){
			if(curr1.item != curr2.item){
				return Boolean.FALSE;
			}
			curr1=curr1.next;
			curr2=curr2.next;
		}		
		return Boolean.TRUE;		
	}
	
	private Boolean isPalindrome(Node head) {
		Node p = head; Node q = head;
		Node r = null;
		
		while(true){
			
			p = p.next;
			q = q.next.next;
			
			//this if condition get executed when there is odd no. of nodes in the linklist 
			if(q.next == null){
				r = p.next;
				p=null;
				break;
			}
			
			//this if condition get executed when there is even no. of nodes in the linklist
			if(q.next.next == null){
				r=p.next;
				p.next = null;
				break;
			}
			
		}
		
		Node newHead = reverse(r);
		return isPalindromeUtil(head, newHead);
	}

	private void traverseLinkList(Node head){
		Node curr = head;
		while(curr != null){
			System.out.println(curr.item);
			curr = curr.next;
		}
	}

	private Node createLinkList(){

		Node head = null;

		//tocheck for even no. of node in linklist use variable even and for odd no. of linklist use variable odd.
		int even = 6; int odd = 5;
		for(int i=1; i<=even; i++){

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
		
		//tocheck for even no. of node in linklist use variable even1 and for odd no. of linklist use variable odd1.
	     int even1 = 5; int odd1 = 4;
		for(int i=even1; i>=1; i--){

			Node newNode = new Node();
			newNode.item = i;
			newNode.next = null;
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return head;
	}


	private Node reverse(Node head){

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
}

