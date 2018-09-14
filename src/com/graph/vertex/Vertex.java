package com.graph.vertex;

import java.util.LinkedList;

public class Vertex {

	String label;
	LinkedList<Vertex> adjacencyList = new LinkedList<Vertex>();
	Boolean visited = Boolean.FALSE;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	
	
}
