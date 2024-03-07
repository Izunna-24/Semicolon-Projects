package fireDrillFive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleArrayTest {
    private DoubleArray doubleArray;

    @BeforeEach
    public void setUp(){
        doubleArray = new DoubleArray();
    }

    @Test
    public void createNewArray_andDoubleTheSizeTest(){
        int [] numbers = {4, 5, 7};
        assertEquals(6,doubleArray.createDoubleArray(numbers).length);

    }
    @Test
    public void createArrayThatDoublesIndexTest(){
        int [] numbers = {4, 5, 6};
        assertEquals(6,doubleArray.createDoubleArray(numbers).length);

        //doubleArray.add();


    }

}
