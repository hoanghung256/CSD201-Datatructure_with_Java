package avltree;

public class AVLTree<T extends Comparable<T>> {
    Node<T> root;

    int getHeight(Node<T> n) {
        if (n == null)
            return 0;
        return n.height;
    }

    Node<T> rightRotate(Node<T> n) {
        Node<T> x = n.left;
        Node<T> y = x.right;

        // Rotation
        x.right = n;
        n.right = y;

        // Update height
        n.height = Math.max(getHeight(n.left), getHeight(n.right)) + 1;
        x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;

        return x;
    }

    Node<T> leftRotate(Node<T> n) {
        Node<T> x = n.right;
        Node<T> y = x.left;

        x.left = n;
        n.right = y;

        // Update heights
        n.height = Math.max(getHeight(n.left), getHeight(n.right)) + 1;
        x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;

        return x;
    }

    int getBalanceFactor(Node<T> n) {
        if (n == null)
            return 0;
        return this.getHeight(n.left) - this.getHeight(n.right);
    }

    Node<T> insert(Node<T> n, T data) {
        // Perform normal BST insertion
        if (n == null) return new Node<T>(data);

        if (data.compareTo(n.data) < 0) {
            n.left = insert(n.left, data);
        } else if (data.compareTo(n.data) > 0) {
            n.right = insert(n.right, data);
        } else {    // Duplicate data not allowed
            return n;
        }

        // Update height of its ancestor node
        n.height = 1 + Math.max(getHeight(n.left), getHeight(n.right));

        // Get balance factor of its ancestor node to check whether this node became unbalanced
        int bF = getBalanceFactor(n);

        // If this node became unbalanced, then there are 4 cases Left Left Case
        if (bF > 1 && data.compareTo(n.left.data) < 0) {
            return rightRotate(n);
        } 

        // Right Right Case
        if (bF < -1 && data.compareTo(n.right.data) > 0) {
            return leftRotate(n);
        } 
        // Left Right Case
        if (bF > 1 && data.compareTo(n.left.data) > 0) {
            n.left = leftRotate(n.left);
            return rightRotate(n);
        }

        // Left Left Case
        if (bF < -1 && data.compareTo(n.right.data) < 0) {
            n.right = rightRotate(n.right);
            return leftRotate(n);
        }

        // Return the unchanged node pointer
        return n;
    }

    void preOrder(Node<T> node) {
        if (root != null) {
            System.out.println(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
}
