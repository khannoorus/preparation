package com.tree;

import com.tree.Node;

public class CustomBinarySearchTree {

	Node rootNode;

	public Node getRootNode() {
		return rootNode;
	}
	public void setRootNode(Node rootNode) {
		this.rootNode = rootNode;
	}

	public Node insert(int item){
		Node parentNode = this.getRootNode();
		Node newNode = new Node();
		newNode.setItem(item);
		if(parentNode == null){			
			newNode.setLeftChild(null);
			newNode.setRightChild(null);
			this.rootNode = newNode;
			System.out.println("inserted as rootnode "+ newNode.getItem());
		}
		else{
			Node childNode = null;
			while(parentNode !=null){
				childNode = parentNode;
				if(item<parentNode.getItem()){
					parentNode = parentNode.getLeftChild();
				}else{
					parentNode = parentNode.getRightChild();
				}
			}
			if(item<childNode.getItem()){
				childNode.setLeftChild(newNode);
				System.out.println(newNode.getItem() +" is inserted at left of "+childNode.getItem());
			}else{
				childNode.setRightChild(newNode);
				System.out.println(newNode.getItem() +" is inserted at right of "+childNode.getItem());
			}
		}
		return newNode;		
	}

}
