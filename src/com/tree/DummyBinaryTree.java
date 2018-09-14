package com.tree;

public class DummyBinaryTree {

	public Node createBinaryTree(){

		Node root = new Node();
		root.data = "root";
		Node n1 = new Node();
		n1.data = "n1";
		Node n2 = new Node();
		n2.data = "n2";
		Node n3 = new Node();
		n3.data = "n3";
		Node n4 = new Node();
		n4.data = "n4";
		Node n5 = new Node();
		n5.data = "n5";
		Node n6 = new Node();
		n6.data = "n6";
		Node n7 = new Node();
		n7.data = "n7";
		Node n8 = new Node();
		n8.data = "n8";
		
		root.leftChild =n1;
		root.rightChild = n2;
		
		n1.leftChild = n3;
		n1.rightChild = n4;
		
		n2.leftChild = n5;
		n2.rightChild = n6;
		
		return root;
		
	}
}

