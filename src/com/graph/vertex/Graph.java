package com.graph.vertex;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	List<Vertex> vertex = new ArrayList<Vertex>() ;

	public void createGraph(int totalVertices) {
		//using hard-coded value for number of vertex

		//setting the label on each vertex
		for(int i = 0; i < totalVertices; i++){
			Vertex v = new Vertex();
			v.setLabel(Integer.valueOf(i*10).toString());
			vertex.add(v);
		}

		//connecting the edges
		Graph gs = new Graph();
		gs.createEdgeBetweenVertices(vertex.get(0), vertex.get(1));
		gs.createEdgeBetweenVertices(vertex.get(1), vertex.get(2));
		gs.createEdgeBetweenVertices(vertex.get(2), vertex.get(5));
		gs.createEdgeBetweenVertices(vertex.get(5), vertex.get(8));
		gs.createEdgeBetweenVertices(vertex.get(0), vertex.get(3));
		gs.createEdgeBetweenVertices(vertex.get(3), vertex.get(4));
		gs.createEdgeBetweenVertices(vertex.get(4), vertex.get(6));
		gs.createEdgeBetweenVertices(vertex.get(6), vertex.get(9));
		gs.createEdgeBetweenVertices(vertex.get(8), vertex.get(7));
		gs.createEdgeBetweenVertices(vertex.get(9), vertex.get(7));

	}

	void createEdgeBetweenVertices(Vertex v1, Vertex v2){
		v1.adjacencyList.add(v2);

		//make it undirected
		v2.adjacencyList.add(v1);
	}
}
