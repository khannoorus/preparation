package com.graph.prim;

import java.util.LinkedList;

public class Vertex implements Comparable<Vertex> {

	String label;
	LinkedList<Vertex> adjacencyList = new LinkedList<Vertex>();
	Boolean visited = Boolean.FALSE;
	
	//adding for prims algorithm
	int key;
	
	//adding for prims algorithm
	Vertex parent;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public int compareTo(Vertex o) {
		return Integer.compare(key, o.key);
	}
	
}
