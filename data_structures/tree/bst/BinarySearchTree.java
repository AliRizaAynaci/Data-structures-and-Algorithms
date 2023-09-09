package data_structures.tree.bst;

public class BinarySearchTree {

    private TreeNode root;

    public BinarySearchTree() {
        // Initialize the root of the tree as null.
        this.root = null;
    }

    public void insert(int data) {
        // Insert a new node with the given data into the BST.
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            // If the root is null, create a new node with the given data.
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) {
            // If the data is less than the current node's data, recursively insert into the left subtree.
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            // If the data is greater than the current node's data, recursively insert into the right subtree.
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public boolean search(int data) {
        // Search for a node with the given data in the BST.
        return searchRec(root, data);
    }

    private boolean searchRec(TreeNode root, int data) {
        if (root == null) {
            // If the root is null, the data is not found in the tree.
            return false;
        }

        if (data == root.data) {
            // If the data matches the current node's data, it is found.
            return true;
        } else if (data < root.data) {
            // If the data is less than the current node's data, search in the left subtree.
            return searchRec(root.left, data);
        } else {
            // If the data is greater than the current node's data, search in the right subtree.
            return searchRec(root.right, data);
        }
    }

    public void remove(int data) {
        // Remove a node with the given data from the BST.
        removeRec(root, data);
    }

    private TreeNode removeRec(TreeNode root, int data) {
        if (root == null) {
            // If the root is null, return null.
            return root;
        }

        if (data < root.data) {
            // If the data is less than the current node's data, recursively remove from the left subtree.
            root.left = removeRec(root.left, data);
        } else if (data > root.data) {
            // If the data is greater than the current node's data, recursively remove from the right subtree.
            root.right = removeRec(root.right, data);
        } else {
            if (root.left == null) {
                // If the current node has no left child, replace it with its right child.
                return root.right;
            } else if (root.right == null) {
                // If the current node has no right child, replace it with its left child.
                return root.left;
            }
            // If the current node has two children, replace it with the smallest node in the right subtree.
            root.data = minValue(root.right);

            // Remove the smallest node in the right subtree.
            root.right = removeRec(root.right, root.data);
        }
        return root;
    }

    private int minValue(TreeNode root) {
        // Find and return the minimum value in the BST.
        int minValue = root.data;

        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }

        return minValue;
    }

    public void inorder() {
        // Perform an inorder traversal of the BST.
        inorderRec(root);
    }

    private void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public void preorder() {
        // Perform a preorder traversal of the BST.
        preorderRec(root);
    }

    private void preorderRec(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    public void postorder() {
        // Perform a postorder traversal of the BST.
        postorderRec(root);
    }

    private void postorderRec(TreeNode root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
}
