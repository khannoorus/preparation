package com.graph.simple;

import java.util.*;
 
public class Graph {
	
    int numberOfVertices = 10;  
    LinkedList[] adj = new LinkedList[numberOfVertices];     
    
    void addEdge(int v,int w){
        adj[v].add(w);
        
        // just adding this line making it, undirected graph
        adj[w].add(v);
    }
} 








// This class represents a directed graph using adjacency list representation
/*class Graph {
     int numberOfVertices;   // No. of vertices
     LinkedList[] adj; //Adjacency Lists
 
    // Constructor
    Graph(int v){
    	
    	numberOfVertices = v;
        adj = new LinkedList[v];
        
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList<Integer>();
    }
 
    // Function to add an edge into the graph
    void addEdge(int v,int w){
        adj[v].add(w);
    }
    
    
    
    
      // this is just to understand LinkedList[] adj gotcha;
       void understand(){
    	
    	Integer[] ob = new Integer[10];
    	for(int i = 1;i<10;i++){
    		ob[i] = 2;
    	}
 
    	// or above can be represented by following notation
    	
    	Integer[] obj;
    	obj = new Integer[10];
    	for(int i = 1;i<10;i++){
    		obj[i] = 2;
    	}
    	
    }


}*/


