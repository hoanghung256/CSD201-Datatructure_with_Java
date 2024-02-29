package avltree;

public class Node<T extends Comparable<T>> {
    int height;
    T data;
    Node<T> left;
    Node<T> right;

    Node(T data) { 
        this.data = data; 
        height = 1;
    } 
}
