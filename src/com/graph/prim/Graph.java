package com.graph.prim;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	List<Vertex> vertexList = new ArrayList<Vertex>() ;
	List<Edge> edgeList = new ArrayList<Edge>() ;

	public void createGraph(int totalVertices) {
		//using hard-coded value for number of vertex

		//setting the label on each vertex
		for(int i = 0; i < totalVertices; i++){
			Vertex v = new Vertex();
			v.setLabel(Integer.valueOf(i*10).toString());
			vertexList.add(v);
		}
		Edge e0 = new Edge(vertexList.get(0), vertexList.get(4), "e0", 8);
		edgeList.add(e0);
		Edge e1 = new Edge(vertexList.get(1), vertexList.get(2), "e1", 3);
		edgeList.add(e1);
		Edge e2 = new Edge(vertexList.get(1), vertexList.get(3), "e2", 4);
		edgeList.add(e2);
		Edge e3 = new Edge(vertexList.get(1), vertexList.get(4), "e3", 1);
		edgeList.add(e3);
		Edge e5 = new Edge(vertexList.get(2), vertexList.get(5), "e5", 6);
		edgeList.add(e5);
		Edge e4 = new Edge(vertexList.get(2), vertexList.get(3), "e4", 2);
		edgeList.add(e4);
		Edge e6 = new Edge(vertexList.get(3), vertexList.get(5), "e6", 2);
		edgeList.add(e6);
		Edge e7 = new Edge(vertexList.get(3), vertexList.get(6), "e7", 3);
		edgeList.add(e7);
		Edge e8 = new Edge(vertexList.get(4), vertexList.get(6), "e8", 5);
		edgeList.add(e8);
		Edge e9 = new Edge(vertexList.get(5), vertexList.get(6), "e9", 1);
		edgeList.add(e9);
		Edge e10 = new Edge(vertexList.get(0), vertexList.get(6), "e10", 7);
		edgeList.add(e10);
		
		for(Edge e : edgeList){
			createAdjacencyList(e.sourceVertex,e.destVertex);
		}		
		
	}
	
	void createAdjacencyList(Vertex v1, Vertex v2){
		v1.adjacencyList.add(v2);

		//make it undirected
		v2.adjacencyList.add(v1);
	}
	
	
	
}
