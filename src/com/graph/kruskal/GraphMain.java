package com.graph.kruskal;

public class GraphMain {

	public static void main(String[] args) {
		
		int totalVertices = 7;
		
		System.out.println(" ** Depth First Search **");
		Graph g1 = new Graph();		
		g1.createGraph(totalVertices);		
		new BreadthFirstSearch().bfs(g1.vertexList.get(0));
		
		System.out.println("\n\n **Breadth First Search **");
		Graph g2 = new Graph();	
		g2.createGraph(totalVertices);
		new DepthFirstSearch().dfs(g2.vertexList.get(0));
		
		System.out.println("\n\n ** Minimum Spanning tree : Kruskal **");
		Graph g3 = new Graph();	
		g3.createGraph(totalVertices);
		new Kruskal().minSpaningTree(g3);
		
	}

	
}
