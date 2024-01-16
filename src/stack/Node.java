/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

/**
 *
 * @author hoang
 */
public class Node {
    public Object infor;
    public Node next;
    
    public Node(Object x, Node p) {
        infor = x;
        next = p;
    }
    
    public Node(Object x) {
        this(x, null);
    }
}
