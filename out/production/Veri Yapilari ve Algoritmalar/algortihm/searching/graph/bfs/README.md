# Breadth-First Search (BFS) Algorithm

Breadth-First Search (BFS) is a graph traversal algorithm that explores all the vertices of a graph in breadthward motion, i.e., it explores all the neighbor vertices before moving to the next level of neighbors. BFS is useful for finding the shortest path in an unweighted graph and for exploring graphs systematically.

## Algorithm Overview

The Breadth-First Search algorithm works as follows:

1. Create a queue to keep track of nodes to be visited.

2. Start from the initial node (usually called the start node) and add it to the queue.

3. Initialize a set or list to keep track of visited nodes.

4. While the queue is not empty, repeat the following steps:
    - Dequeue a node from the front of the queue.
    - Process the node (e.g., print it or store it in a result).
    - Enqueue all unvisited neighbor nodes of the current node.
    - Mark the current node as visited.

5. Continue this process until the queue is empty or until a specific target node is reached (for pathfinding).

## Class Explanation

The provided Java class `BreadthFirstSearch` demonstrates the BFS algorithm on a graph. Here's how it works:

- `bfs(startNode)`: This method performs a basic BFS traversal starting from the given `startNode` and prints the visited nodes in breadth-first order.

- `bfsSearch(startNode, targetNode)`: This method extends BFS to perform pathfinding. It returns the shortest path from the `startNode` to the `targetNode` as a list of nodes.

## Complexity Analysis

The Breadth-First Search (BFS) algorithm has the following time and space complexity:

- **Time Complexity**: O(N)
    - Where N is the total number of nodes in the graph (vertices + edges).

  The BFS algorithm has a linear time complexity of O(N). In the worst case, it visits every node exactly once, making the time complexity directly proportional to the total number of nodes.

- **Space Complexity**: O(N)
    - In the worst case, when all nodes are reachable from the starting node, the space complexity of BFS is O(N).
    - This is because it needs to maintain a queue of nodes to be visited, and in the worst case, all nodes will be in the queue simultaneously.

The BFS algorithm's time complexity is O(N), and its space complexity is O(N). This means that the algorithm's execution time and memory usage grow linearly with the total number of nodes in the graph.

Expressing the complexity in terms of N, which represents the total number of nodes, provides a clear understanding of how the algorithm's performance scales with the size of the input graph.

## Usage

To use the BFS algorithm on your graph, follow these steps:

1. Create an instance of the `BreadthFirstSearch` class, providing your graph as input.

2. Use the `bfs(startNode)` method to perform a basic BFS traversal.

3. Use the `bfsSearch(startNode, targetNode)` method to find the shortest path between two nodes in your graph.

4. You can adapt the provided code example in the `main` method by adding your nodes and edges to the graph and specifying the start and target nodes for pathfinding.

## Example

Here's an example of using the `BreadthFirstSearch` class on a sample graph:

```java
Graph<String> graph = new Graph<>();
// Add nodes and edges to the graph...

BreadthFirstSearch<String> bfs = new BreadthFirstSearch<>(graph);

// Perform a basic BFS traversal from node "A"
bfs.bfs("A");

// Find the shortest path from "A" to "D"
List<String> path = bfs.bfsSearch("A", "D");

if (!path.isEmpty()) {
    System.out.println("Shortest path to the target node: " + path);
} else {
    System.out.println("Target node not found.");
}
