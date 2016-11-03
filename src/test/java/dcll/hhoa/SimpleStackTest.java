package dcll.hhoa;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStackTest extends TestCase {

    @Test
    public void testIsEmpty() throws Exception {
        SimpleStack stack = new SimpleStack();
        assertTrue(stack.isEmpty());
        stack.push(new Item("a"));
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        SimpleStack stack = new SimpleStack();
        stack.push(new Item("a"));
        if (stack.getSize() == 1) System.out.printf ("True");
    }

    @Test
    public void testPush() throws Exception {
        String test = "test";
        SimpleStack stack = new SimpleStack();
        stack.push(new Item(test));
        assertEquals(1, stack.getSize());
    }

    @Test
    public void testPeek() throws Exception {
        Item t1 = new Item("test1");
        Item t2 = new Item("test2");
        SimpleStack stack = new SimpleStack();
        stack.push(t1);
        stack.push(t2);
        assertEquals(t2, stack.peek());
    }

    @Test
    public void testPop() throws Exception {
        Item i = new Item("test");
        SimpleStack stack = new SimpleStack();
        stack.push(i);
        assertEquals(i, stack.pop());
    }
}