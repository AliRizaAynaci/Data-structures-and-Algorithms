package data_structures.graph;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();

        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");

        graph.addEdge("A", "B", 1); // Add edge with weight 1
        graph.addEdge("B", "C", 2); // Add edge with weight 2
        graph.addEdge("C", "D", 3); // Add edge with weight 3
        graph.addEdge("D", "A", 4); // Add edge with weight 4

        List<String> nodes = graph.getNodes();
        System.out.println("Nodes: " + nodes);

        System.out.println("Edge weight between A and B: " + graph.getEdgeWeight("A", "B"));
        System.out.println("Edge weight between B and C: " + graph.getEdgeWeight("B", "C"));

        graph.printGraph();
    }
}
