# Graph Data Structure

The `Graph` class in this repository represents an undirected graph data structure. It provides methods for adding nodes, adding weighted edges, getting edge weights, getting neighbors, and printing the graph.

## Table of Contents

- [Graph Data Structure](#graph-data-structure)
    - [Table of Contents](#table-of-contents)
    - [Usage](#usage)
    - [Methods](#methods)
        - [1. `addNode(T node)`](#1-addnodet-node)
        - [2. `addEdge(T source, T destination, int weight)`](#2-addedget-source-destination-weight)
        - [3. `getEdgeWeight(T source, T destination)`](#3-getedgeweightt-source-destination)
        - [4. `getNeighbors(T node)`](#4-getneighborst-node)
        - [5. `getNodes()`](#5-getnodes)
        - [6. `printGraph()`](#6-printgraph)
    - [Example Usage](#example-usage)
    - [Contributing](#contributing)
    - [License](#license)

## Usage

1. Create a new instance of the `Graph` class.
2. Add nodes to the graph using the `addNode` method.
3. Optionally, add edges between two nodes with an optional weight using the `addEdge` method.
4. You can interact with the graph by using various methods to retrieve edge weights, get neighbors, and print the graph.

## Methods

### 1. `addNode(T node)`

This method adds a node to the graph.

- `node`: The node to be added.

### 2. `addEdge(T source, T destination, int weight)`

This method adds an undirected edge with an optional weight between two nodes.

- `source`: The source node.
- `destination`: The destination node.
- `weight`: The weight of the edge (optional).

### 3. `getEdgeWeight(T source, T destination)`

This method retrieves the weight of the edge between two nodes.

- `source`: The source node.
- `destination`: The destination node.

### 4. `getNeighbors(T node)`

This method returns a list containing the neighbors of a specific node.

- `node`: The node for which neighbors should be retrieved.

### 5. `getNodes()`

This method returns a list containing all the nodes in the graph.

### 6. `printGraph()`

This method prints the graph, including nodes and connected edges with optional weights.

## Example Usage

```java
Graph<String> graph = new Graph<>();

graph.addNode("A");
graph.addNode("B");
graph.addNode("C");

graph.addEdge("A", "B", 2);
graph.addEdge("B", "C", 3);

graph.printGraph();
