package com.graph.adjacency.matrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    public Node root;
    ArrayList<Node> nodes;
    int[][] adjMatrix; // Adjacency Matrix
    boolean isDirected; // Graph directed?
    int size;

    public static final int DEFAULT_SIZE = 5; // default size

    public Graph(int data) {
        this(DEFAULT_SIZE, data);
    }

    /**
     * Assuming there are Max five nodes in the graph
     * 
     * This restriction can be removed by using adjList which grows dynamically
     * 
     * @param root
     */
    public Graph(int size, int data) {
        this.root = new Node(data);
        nodes = new ArrayList<Node>();
        nodes.add(root);
        this.size = size;
        adjMatrix = new int[size][size];
    }

    public void addNode(int data) {
        Node node = new Node(data);
        nodes.add(node);
    }

    public void connectNode(Node g1, Node g2) {
        int g1Idx = nodes.indexOf(g1);
        int g2Idx = nodes.indexOf(g2);
        if (g1Idx < 0 || g2Idx < 0)
            throw new NullPointerException("node not found");
        adjMatrix[g1Idx][g2Idx] = 1;
        if (!isDirected) {
            adjMatrix[g2Idx][g1Idx] = 1;
        }
    }

    /**
     * get all nodes connected to the given node
     * 
     * @param g
     * @return
     */
    public List<Node> getAdjacents(Node g) {
        int gIdx = nodes.indexOf(g);

        if (gIdx < 0)
            throw new NullPointerException("node not found in the graph");
        LinkedList<Node> adjNodes = new LinkedList<Node>();
        for (int j = 0; j < adjMatrix.length; j++) {
            if (adjMatrix[gIdx][j] == 1) {
                adjNodes.add(nodes.get(j));
            }
        }

        return adjNodes;
    }

    // Similarly implement remove edge
    public void removeEdge(Node g1, Node g2) {
        int g1Idx = nodes.indexOf(g1);
        int g2Idx = nodes.indexOf(g2);
        
        if(g1Idx<0 || g2Idx <0){
            throw new NullPointerException("Node not found");
        }
        
        adjMatrix[g1Idx][g2Idx] = 0;
        if(!isDirected){
            adjMatrix[g2Idx][g1Idx] = 0;
        }
    }
    
}