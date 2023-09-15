package algortihm.searching.graph.dfs;

import java.util.*;
import data_structures.graph.Graph;

public class DepthFirstSearch<T> {
    private Graph<T> graph;
    private Set<T> visited;

    public DepthFirstSearch(Graph<T> graph) {
        this.graph = graph;
        this.visited = new HashSet<>();
    }

    // Perform DFS starting from the given startNode
    public void dfs(T startNode) {
        if (!graph.getNodes().contains(startNode)) {
            throw new IllegalArgumentException("Start node is not valid.");
        }

        Set<T> visited = new HashSet<>();
        Stack<T> stack = new Stack<>();

        System.out.println("DFS Start:");

        stack.push(startNode);

        while (!stack.isEmpty()) {
            T node = stack.pop();

            if (!visited.contains(node)) {
                visited.add(node);
                System.out.print(node + " ");

                for (T neighbor : graph.getNeighbors(node)) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    // DFS with target node: Find a path from startNode to targetNode
    public List<T> dfsWithTarget(T startNode, T targetNode) {
        if (!graph.getNodes().contains(startNode) || !graph.getNodes().contains(targetNode)) {
            throw new IllegalArgumentException("Start or target node is not valid.");
        }

        Set<T> visited = new HashSet<>();
        Stack<T> stack = new Stack<>();
        Map<T, T> parentMap = new HashMap<>();

        stack.push(startNode);

        while (!stack.isEmpty()) {
            T node = stack.pop();

            if (!visited.contains(node)) {
                visited.add(node);

                if (node.equals(targetNode)) {
                    // Target node reached, construct the path
                    List<T> path = new ArrayList<>();
                    T current = node;
                    while (current != null) {
                        path.add(current);
                        current = parentMap.get(current);
                    }
                    Collections.reverse(path); // Reverse the path from start to target
                    return path;
                }

                for (T neighbor : graph.getNeighbors(node)) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                        parentMap.put(neighbor, node);
                    }
                }
            }
        }

        // Target node could not be reached
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();

        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addNode("E");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "E");

        DepthFirstSearch<String> dfs = new DepthFirstSearch<>(graph);

        // Perform DFS from start node "A"
        dfs.dfs("A");
        System.out.println();

        // Find a path from start node "A" to target node "D"
        List<String> path = dfs.dfsWithTarget("A", "D");

        if (!path.isEmpty()) {
            System.out.println("Path to the target node: " + path);
        } else {
            System.out.println("Target node could not be found.");
        }
    }
}
