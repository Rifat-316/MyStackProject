import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    @Test
    void testIntegerStack() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.top());
    }

    @Test
    void testStringStack() {
        MyStack<String> stack = new MyStack<>();
        stack.push("A");
        stack.push("B");
        assertEquals("B", stack.top());
    }

    @Test
    void testPop() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.pop();
        assertEquals(1, stack.top());
    }

    @Test
    void testEmpty() {
        MyStack<Integer> stack = new MyStack<>();
        assertTrue(stack.isEmpty());
    }

    @Test
    void testSize() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(100);
        stack.push(200);
        assertEquals(2, stack.size());
    }

    @Test
    void testPopOnEmptyStack() {
        MyStack<Integer> stack = new MyStack<>();
        assertThrows(RuntimeException.class, stack::pop);
    }

    @Test
    void testTopOnEmptyStack() {
        MyStack<Integer> stack = new MyStack<>();
        assertThrows(RuntimeException.class, stack::top);
    }

    @Test
    void testIsEmptyAfterPop() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(5);
        stack.pop();
        assertTrue(stack.isEmpty());
    }
}