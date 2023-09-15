package data_structures.graph;

import java.util.*;

public class Graph<T> {

    private Map<T, List<T>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    // Method to add a node
    public void addNode(T node) {
        adjacencyList.put(node, new ArrayList<>());
    }

    // Method to add an edge
    public void addEdge(T source, T destination) {
        if (!adjacencyList.containsKey(source) || !adjacencyList.containsKey(destination)) {
            throw new IllegalArgumentException("Node not found.");
        }
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // Remove this line if the graph is directed.
    }

    // Method to get neighbors of a node
    public List<T> getNeighbors(T node) {
        if (!adjacencyList.containsKey(node)) {
            throw new IllegalArgumentException("Node not found.");
        }
        return adjacencyList.get(node);
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
        for (Map.Entry<T, List<T>> entry : adjacencyList.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (T neighbor : entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
