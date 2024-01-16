/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist.singlylinkedlist;

/**
 *
 * @author hoang
 * @param <T>
 */
public class Node<T> {
    T info;
    Node next;
    
    Node () {
        
    }
    
    Node (T val, Node node) {
        info = val;
        next = node;
    }
}
