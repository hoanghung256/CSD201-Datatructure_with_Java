package avltree;

public class AVLTree<T extends Comparable<T>> {
    Node<T> root;

    int getHeight(Node<T> n) {
        if (n == null)
            return 0;
        return n.height;
    }

    Node<T> rightRotate(Node<T> n) {
        return null;
    }

    Node<T> leftRotate(Node<T> n) {
        return null;
    }

    int getBalanceFactor(Node<T> n) {
        if (n == null)
            return 0;
        return this.getHeight(n.left) - this.getHeight(n.right);
    }

    Node<T> insert(Node<T> n, T data) {
        return null;
    }

    void preOrder(Node<T> node) {
        if (root != null) {
            System.out.println(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
}
