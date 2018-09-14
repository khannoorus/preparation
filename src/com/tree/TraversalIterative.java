package com.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TraversalIterative {

	public static void main(String[] args) {
		Node root = new DummyBinaryTree().createBinaryTree();
		System.out.println(" * Preorder * "); //NLR
		new TraversalIterative().iterativePreorder(root);

		System.out.println(" * Inorder * "); //LNR
		new TraversalIterative().iterativeInorder(root);

		System.out.println(" * Postorder * "); // LRN
		new TraversalIterative().iterativePostorder(root);

		System.out.println(" * levelOrder * ");
		new TraversalIterative().levelOrderTraversal(root);
		
		System.out.println(" * levelOrderWithMarker * ");
		new TraversalIterative().levelOrderTraversalWithMarker(root);
	}

	

	void iterativePreorder(Node root) {
		if (root == null)
			System.out.println("root is null");

		Stack<Node> nodeStack = new Stack<Node>();    
		nodeStack.push(root);

		while (!nodeStack.empty()){
			Node nod = nodeStack.pop();
			System.out.println(nod.data);
			if (nod.rightChild != null)
				nodeStack.push(nod.rightChild);
			if (nod.leftChild != null)
				nodeStack.push(nod.leftChild);
		}
	}



	/*void iterativeInorder(Node root) {
		Stack<Node> stack = new Stack<Node>();
		Node  curr = root;
		while (!stack.empty() || curr != null){			
			if (curr != null){
				stack.push(curr);
				curr = curr.leftChild;
			}
			else {
				curr = stack.pop();				
				System.out.println(curr.data);
				curr = curr.rightChild;
			}
		}
	}*/
	
	void iterativeInorder(Node root) {
		Stack<Node> stack = new Stack<Node>();
		Node  curr = root;
		while (curr != null){
			stack.push(curr);
			curr = curr.leftChild;
		}
		
		while (!stack.empty()){				
			Node nod = stack.pop();
			System.out.println(nod.data);
			nod = nod.rightChild;
			
			while (nod != null){								
				stack.push(nod);
				nod = nod.leftChild;
			}
			
		}
	}



	void iterativePostorder(Node root) {
		Stack<Node> stack = new Stack<Node>();
		Stack<String> out = new Stack<String>();
		stack.push(root);
		while (!stack.empty()) {
			Node nod = stack.pop();			
			out.push(nod.data);
			if (nod.leftChild != null)
				stack.push(nod.leftChild);
			if (nod.rightChild != null)
				stack.push(nod.rightChild);
		}
		while (!out.empty()) {
			System.out.println(out.pop());
		}
	}

	private void levelOrderTraversal(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node nod = queue.poll();
				if(nod.leftChild!=null){
					queue.add(nod.leftChild);
				}
				if(nod.rightChild!=null){
					queue.add(nod.rightChild);
				}
				System.out.print(nod.data+" ");						
		}
		
		//to make output cleaner:)
		System.out.println();

	}
	
	void levelOrderTraversalWithMarker(Node root){
		Queue<Node> queue = new LinkedList<Node>();
		int level = 0;
		queue.add(root);
		queue.add(null);
		System.out.print("level- "+ (level) +" : "+ " ");
		while(!queue.isEmpty()){
			Node nod = queue.poll();
			if(nod == null){	
				if(!queue.isEmpty()){
					queue.add(null);
					System.out.println();
					System.out.print("level- "+ (++level) +" : "+ " ");
				}
			}
			else{
				if(nod.leftChild!=null){
					queue.add(nod.leftChild);
				}
				if(nod.rightChild!=null){
					queue.add(nod.rightChild);
				}
				System.out.print(nod.data+" ");						
			}
		}

	}
}



/* Explanation 
 * 
 * 
 * void iterativeInorder(Node root) {
	// create an empty stack
	Stack<Node> stack = new Stack<Node>();
	Node  curr = root;

    // if current node is null and stack is also empty, we're done
	while (!stack.empty() || curr != null){			
	    // check if current node is not null, push it to the stack (defer it) and move to its left child
		if (curr != null){
			stack.push(curr);
			curr = curr.leftChild;
		}
		else {
            // else if current node is null, we pop an element from the stack,
            // print it and finally set current node to its right child
			curr = stack.pop();				
			System.out.println(curr.data);
			curr = curr.rightChild;
		}
	}
}*/



/* Explanation 
 * 
 * 
 * void iterativePostorder(Node root)
{
	// create an empty stack and push root node
	Stack<Node> stk = new Stack<Node>();
	stk.push(root);

	// create another stack to store postorder traversal
    Stack<String> out = new Stack<String>();;

    // run till stack is not empty
	while (!stk.empty()) {
	    // we pop a node from the stack and push the data to output stack
		Node curr = stk.pop();			
		out.push(curr.data);

		// push leftChild and right child of popped node to the stack
		if (curr.leftChild != null)
			stk.push(curr.leftChild);
		if (curr.rightChild != null)
			stk.push(curr.rightChild);
	}

	// print postorder traversal
	while (!out.empty()) {
		System.out.println(out.pop());
	}
}
 */



