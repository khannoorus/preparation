package com.graph.vertex;

import java.util.Stack;

public class DepthFirstSearch {

	void dfs(Vertex source){
		Stack<Vertex> stack =  new Stack<Vertex>();
		
		stack.push(source);
		source.visited = Boolean.TRUE;
		
		while(!stack.isEmpty()){
			Vertex top = stack.pop();
			System.out.print(top.getLabel() + " ");			

			for(Vertex vertex: top.adjacencyList){
				if(vertex.visited == Boolean.FALSE){
					stack.push(vertex);
					vertex.visited = Boolean.TRUE;
				}
			}
		}
	}
}
