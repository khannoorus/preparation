package com.graph.adjacency.matrix;

public class Node {

    public int data;
    public State state;

    public Node(int d) {
        this.data = d;
        this.state = State.UnVisited;
    }
}

