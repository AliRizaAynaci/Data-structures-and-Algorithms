# AVL Tree Class

The `AVLTree` class is an implementation of a self-balancing AVL (Adelson-Velsky and Landis) tree in Java. It provides methods for inserting, searching, removing nodes, and performing three types of tree traversal: inorder, preorder, and postorder.

## Class Structure

The `AVLTree` class has the following components:

- `TreeNode`: An inner class representing a node in the AVL tree.
- `root`: A reference to the root node of the tree.

## Functions

### `AVLTree()`

Constructor: Initializes an empty AVL tree with the root as `null`.

### `insert(int data)`

Inserts a new node with the given `data` into the AVL tree while maintaining the AVL property.

### `search(int data) -> boolean`

Searches for a node with the given `data` in the AVL tree. Returns `true` if found, otherwise `false`.

### `remove(int data)`

Removes a node with the given `data` from the AVL tree while maintaining the AVL property.

### `inorder()`

Performs an inorder traversal of the AVL tree (left-root-right) and prints the elements.

### `preorder()`

Performs a preorder traversal of the AVL tree (root-left-right) and prints the elements.

### `postorder()`

Performs a postorder traversal of the AVL tree (left-right-root) and prints the elements.

## Usage Example

```java
// Create a new AVL Tree
AVLTree avlTree = new AVLTree();

// Insert nodes into the AVL tree
avlTree.insert(50);
avlTree.insert(30);
avlTree.insert(70);
avlTree.insert(20);
avlTree.insert(40);
avlTree.insert(60);
avlTree.insert(80);

// Search for a node
boolean found = avlTree.search(60); // Should return true

// Perform an inorder traversal
System.out.print("Inorder traversal: ");
avlTree.inorder(); // Should print "20 30 40 50 60 70 80"

// Remove a node
avlTree.remove(30);
System.out.print("Inorder traversal after removal: ");
avlTree.inorder(); // Should print "20 40 50 60 70 80"
