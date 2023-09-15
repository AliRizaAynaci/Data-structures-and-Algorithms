package algorithm.searching.graph;

import data_structures.graph.Graph;
import java.util.*;

public class BreadthFirstSearch<T> {
    private Graph<T> graph;

    public BreadthFirstSearch(Graph<T> graph) {
        this.graph = graph;
    }

    // Perform BFS starting from the given startNode
    public void bfs(T startNode) {
        if (!graph.getNodes().contains(startNode)) {
            throw new IllegalArgumentException("Start node is not valid.");
        }

        // Initialize a set to keep track of visited nodes and a queue for BFS
        Set<T> visited = new HashSet<>();
        Queue<T> queue = new LinkedList<>();

        System.out.println("BFS Start:");

        // Start from the initial node
        queue.add(startNode);
        visited.add(startNode);

        while (!queue.isEmpty()) {
            T node = queue.poll();
            System.out.print(node + " "); // Print the current node

            // Explore neighbors of the current node
            for (T neighbor : graph.getNeighbors(node)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor); // Add unvisited neighbors to the queue
                    visited.add(neighbor); // Mark them as visited
                }
            }
        }
    }

    // BFS search with path tracking
    public List<T> bfsSearch(T startNode, T targetNode) {
        if (!graph.getNodes().contains(startNode) || !graph.getNodes().contains(targetNode)) {
            throw new IllegalArgumentException("Start or target node is not valid.");
        }

        Map<T, T> parentMap = new HashMap<>(); // To track the parent node of each node
        Queue<T> queue = new LinkedList<>();
        List<T> path = new ArrayList<>();

        // Start from the initial node
        queue.add(startNode);
        parentMap.put(startNode, null);

        while (!queue.isEmpty()) {
            T node = queue.poll();

            // If the target node is found, construct the path
            if (node.equals(targetNode)) {
                T current = node;
                while (current != null) {
                    path.add(current);
                    current = parentMap.get(current);
                }
                Collections.reverse(path); // Reverse the path from start to target
                return path;
            }

            // Explore neighbors of the current node
            for (T neighbor : graph.getNeighbors(node)) {
                if (!parentMap.containsKey(neighbor)) {
                    queue.add(neighbor);
                    parentMap.put(neighbor, node);
                }
            }
        }

        // Target node not found
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();

        // Add nodes to the graph
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("F");
        graph.addNode("D");
        graph.addNode("E");

        // Add edges to create a sample graph
        graph.addEdge("A", "B", 1);
        graph.addEdge("A", "F", 2);
        graph.addEdge("F", "C", 3);
        graph.addEdge("B", "D", 4);
        graph.addEdge("C", "E", 5);

        BreadthFirstSearch<String> bfs = new BreadthFirstSearch<>(graph);
        bfs.bfs("A"); // Start BFS from node "A"

        List<String> path = bfs.bfsSearch("A", "D");

        if (!path.isEmpty()) {
            System.out.println("Path to the target node: " + path);
        } else {
            System.out.println("Target node not found.");
        }
    }
}
