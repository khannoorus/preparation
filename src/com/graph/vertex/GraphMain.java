package com.graph.vertex;

public class GraphMain {

	public static void main(String[] args) {
		
		int  totalVertices = 10;
		
		System.out.println(" ** Breadth First Search **");
		Graph g1 = new Graph();		
		g1.createGraph(totalVertices);		
		new BreadthFirstSearch().bfs(g1.vertex.get(0));
		
		System.out.println("\n\n **Depth First Search **");
		Graph g2 = new Graph();	
		g2.createGraph(totalVertices);
		new DepthFirstSearch().dfs(g2.vertex.get(0));	
	}

	
}
