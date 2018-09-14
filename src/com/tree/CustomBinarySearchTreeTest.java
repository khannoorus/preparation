package com.tree;


public class CustomBinarySearchTreeTest {

	public static void main(String[] args) {
		
		CustomBinarySearchTree custom = new CustomBinarySearchTree();
		custom.insert(100); //RN
		custom.insert(50); //L w.r.t RN
		custom.insert(300); //R w.r.t RN
		custom.insert(40); //L w.r.t RN
		custom.insert(20); //L w.r.t RN
		custom.insert(150); //R w.r.t RN
		
		
	}
	
}