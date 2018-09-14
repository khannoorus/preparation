package com.graph.dijkstra;

public class GraphMain {

	public static void main(String[] args) {
		
		int totalVertices = 8;
		
		System.out.println(" ** Depth First Search **");
		Graph g1 = new Graph();		
		g1.createGraph(totalVertices);		
		new BreadthFirstSearch().bfs(g1.vertexList.get(0));
		
		System.out.println("\n\n **Breadth First Search **");
		Graph g2 = new Graph();	
		g2.createGraph(totalVertices);
		new DepthFirstSearch().dfs(g2.vertexList.get(0));
		
		System.out.println("\n\n ** Single Source Path : Dijkstra **");
		Graph g3 = new Graph();	
		g3.createGraph(totalVertices);
		new Dijkstra().singleSourcePath(g3, g3.vertexList.get(0));
		
	}

	
}
