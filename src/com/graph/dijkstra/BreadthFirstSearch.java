package com.graph.dijkstra;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	public void bfs(Vertex source) {
		Queue<Vertex> queue = new LinkedList<Vertex>();
		
		queue.add(source);
		source.visited = Boolean.TRUE;
		
		while(!queue.isEmpty()){
			Vertex front = queue.poll();
			System.out.print(front.getLabel() + " ");
			
			for(Vertex vertex : front.adjacencyList){
				if(vertex.visited == Boolean.FALSE){
					queue.add(vertex);
					vertex.visited = Boolean.TRUE;
				}
			}
		}		
	}
}
