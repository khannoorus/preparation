package com.graph.simple;

import java.util.Iterator;
import java.util.Stack;

public class DepthFirstSearch {

	void dfs(int source, Graph g){

		Boolean[] visited = new Boolean[g.numberOfVertices];
		for (int i = 0; i < visited.length; i++) {
			visited[i] = Boolean.FALSE;
		}

		Stack<Integer> stack = new Stack<Integer>();

		visited[source] = Boolean.TRUE;
		stack.push(source);

		while(!stack.isEmpty()){
			int top = stack.pop();
			System.out.print(top + " ");

			Iterator<Integer> itr = g.adj[top].listIterator();
			while(itr.hasNext()){
				int element = itr.next();
				if(!visited[element]){
					stack.push(element);
					visited[element] = Boolean.TRUE;
				}
			}
		}
	}
}
