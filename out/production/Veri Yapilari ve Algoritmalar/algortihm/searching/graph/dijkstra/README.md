# Dijkstra's Algorithm

Dijkstra's Algorithm is a widely used graph traversal algorithm that calculates the shortest paths from a starting node to all other nodes in a weighted graph. It finds the shortest path by iteratively selecting the node with the smallest known distance and relaxing the distances to its neighbors.

## Usage

The `DijkstraAlgorithm` class provides the following method:

- `dijkstra(startNode)`: Calculates the shortest distances from the `startNode` to all other nodes and returns a map containing nodes as keys and their respective shortest distances as values.

## Algorithm Explanation

1. Initialize data structures for distance tracking:
    - `distanceMap`: A map to store the shortest distances from the `startNode` to all other nodes.
    - `visited`: A set to keep track of visited nodes.
    - `priorityQueue`: A priority queue to efficiently select nodes with the smallest known distances.

2. Initialize distances:
    - Set the distance of the `startNode` to 0.
    - Set the distances of all other nodes to infinity.

3. Offer the `startNode` to the priority queue with a distance of 0.

4. While the priority queue is not empty:
    - Poll the node with the smallest known distance (`currentNode`) from the priority queue.
    - If the `currentNode` is already visited, skip it.
    - Mark the `currentNode` as visited.
    - For each neighbor of the `currentNode`:
        - Calculate the distance to the neighbor through the `currentNode`.
        - If this distance is smaller than the current known distance to the neighbor, update the distance.
        - Offer the neighbor to the priority queue with the updated distance.

5. Return the `distanceMap` containing nodes and their shortest distances.

## Complexity Analysis

- **Time Complexity**: O(N^2) for dense graphs, O(E * log(N)) for sparse graphs
    - Where N is the total number of nodes in the graph, and E is the number of edges.
    - In the worst case, where the graph is dense (fully connected), the time complexity is O(N^2).
    - In the average case or for sparse graphs, the time complexity is more efficiently represented as O(E * log(N)), where E is the number of edges.

- **Space Complexity**: O(N)
    - The space complexity is O(N) to store the `distanceMap`, `visited` set, and `priorityQueue`.

## Example

```java
Graph<String> graph = new Graph<>();
// Add nodes and edges to create a sample graph

DijkstraAlgorithm<String> dijkstra = new DijkstraAlgorithm<>(graph);
Map<String, Integer> distances = dijkstra.dijkstra("A"); // Starting node: "A"

for (Map.Entry<String, Integer> entry : distances.entrySet()) {
    System.out.println("Node: " + entry.getKey() + ", Shortest Distance: " + entry.getValue());
}
