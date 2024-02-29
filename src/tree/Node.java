package tree;
/**
 *
 * @author hoang hung
 * @param <T>
 */
public class Node<T> {
    T data;
    Node<T> left, right;
    
    Node () {
        
    }
    
    Node (T data, Node<T> left, Node<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    Node (T data) {
        this.data = data;
        left = right = null;
    }
}
