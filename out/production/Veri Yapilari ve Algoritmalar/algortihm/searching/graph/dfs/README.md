## Depth-First Search (DFS) Algorithm

The Depth-First Search (DFS) algorithm is a graph traversal algorithm that explores as far as possible along a branch before backtracking. It starts from a given source node and explores as deep as possible along each branch before backtracking. DFS can be used to search for nodes in a graph and find paths between nodes.

### Usage

- `dfs(startNode)`: Performs DFS starting from the given `startNode` and prints the visited nodes in depth-first order.
- `dfsWithTarget(startNode, targetNode)`: Finds a path from `startNode` to `targetNode` using DFS and returns the path as a list.

### Algorithm Steps

1. Initialize a set to keep track of visited nodes and a stack for DFS traversal.
2. Push the `startNode` onto the stack.
3. While the stack is not empty:
    - Pop a node from the stack.
    - If the node is not visited:
        - Mark it as visited.
        - Print the node (in the case of the `dfs` method).
        - If the node is the `targetNode` (in the case of the `dfsWithTarget` method), construct and return the path.
        - Push unvisited neighbors onto the stack.

### Complexity Analysis

- **Time Complexity**: O(N)
    - Where N is the total number of nodes in the graph (vertices + edges).
    - In the worst case, DFS visits all nodes once, resulting in a linear time complexity.

- **Space Complexity**: O(N)
    - In the worst case, when all nodes are reachable from the `startNode`, DFS uses a stack to store nodes, resulting in a space complexity of O(N).

DFS is a versatile graph traversal algorithm used for various applications, including finding paths, cycle detection, and graph connectivity analysis.
