package com.graph.prim;

import java.util.List;

public class Edge {

	Vertex sourceVertex;
	Vertex destVertex;
	String label;
	int cost;
		
	public Edge() {
		super();
	}

	public Edge(Vertex sourceVertex, Vertex destVertex, String label, int cost) {
		super();
		this.sourceVertex = sourceVertex;
		this.destVertex = destVertex;
		this.label = label;
		this.cost = cost;
		
	}
	
}
