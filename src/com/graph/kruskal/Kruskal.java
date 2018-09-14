package com.graph.kruskal;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Kruskal {

	void minSpaningTree(Graph g){
		
		//step-1 sort the edges list
		Collections.sort(g.edgeList,new EdgeComparator());
		
		//make a dense forest of vertex
		Map<String, Set<String>> forest = new HashMap<String, Set<String>>();
		
		for(Vertex v: g.vertexList){
			Set<String> s = new HashSet<String>();
			s.add(v.label);
			forest.put(v.label, s);
		}
		
		//
		List<Edge> minSpanTree = new ArrayList<Edge>();
		while(true){ //while you haven't visited all the vertices at least once
		    Edge check = g.edgeList.remove(0);//pop
		    Set<String> visited1 = forest.get(check.sourceVertex.label);
		    Set<String> visited2 = forest.get(check.destVertex.label);
		    
		    if(visited1.equals(visited2))
		        continue;
		    
		    minSpanTree.add(check);		    
		    visited1.addAll(visited2);		    
		    for(String i : visited1){
		        forest.put(i, visited1);
		    }
		    
		    if(visited1.size()==g.vertexList.size())
		        break;
		}	
		
		for(Edge e: minSpanTree){
			System.out.print(e.label + " ");
		}
	}
}
