package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyNewSetTest {
    private MyNewSet myNewSet;


    @BeforeEach
    public void provided(){
        myNewSet = new MyNewSet();
    }

    @Test
    public void myNewSet_isEmptyTest(){
        assertTrue(myNewSet.isEmpty());
    }

    @Test
    public void elementsIsAdded_myNewSetIsNotEmptyTest(){
        assertTrue(myNewSet.isEmpty());
        myNewSet.addElement("Opel");
        assertFalse(myNewSet.isEmpty());
    }
}
