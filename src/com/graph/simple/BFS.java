package com.graph.simple;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    void bfsTraversal(int startingSource, Graph g) {
    	
        // Mark all the vertices as not visited(By default get set as false (in java))
    	 
    	Boolean[] visited = new Boolean[g.numberOfVertices];
    	for(int i=0;i<visited.length;i++){
    		visited[i] = Boolean.FALSE;
    	}
 
        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<Integer>();
 
        // Mark the current node as visited and enqueue it
        visited[startingSource]=true;
        queue.add(startingSource);
 
        while (queue.size() != 0) {
            // Dequeue a vertex from queue and print it
        	int front = queue.poll();
            System.out.print(front + " ");
 
            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it visited and enqueue it
            Iterator<Integer> itr = g.adj[front].listIterator();
            while (itr.hasNext()) {
                int element = itr.next();
                if (!visited[element]) {
                    visited[element] = Boolean.TRUE;
                    queue.add(element);
                }
            }
        }
    }
}
