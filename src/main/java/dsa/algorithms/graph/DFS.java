package dsa.algorithms.graph;

import java.util.*;

public class DFS {

    public static void traverse(Graph graph, String start, Set<String> visited) {

        visited.add(start);

        System.out.print(start + " ");

        for (String neighbor : graph.getNeighbors(start)) {

            if (!visited.contains(neighbor)) {
                traverse(graph, neighbor, visited);
            }
        }
    }
}