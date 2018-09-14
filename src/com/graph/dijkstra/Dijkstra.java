package com.graph.dijkstra;

import java.util.*;

public class Dijkstra {

	PriorityQueue<Vertex> priorityQueue = new PriorityQueue<Vertex>();

	void singleSourcePath(Graph g, Vertex source){

		initializeSingleSource(g,source);

		while(!priorityQueue.isEmpty()){
			Vertex u = priorityQueue.poll();
			if(u.visited == Boolean.FALSE){
				u.visited = Boolean.TRUE;
				for(Vertex v:u.adjacencyList){
					relax(u,v,getEdgeBetweenVertex(u,v,g.edgeList).cost);
				}
			}
		}
		
		//printing the shortest path from each vertex to source 
		for(Vertex v:g.vertexList){
			System.out.print("\n path for "+v.label+" : ");
			do{
				System.out.print(v.parent.label+" -> ");
				v = v.parent;
			}while(!v.label .equals(source.parent.label));
		}
	}



	private void relax(Vertex u, Vertex v, int cost) {
		if (v.distFromSource > u.distFromSource+cost){
			v.distFromSource = u.distFromSource+cost;
			v.parent = u;
		}
	}

	private void initializeSingleSource(Graph g, Vertex source) {
		for(Vertex v:g.vertexList){

			v.distFromSource = Integer.MAX_VALUE;
			v.parent = null;

			priorityQueue.add(v);			
		}

		source.distFromSource = 0;	
		source.parent = source;
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
