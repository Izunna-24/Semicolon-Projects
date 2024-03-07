package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListNewTest {
    private ArrayListNew arrayList;

    @BeforeEach
    public void setUp() {
        arrayList = new ArrayListNew();
    }

    @Test
    public void testThatNewListIsEmpty() {
        assertTrue(arrayList.isEmpty());
    }

    @Test
    public void testThatNewElementIsAdded_listIsNotEmpty() {
        assertTrue(arrayList.isEmpty());
        arrayList.add("G String");
        assertFalse(arrayList.isEmpty());
    }

    @Test
    public void testThatNewElementIsAdded_elementIsRemoved_listIsEmpty() {
        assertTrue(arrayList.isEmpty());

        arrayList.add("G String");
        assertFalse(arrayList.isEmpty());

        arrayList.remove("G String");
        assertTrue(arrayList.isEmpty());
    }

    @Test
    public void testThatTwoElementIsAdded_oneElementIsRemoved_listIsNotEmpty() {
        assertTrue(arrayList.isEmpty());

        arrayList.add("G String");
        arrayList.add("A String");
        assertFalse(arrayList.isEmpty());

        arrayList.remove("G String");
        assertFalse(arrayList.isEmpty());
    }

    @Test
    public void testThatElementIsRemovedFromEmptyList_throwOutOfBoundException() {
        assertTrue(arrayList.isEmpty());
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> arrayList.remove("G String"));
    }


    @Test
    public void testThatWhenOneElementIsAdded_getByIndexReturnsTheElement() {
        assertTrue(arrayList.isEmpty());

        arrayList.add("G String");
        assertFalse(arrayList.isEmpty());

        assertEquals("G String", arrayList.get(1));
    }

    @Test
    public void testThatWhenTwoElementAreAdded_getTwoIndex_returnsTheElements() {
        assertTrue(arrayList.isEmpty());

        arrayList.add("G String");
        arrayList.add("A String");
        assertFalse(arrayList.isEmpty());

        assertEquals(2, arrayList.get("A String"));
    }

    @Test
    public void testThatWhenArrayIsFilled_newArrayTakesTheSpillOver() {
        assertTrue(arrayList.isEmpty());

        arrayList.add("G String");
        arrayList.add("A String");
        arrayList.add("C String");
        arrayList.add("F String");
        arrayList.add("B String");
        assertEquals(5, arrayList.size());


        arrayList.add("S String");
        assertEquals(6, arrayList.size());
        assertEquals(6, arrayList.get("S String"));
    }

    @Test
    public void testThatGettingTheIndexOfNonExistentElementIsZero() {
        assertTrue(arrayList.isEmpty());

        arrayList.add("G String");
        arrayList.add("A String");

        assertEquals(0, arrayList.get("D String"));
    }
}