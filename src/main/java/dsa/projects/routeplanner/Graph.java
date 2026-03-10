package dsa.projects.routeplanner;

import java.util.*;

public class Graph {

    private Map<String, List<String>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addCity(String city) {
        adjList.putIfAbsent(city, new ArrayList<>());
    }

    public void addRoute(String city1, String city2) {

        adjList.get(city1).add(city2);
        adjList.get(city2).add(city1);
    }

    public List<String> getNeighbors(String city) {
        return adjList.get(city);
    }

    public Set<String> getCities() {
        return adjList.keySet();
    }
}