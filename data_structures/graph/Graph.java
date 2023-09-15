package data_structures.graph;

import java.util.*;

public class Graph<T> {

    private Map<T, List<Edge<T>>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    // Method to add a node
    public void addNode(T node) {
        adjacencyList.put(node, new ArrayList<>());
    }

    // Method to add an edge with weight
    public void addEdge(T source, T destination, int weight) {
        if (!adjacencyList.containsKey(source)) {
            throw new IllegalArgumentException("Source node not found.");
        }
        if (!adjacencyList.containsKey(destination)) {
            addNode(destination);
        }
        adjacencyList.get(source).add(new Edge<>(destination, weight));
        adjacencyList.get(destination).add(new Edge<>(source, weight)); // Remove this line if the graph is directed.
    }



    // Method to get the weight of an edge
    public int getEdgeWeight(T source, T destination) {
        if (!adjacencyList.containsKey(source) || !adjacencyList.containsKey(destination)) {
            throw new IllegalArgumentException("Node not found.");
        }

        List<Edge<T>> edges = adjacencyList.get(source);

        for (Edge<T> edge : edges) {
            if (edge.getDestination().equals(destination)) {
                return edge.getWeight();
            }
        }

        // Edge not found
        throw new IllegalArgumentException("Edge not found.");
    }

    // Method to get neighbors of a node
    public List<T> getNeighbors(T node) {
        if (!adjacencyList.containsKey(node)) {
            throw new IllegalArgumentException("Node not found.");
        }
        List<T> neighbors = new ArrayList<>();
        for (Edge<T> edge : adjacencyList.get(node)) {
            neighbors.add(edge.getDestination());
        }
        return neighbors;
    }

    public List<T> getNodes() {
        List<T> nodes = new ArrayList<>();
        for (T node : adjacencyList.keySet()) {
            nodes.add(node);
        }
        return nodes;
    }

    // Method to print the graph
    public void printGraph() {
        for (Map.Entry<T, List<Edge<T>>> entry : adjacencyList.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (Edge<T> edge : entry.getValue()) {
                System.out.print(edge.getDestination() + "(" + edge.getWeight() + ") ");
            }
            System.out.println();
        }
    }

    private static class Edge<T> {
        private T destination;
        private int weight;

        public Edge(T destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }

        public T getDestination() {
            return destination;
        }

        public int getWeight() {
            return weight;
        }
    }
}
