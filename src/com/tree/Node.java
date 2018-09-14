package com.tree;

public class Node {

	int item;
	String data;
	Node leftChild;
	Node rightChild;
	protected int getItem() {
		return item;
	}
	protected void setItem(int item) {
		this.item = item;
	}
	protected Node getLeftChild() {
		return leftChild;
	}
	protected void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}
	protected Node getRightChild() {
		return rightChild;
	}
	protected void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	
	
}
