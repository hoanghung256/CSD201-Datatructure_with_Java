/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

/**
 *
 * @author hoang
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        LinkedListStack myStack = new LinkedListStack();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!myStack.isEmpty() && c == '(' || c =='[' || c == '{') {
                myStack.push(c);
            } else if (myStack.isEmpty()) {
                myStack.push(c);
            }
            char p = (char) myStack.peek();
            if (p == '(' && c == ')') {
                myStack.pop();
            } else if (p == '[' && c == ']') {
                myStack.pop();
            } else if (p == '{' && c == '}') {
                myStack.pop();
            } 
        }
        
        return myStack.isEmpty();
    }
    
    public static void main(String[] args) {
        System.out.println("Test case 5(expected true): " + isValid("()"));
        System.out.println("Test case 2(expected true): " + isValid("()[]{}"));
        System.out.println("Test case 3(expected false): " + isValid("(]"));
        System.out.println("Test case 1(expected false): " + isValid("(])"));
        System.out.println("Test case 4(expected false): " + isValid("]"));
        System.out.println("Test case 5(expected true): " + isValid("(])"));
    }
}
