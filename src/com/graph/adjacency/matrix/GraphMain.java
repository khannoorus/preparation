package com.graph.adjacency.matrix;

public class GraphMain {
	
	public static void main(String[] args) {
		
		Graph graph = new Graph(10, 100); // 100 is the root element at index-0
		
		graph.addNode(10);graph.addNode(20);graph.addNode(30);
		graph.addNode(40);graph.addNode(50);graph.addNode(60);
		graph.addNode(70);graph.addNode(80);graph.addNode(90);		
		
		graph.connectNode(graph.nodes.get(0), graph.nodes.get(1));
		graph.connectNode(graph.nodes.get(0), graph.nodes.get(3));
		graph.connectNode(graph.nodes.get(1), graph.nodes.get(2));
		graph.connectNode(graph.nodes.get(2), graph.nodes.get(5));
		graph.connectNode(graph.nodes.get(3), graph.nodes.get(4));
		graph.connectNode(graph.nodes.get(4), graph.nodes.get(6));
		graph.connectNode(graph.nodes.get(5), graph.nodes.get(8));
		graph.connectNode(graph.nodes.get(6), graph.nodes.get(9));
		graph.connectNode(graph.nodes.get(8), graph.nodes.get(7));
		graph.connectNode(graph.nodes.get(9), graph.nodes.get(7));
		
		System.out.println(" ***** DFS ***** ");
		new GraphTraversal().dfs(graph, 0);	
		
		System.out.println("\n \n \n ");
		
		System.out.println(" ***** BFS ***** ");
		new GraphTraversal().bfs(graph, 0);
	}

}
