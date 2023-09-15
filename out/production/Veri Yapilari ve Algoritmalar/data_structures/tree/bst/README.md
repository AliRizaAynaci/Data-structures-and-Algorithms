# Binary Search Tree (BST) Class

The `BinarySearchTree` class is an implementation of a Binary Search Tree (BST) in Java. It provides methods for inserting, searching, removing nodes, and performing three types of tree traversal: inorder, preorder, and postorder.

## Class Structure

The `BinarySearchTree` class has the following components:

- `TreeNode`: An inner class representing a node in the binary search tree.
- `root`: A reference to the root node of the tree.

## Functions

### `BinarySearchTree()`

Constructor: Initializes an empty binary search tree with the root as `null`.

### `insert(int data)`

Inserts a new node with the given `data` into the BST while maintaining the BST property.

### `search(int data) -> boolean`

Searches for a node with the given `data` in the BST. Returns `true` if found, otherwise `false`.

### `remove(int data)`

Removes a node with the given `data` from the BST while maintaining the BST property.

### `inorder()`

Performs an inorder traversal of the BST (left-root-right) and prints the elements.

### `preorder()`

Performs a preorder traversal of the BST (root-left-right) and prints the elements.

### `postorder()`

Performs a postorder traversal of the BST (left-right-root) and prints the elements.

## Usage Example

```java
// Create a new Binary Search Tree
BinarySearchTree bst = new BinarySearchTree();

// Insert nodes into the BST
bst.insert(50);
bst.insert(30);
bst.insert(70);
bst.insert(20);
bst.insert(40);
bst.insert(60);
bst.insert(80);

// Search for a node
boolean found = bst.search(60); // Should return true

// Perform an inorder traversal
System.out.print("Inorder traversal: ");
bst.inorder(); // Should print "20 30 40 50 60 70 80"

// Remove a node
bst.remove(30);
System.out.print("Inorder traversal after removal: ");
bst.inorder(); // Should print "20 40 50 60 70 80"