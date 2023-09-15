package algortihm.searching.graph.dijkstra;

import data_structures.graph.Graph;

import java.util.*;

public class DijkstraAlgorithm<T> {
    private Graph<T> graph;

    public DijkstraAlgorithm(Graph<T> graph) {
        this.graph = graph;
    }

    /**
     * Calculates the shortest distances from the start node to all other nodes using Dijkstra's algorithm.
     *
     * @param startNode The starting node for the shortest path calculations.
     * @return A map containing nodes as keys and their respective shortest distances as values.
     */
    public Map<T, Integer> dijkstra(T startNode) {
        if (!graph.getNodes().contains(startNode)) {
            throw new IllegalArgumentException("Start node is not valid.");
        }

        // Initialize data structures for distance tracking
        Map<T, Integer> distanceMap = new HashMap<>();
        Set<T> visited = new HashSet<>();
        PriorityQueue<NodeDistancePair<T>> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(NodeDistancePair::getDistance));

        // Initialize distances, set startNode to 0, others to infinity
        for (T node : graph.getNodes()) {
            if (node.equals(startNode)) {
                distanceMap.put(node, 0);
            } else {
                distanceMap.put(node, Integer.MAX_VALUE);
            }
        }

        priorityQueue.offer(new NodeDistancePair<>(startNode, 0));

        while (!priorityQueue.isEmpty()) {
            NodeDistancePair<T> nodePair = priorityQueue.poll();
            T currentNode = nodePair.getNode();

            if (visited.contains(currentNode)) {
                continue;
            }

            visited.add(currentNode);

            for (T neighbor : graph.getNeighbors(currentNode)) {
                int distanceToNeighbor = distanceMap.get(currentNode) + graph.getEdgeWeight(currentNode, neighbor);

                if (distanceToNeighbor < distanceMap.get(neighbor)) {
                    distanceMap.put(neighbor, distanceToNeighbor);
                    priorityQueue.offer(new NodeDistancePair<>(neighbor, distanceToNeighbor));
                }
            }
        }

        return distanceMap;
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

        DijkstraAlgorithm<String> dijkstra = new DijkstraAlgorithm<>(graph);
        Map<String, Integer> distances = dijkstra.dijkstra("A"); // Starting node: "A"

        for (Map.Entry<String, Integer> entry : distances.entrySet()) {
            System.out.println("Node: " + entry.getKey() + ", Shortest Distance: " + entry.getValue());
        }
    }

    // Helper class representing a node and its distance
    private static class NodeDistancePair<T> {
        private T node;
        private int distance;

        public NodeDistancePair(T node, int distance) {
            this.node = node;
            this.distance = distance;
        }

        public T getNode() {
            return node;
        }

        public int getDistance() {
            return distance;
        }
    }
}
