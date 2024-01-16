/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

import java.util.EmptyStackException;

/**
 *
 * @author hoang
 */
public class LinkedListStack {
    protected Node head;
    
    public LinkedListStack() {
        head = null;
    }
    
    public boolean isEmpty() {
        return (head == null);
    }
    
    public void push(Object x) {
        head = new Node(x, head);
    }
    
    /**
     *
     * @return
     * @throws EmptyStackException
     */
    public Object peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        
        return head.infor;
    }
    
    public Object pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Object x = head.infor;
        head = head.next;
        return x;
    }
}
