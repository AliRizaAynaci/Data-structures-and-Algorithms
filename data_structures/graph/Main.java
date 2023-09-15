package data_structures.graph;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();

        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");

        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("C", "D");
        graph.addEdge("D", "A");

        List<String> nodes = graph.getNodes();
        System.out.println("Nodes: " + nodes);

        graph.printGraph();
    }
}
