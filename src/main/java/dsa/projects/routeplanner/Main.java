package dsa.projects.routeplanner;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph();

        graph.addCity("A");
        graph.addCity("B");
        graph.addCity("C");
        graph.addCity("D");
        graph.addCity("E");

        graph.addRoute("A", "B");
        graph.addRoute("A", "C");
        graph.addRoute("B", "D");
        graph.addRoute("C", "E");
        graph.addRoute("E", "D");

        RoutePlanner planner = new RoutePlanner(graph);

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("\nStart city (or exit): ");
            String start = scanner.nextLine();

            if (start.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Destination city: ");
            String end = scanner.nextLine();

            List<String> route = planner.findRoute(start, end);

            if (route.isEmpty()) {
                System.out.println("No route found.");
            } else {
                System.out.println("Route: " + route);
            }
        }

        scanner.close();
    }
}