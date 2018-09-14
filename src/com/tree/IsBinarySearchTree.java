package com.tree;

public class IsBinarySearchTree {

	private Boolean isBST(Node root, int minVal, int maxVal){

		if(root == null) return Boolean.TRUE;

		if(root.item > minVal && root.item < maxVal &&
				isBST(root.leftChild, minVal, root.item) &&
				isBST(root.rightChild, root.item, maxVal)			
				){
			return Boolean.TRUE;
		}
		return Boolean.FALSE;		
	}

	public static void main(String[] args) {
		Node root = new IsBinarySearchTree().createBinarySearchTree();
		System.out.println(new IsBinarySearchTree().isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	public Node createBinarySearchTree(){

		Node root = new Node();
		root.item = 100;
		Node n1 = new Node();
		n1.item = 50;
		Node n2 = new Node();
		n2.item = 102;
		Node n3 = new Node();
		n3.item = 30;
		Node n4 = new Node();
		n4.item = 60;
		Node n5 = new Node();
		n5.item = 101;
		Node n6 = new Node();
		n6.item = 104;

		root.leftChild =n1;
		root.rightChild = n2;

		n1.leftChild = n3;
		n1.rightChild = n4;

		n2.leftChild = n5;
		n2.rightChild = n6;

		return root;

	}
}
