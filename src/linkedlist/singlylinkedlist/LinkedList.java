package linkedlist.singlylinkedlist;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoang
 * @param <T>
 */
public class LinkedList<T> {
    Node head;
    Node tail;

    public LinkedList () {
        head = tail;
        tail = null;
    }
    
    boolean isEmpty () {
        return (head == null);
    }
    
    void clear () {
        head = tail = null;
    }
    
    void add (T val) {
        Node<T> node = new Node(val, null);
        
        if (this.isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }
    
    int size () {
        Node currentNode = head;
        int size = 0;
        
        while (currentNode != null) {
            size++;
            currentNode = currentNode.next;
        }
        
        return size;
    }
    
    void removeLast () {
        if (this.isEmpty()) {
            System.out.println("Empty Linked List!");
        } else {
            Node currentNode = new Node(head.info, head);

            while (currentNode.next != null) {
                if (currentNode.next.next == null) {
//                    Node node = new Node();
//                    currentNode.next 
//                    tail = 
                }
            }
        }    
    }
    
    void addFirst (T val) {
        Node node = new Node(val, head);
        if (head == null) {
            tail = node;
        }
        head = node;
        
    }
    
//    void addAt (int index, T val) {
//        if (this.isEmpty()) {
//            Node node = new Node(val, head);
//            head = node;
//        } else {
//            Node currentNode = head;
//            int count = 0;
//            
//            while (currentNode != null) {
//                if (count == index) {
//                    Node node = new Node(val, head);
//                    head = node;
//                    
//                    
//                }
//                currentNode = currentNode.next;
//                count++;
//            }
//        }
//    }
    
    public void linkedListToString() {
        Node currentNode = head;
        System.out.print("Linked List: ");
        while (currentNode != null) {
            System.out.print(currentNode.info + " ");
            currentNode = currentNode.next;
        }
    }
    
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        list.addFirst(7);
        list.add(0);
        list.add(3);
        list.add(5);
        
        if (!list.isEmpty()) {
            list.toString();
        }
        
        list.addFirst(10);
        list.toString();
    }
}

