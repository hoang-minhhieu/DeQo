package dcll.hhoa;

import java.util.Iterator;
import java.util.EmptyStackException;

/**
 * Created by 21107237 on 03/11/2016.
 */

/* Exigence no 1 */
public class SimpleStack implements ISimpleStack {
    private int n;          // size of the stack
    private Node first;     // top of stack

    // helper linked list class
    private class Node {
        private Item item;
        private Node next;
    }

    /**
     * Initializes an empty stack.
     */
    public SimpleStack() {
        first = null;
        n = 0;
    }
    /**
     * Tests if this stack is empty
     */
    public boolean isEmpty(){
        return first == null;
    }
    /**
     * Returns the number of items in this stack.
     */
    public int getSize(){
        return n;
    }
    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     */
    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    }
    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    public Item peek() throws EmptyStackException {
        return first.item;
    }
    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     *
     @throws EmptyStackException if this stack is empty.
     */
    public Item pop() throws EmptyStackException{
        Item item = first.item;        // save item to return
        first = first.next;            // delete first node
        n--;
        return item;                   // return the saved item
    }
}
