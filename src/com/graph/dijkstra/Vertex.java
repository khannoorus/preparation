package com.graph.dijkstra;

import java.util.LinkedList;

public class Vertex implements Comparable<Vertex>{

	String label;
	LinkedList<Vertex> adjacencyList = new LinkedList<Vertex>();
	Boolean visited = Boolean.FALSE;
	Integer distFromSource;
	Vertex parent;
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public int compareTo(Vertex vertex) {		
		return this.distFromSource - vertex.distFromSource;
	}

	
}
