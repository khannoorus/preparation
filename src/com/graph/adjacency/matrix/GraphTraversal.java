package com.graph.adjacency.matrix;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphTraversal {
	
	private Queue<Integer> queue = new LinkedList<Integer>();
	
	public void bfs(Graph graph, int source){
		
		int adjacency_matrix[][] = graph.adjMatrix;
		int number_of_nodes = adjacency_matrix[source].length - 1;
		int[] visited = new int[number_of_nodes + 1];
		int i, element;

		visited[source] = 1;
		queue.add(source);

		while (!queue.isEmpty()) {
			element = queue.remove();
			i = element;
			System.out.print(graph.nodes.get(i).data + "\t");
			while (i <= number_of_nodes){
				if (adjacency_matrix[element][i] == 1 && visited[i] == 0){
					queue.add(i);
					visited[i] = 1;
				}
				i++;
			}
		}
	}
	
	
	private Stack<Integer> stack = new Stack<Integer>();
	
	public void dfs(Graph graph, int source){
		
		int adjacency_matrix[][] = graph.adjMatrix;
		int number_of_nodes = adjacency_matrix[source].length - 1;
		int visited[] = new int[number_of_nodes + 1];		
		int element = source;
		
		int i = source;			
		visited[source] = 1;		
		stack.push(source);
		
		System.out.print(graph.nodes.get(element).data + "\t");	

		while (!stack.isEmpty()){
			element = stack.peek();
			i = element;	
			while (i <= number_of_nodes){
				if (adjacency_matrix[element][i] == 1 && visited[i] == 0){
					stack.push(i);
					visited[i] = 1;
					element = i;
					i = 1;
					System.out.print(graph.nodes.get(element).data + "\t");
					continue;
				}
				i++;
			}
			stack.pop();	
		}	
	}
	
}
