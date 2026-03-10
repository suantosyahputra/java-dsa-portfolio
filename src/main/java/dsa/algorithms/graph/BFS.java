package dsa.algorithms.graph;

import java.util.*;

public class BFS {

    public static void traverse(Graph graph, String start) {

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {

            String vertex = queue.poll();
            System.out.print(vertex + " ");

            for (String neighbor : graph.getNeighbors(vertex)) {

                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
}