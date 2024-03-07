package dsa;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyNewQueueTest {
    private MyNewQueue myNewQueue;

    @BeforeEach
    public void providedPerTime(){
        myNewQueue = new MyNewQueue(5);
    }

    @Test
    public void queueCreated_isEmptyTest(){
        myNewQueue.isEmpty();
    }

    @Test
    public void addElements_myNewQueue_isNotEmptyTest(){
        assertTrue(myNewQueue.isEmpty());
        myNewQueue.add("element");
        assertFalse(myNewQueue.isEmpty());
    }
    @Test
    public void addElements_myNewQueue_throwsIllegalStateExceptionsTest(){
        for (int count = 0; count < 5; count++) {
            myNewQueue.add("elements");
        }
        assertThrows(IllegalStateException.class, () -> myNewQueue.add("element"));
    }

    @Test
    public void removeElement_numberOfElementsReducesTest(){
       myNewQueue.add("element");
       myNewQueue.add("element");
       myNewQueue.add("element");
       assertEquals(3, myNewQueue.getSize());

       myNewQueue.remove("element");
        assertEquals(2, myNewQueue.getSize());

    }

    @Test
    public void removeElementFromEmptyQueue_throwsNoSuchElementExceptionTest(){
        assertTrue(myNewQueue.isEmpty());

        assertThrows(NoSuchElementException.class,() -> myNewQueue.remove("element"));
    }

    @Test
    public void addElementOfAnotherClass_throwsClassCastExceptionIfMyQueueIsEmptyTest(){
        assertFalse(myNewQueue.isEmpty());

        assertThrows(ClassCastException.class,() -> myNewQueue.remove("element"));
    }
}
