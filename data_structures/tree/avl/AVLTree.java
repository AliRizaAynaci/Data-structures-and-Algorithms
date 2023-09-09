package data_structures.tree.avl;

import static java.lang.Math.*;

public class AVLTree {

    private TreeNode root;

    public AVLTree() {
        // Initialize the root of the AVL tree as null.
        root = null;
    }

    // Helper function to calculate the balance factor
    private int height(TreeNode node) {
        if (node == null)
            return 0;
        return node.height;
    }

    // Helper function to calculate the height difference
    private int getBalance(TreeNode node) {
        if (node == null)
            return 0;
        return height(node.left) - height(node.right);
    }

    // Right Rotation operation
    private TreeNode rightRotate(TreeNode y) {
        TreeNode x = y.left;
        TreeNode T2 = x.right;

        // Rotation operation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left Rotation operation
    private TreeNode leftRotate(TreeNode x) {
        TreeNode y = x.right;
        TreeNode T2 = y.left;

        // Rotation operation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert a new node function
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode node, int data) {
        if (node == null)
            return new TreeNode(data);

        if (data < node.data)
            node.left = insertRec(node.left, data);
        else if (data > node.data)
            node.right = insertRec(node.right, data);
        else // Duplicate data insertion is not allowed
            return node;

        // Update the height of the node
        node.height = 1 + max(height(node.left), height(node.right));

        // Balance check
        int balance = getBalance(node);

        // Handle imbalance cases
        // Left-Left case
        if (balance > 1 && data < node.left.data)
            return rightRotate(node);

        // Right-Right case
        if (balance < -1 && data > node.right.data)
            return leftRotate(node);

        // Left-Right case
        if (balance > 1 && data > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right-Left case
        if (balance < -1 && data < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Search for data in AVL tree
    public boolean search(int data) {
        return searchRec(root, data);
    }

    private boolean searchRec(TreeNode node, int data) {
        if (node == null)
            return false;

        if (data == node.data)
            return true;

        if (data < node.data)
            return searchRec(node.left, data);
        else
            return searchRec(node.right, data);
    }

    // Remove a node from the AVL tree
    public void remove(int data) {
        root = removeRec(root, data);
    }

    private TreeNode removeRec(TreeNode node, int data) {
        if (node == null)
            return node;

        if (data < node.data)
            node.left = removeRec(node.left, data);
        else if (data > node.data)
            node.right = removeRec(node.right, data);
        else {
            if ((node.left == null) || (node.right == null)) {
                TreeNode temp = null;
                if (temp == node.left)
                    temp = node.right;
                else
                    temp = node.left;

                if (temp == null) {
                    temp = node;
                    node = null;
                } else
                    node = temp;
            } else {
                TreeNode temp = minValueNode(node.right);

                node.data = temp.data;

                node.right = removeRec(node.right, temp.data);
            }
        }

        if (node == null)
            return node;

        // Update heights
        node.height = max(height(node.left), height(node.right)) + 1;

        // Balance check
        int balance = getBalance(node);

        // Handle imbalance cases
        // Left-Left case
        if (balance > 1 && getBalance(node.left) >= 0)
            return rightRotate(node);

        // Left-Right case
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right-Right case
        if (balance < -1 && getBalance(node.right) <= 0)
            return leftRotate(node);

        // Right-Left case
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Find the minimum value node in the tree
    private TreeNode minValueNode(TreeNode node) {
        TreeNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // Inorder traversal of the AVL tree
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(TreeNode node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.data + " ");
            inorderRec(node.right);
        }
    }

    // Preorder traversal of the AVL tree
    public void preorder() {
        preorderRec(root);
    }

    private void preorderRec(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderRec(node.left);
            preorderRec(node.right);
        }
    }

    // Postorder traversal of the AVL tree
    public void postorder() {
        postorderRec(root);
    }

    private void postorderRec(TreeNode node) {
        if (node != null) {
            postorderRec(node.left);
            postorderRec(node.right);
            System.out.print(node.data + " ");
        }
    }
}
