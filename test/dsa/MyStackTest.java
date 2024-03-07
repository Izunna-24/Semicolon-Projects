package dsa;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    @Test
    public void newStackIsEmptyTest() {
        MyStack myStack = new MyStack(4);
        myStack.isEmpty();
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void addX_myStackIsNotEmptyTest() {
        MyStack myStack = new MyStack(5);
        assertTrue(myStack.isEmpty());

        myStack.push("file one");
        assertFalse(myStack.isEmpty());
    }

    @Test
    public void addX_removeX_myStackIsEmptyTest() {
        MyStack myStack = new MyStack(4);

        assertTrue(myStack.isEmpty());

        myStack.push("file one");
        assertFalse(myStack.isEmpty());

        myStack.pop();
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void addXY_removeY_myStackIsNotEmptyTest() {
        MyStack myStack = new MyStack(5);

        assertTrue(myStack.isEmpty());

        myStack.push("file one");
        myStack.push("file two");
        assertFalse(myStack.isEmpty());

        myStack.pop();
        assertFalse(myStack.isEmpty());

    }

    @Test
    public void addXYZ_removeZ_myStackIsNotEmptyTest() {
        MyStack myStack = new MyStack(4);

        assertTrue(myStack.isEmpty());
        myStack.push("file one");
        myStack.push("file two");
        myStack.push("file three");
        assertEquals(3, myStack.size());

        myStack.pop();
        assertEquals(2, myStack.size());

    }

    @Test
    public void popEmptyStack_throwsExceptionTest() {
        MyStack myStack = new MyStack(4);
        assertTrue(myStack.isEmpty());

        assertThrows(EmptyStackException.class, () -> myStack.pop());

    }

    @Test
    public void pushIntoAFullStack_throwsOverFlowTest() {
        MyStack myStack = new MyStack(3);

        myStack.push("file one");
        myStack.push("file two");
        myStack.push("file three");

        assertFalse(myStack.isEmpty());
        assertThrows(StackOverflowError.class, () -> myStack.push("file four"));
    }

    @Test
    public void pushXYZ_popReturnsZAndRemovesZTest() {
        MyStack myStack = new MyStack(9);
        assertTrue(myStack.isEmpty());

        myStack.push("file one");
        myStack.push("file two");
        myStack.push("file three");
        assertEquals(3, myStack.size());

        assertEquals("file three", myStack.pop());

    }

    @Test
    public void pushXYZ_peekReturnsZTest() {
        MyStack myStack = new MyStack(9);
        assertTrue(myStack.isEmpty());

        myStack.push("file one");
        myStack.push("file two");
        myStack.push("file three");
        assertEquals(3, myStack.size());

        assertEquals("file three", myStack.peek());

    }

    @Test
    public void pushXYZ_searchReturnsTheLastElement_asFirstIndex() {
        MyStack myStack = new MyStack(9);
        assertTrue(myStack.isEmpty());

        myStack.push("file one");
        myStack.push("file two");
        myStack.push("file three");
        assertEquals(3, myStack.size());

        assertEquals( 2, myStack.search("file two"));

    }
}