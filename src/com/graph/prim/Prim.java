package com.graph.prim;

import java.util.List;
import java.util.PriorityQueue;


public class Prim {

	public void primsMST(Graph g) {

		List<Vertex> vertexList = g.vertexList;
		PriorityQueue<Vertex> priorityQueue = new PriorityQueue<Vertex>();
		for (Vertex v : vertexList) {
			v.key = Integer.MAX_VALUE;
			priorityQueue.add(v);
		}

		Vertex peek = priorityQueue.peek();
		peek.key = 0;

		while (!priorityQueue.isEmpty()) {
			Vertex minVertex = priorityQueue.poll();
			for (Vertex vertex : minVertex.adjacencyList) {
				if ( priorityQueue.contains(vertex) 
						&& 
						getEdgeBetweenVertex(vertex, minVertex, g.edgeList).cost < vertex.key) {
					priorityQueue.remove(vertex);
					vertex.key = getEdgeBetweenVertex(vertex, minVertex, g.edgeList).cost;
					vertex.parent = minVertex;
					priorityQueue.add(vertex);
				}
			}
		}

	}
	
	Edge getEdgeBetweenVertex(Vertex v1, Vertex v2, List<Edge> edgeList){
		for(Edge e : edgeList){
			if( 
					(e.sourceVertex.equals(v1) && e.destVertex.equals(v2))
					||
					(e.sourceVertex.equals(v2) && e.destVertex.equals(v1))
			  ) {
				return e;
			}
		}		
		return null;		
	}

}