package dsa.algorithms.graph;

import java.util.*;

public class Graph {

    private Map<String, List<String>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(String vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(String v1, String v2) {

        adjList.get(v1).add(v2);
        adjList.get(v2).add(v1);
    }

    public List<String> getNeighbors(String vertex) {
        return adjList.get(vertex);
    }

    public Set<String> getVertices() {
        return adjList.keySet();
    }
}