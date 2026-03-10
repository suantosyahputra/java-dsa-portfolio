package dsa.algorithms.graph;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "D");

        System.out.print("BFS: ");
        BFS.traverse(graph, "A");

        System.out.println();

        System.out.print("DFS: ");
        DFS.traverse(graph, "A", new HashSet<>());
    }
}