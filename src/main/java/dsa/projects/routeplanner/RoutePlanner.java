package dsa.projects.routeplanner;

import java.util.*;

public class RoutePlanner {

    private Graph graph;

    public RoutePlanner(Graph graph) {
        this.graph = graph;
    }

    public List<String> findRoute(String start, String end) {

        Queue<String> queue = new LinkedList<>();
        Map<String, String> parent = new HashMap<>();
        Set<String> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {

            String city = queue.poll();

            if (city.equals(end)) {
                return buildPath(parent, start, end);
            }

            for (String neighbor : graph.getNeighbors(city)) {

                if (!visited.contains(neighbor)) {

                    visited.add(neighbor);
                    parent.put(neighbor, city);
                    queue.add(neighbor);
                }
            }
        }

        return Collections.emptyList();
    }

    private List<String> buildPath(Map<String, String> parent,
                                  String start,
                                  String end) {

        List<String> path = new ArrayList<>();

        String current = end;

        while (current != null) {
            path.add(current);
            current = parent.get(current);
        }

        Collections.reverse(path);

        if (!path.get(0).equals(start)) {
            return Collections.emptyList();
        }

        return path;
    }
}