package com.graph.simple;

import java.util.LinkedList;

public class GraphMain {

	 public static void main(String args[])
	    {
	        //Graph g = new Graph(10);  
		 
		 
		    Graph g = new Graph();
		    
		    for (int i=0; i<g.numberOfVertices; ++i)
	            g.adj[i] = new LinkedList<Integer>();
	 
	        g.addEdge(0, 1);
	        g.addEdge(1, 2);
	        g.addEdge(2, 5);
	        g.addEdge(5, 8);
	        g.addEdge(0, 3);
	        g.addEdge(3, 4);
	        g.addEdge(4, 6);
	        g.addEdge(6, 9);
	        g.addEdge(8, 7);
	        g.addEdge(9, 7);
	 
	        System.out.println("Following is Breadth First Traversal "); 
	        new BFS().bfsTraversal(0,g);
	        System.out.println("\nFollowing is Depth First Traversal ");
	        new DFS().dfsTraversal(g);
	        
	        System.out.println("\nFollowing is Depth First Traversal ");
	        new DepthFirstSearch().dfs(0, g);
	        
	    }  
	 
	 
}
