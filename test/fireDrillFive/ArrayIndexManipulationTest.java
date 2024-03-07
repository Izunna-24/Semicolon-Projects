package fireDrillFive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayIndexManipulationTest {
    private ArrayIndexManipulation arrayIndexManipulation;




    @Test
    public void arrayCanTakeElements_elementsWillChangeToZeroOrOne(){
        assertArrayEquals(new int[]{0, 1, 0, 0, 0, 0, 0 }, ArrayIndexManipulation.addNumbers(2, 3, 4, 6, 8, 4, 10));

    }
}