package CollectionInterviewQue.ListDemo;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Mango");

        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Removed element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        System.out.println("Position of Apple: " + stack.search("Apple"));
    }
}
//Definition / Overview
//Stack is a LIFO (Last-In-First-Out) data structure in Java.
//Part of java.util package, extends Vector.
//Legacy class (introduced before Collections Framework).
//Characteristics / Features
//Elements are accessed in LIFO order (Last In, First Out).
//Thread-safe (synchronized like Vector).
//Can store duplicate and null elements.
//Implements List interface (because it extends Vector).
//Important Stack Methods:
//| Method             | Description                                                |
//| ------------------ | ---------------------------------------------------------- |
//| `push(E item)`     | Adds element to top of stack                               |
//| `pop()`            | Removes and returns top element                            |
//| `peek()`           | Returns top element without removing                       |
//| `isEmpty()`        | Checks if stack is empty                                   |
//| `search(Object o)` | Returns position from top (1-based index), -1 if not found |
//| `size()`           | Returns number of elements                                 |

//Common Exceptions / Traps
//| Exception                   | Cause / Trap                                       | Example                                      |
//| --------------------------- | -------------------------------------------------- | -------------------------------------------- |
//| `EmptyStackException`       | Calling `pop()` or `peek()` on empty stack         | `Stack<Integer> s = new Stack<>(); s.pop();` |
//| `NullPointerException`      | Operating on null element (rare, same as Vector)   | `stack.peek().length()` if null              |
//| `IndexOutOfBoundsException` | Using Vector methods incorrectly                   | `stack.elementAt(5)` if size < 6             |
//| `OutOfMemoryError`          | Adding too many elements                           | Infinite push in loop                        |
//| **Performance trap**        | Frequent access in middle → slow (Vector overhead) | Stack inherits vector array behavior         |
