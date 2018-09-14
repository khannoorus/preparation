package com.graph.simple;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {

	void DFSUtil(int v,boolean visited[], LinkedList<Integer>[] adj) {

		// Mark the current node as visited and print it
		visited[v] = true;
		System.out.print(v+" ");

		// Recur for all the vertices adjacent to this vertex
		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext()){
			int n = i.next();
			if (!visited[n])
				DFSUtil(n,visited,adj);
		}
	}

	// The function to do DFS traversal. It uses recursive DFSUtil()
	void dfsTraversal(Graph g){
		int totalVertices = g.numberOfVertices;
		// Mark all the vertices as not visited(get set as false by default)
		boolean visited[] = new boolean[totalVertices];

		// Call the recursive helper function to print DFS traversal, starting from all vertices one by one
		for (int i=0; i<totalVertices; ++i)
			if (visited[i] == false)
				DFSUtil(i, visited, g.adj);
	}

}
