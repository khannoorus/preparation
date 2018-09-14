package com.tree;

public class DeletionBinarySearchTree {

	public static void main(String[] args) {	

		Node root = null;
		//get root of the BST here it is just declared as NULL
		Node node = findElement(root, 10);
		deleteNode(node);	
	}


	//k = element to delete, so search this element in the tree 
	static Node findElement(Node root, int k){
		Node nod = null;
		if(root.item == k){
			nod = root;
		}
		else if(root.item < k){
			nod = findElement(root.leftChild, k);
		}
		else{
			nod = findElement(root.rightChild, k);
		}
		return nod;
		
	}

	 static void deleteNode(Node root){
		// case1:
		// case2:
		// case3:
	}

}
