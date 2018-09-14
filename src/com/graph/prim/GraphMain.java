package com.graph.prim;

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
		
		System.out.println("\n\n ** Minimum Spanning tree : Prims **");
		Graph g4 = new Graph();	
		g4.createGraph(totalVertices);
		new Prim().primsMST(g4);
		for (Vertex v : g4.vertexList) {
			if(v.parent != null)
				System.out.println(v.label + " " +v.key+ " "+v.parent.label);
		}
		
		
		Edge e = new Prim().getEdgeBetweenVertex(g4.vertexList.get(0), g4.vertexList.get(4), g4.edgeList);
		System.out.println("\n getting label "+e.label);
		
		
		
		
	}

	
}
