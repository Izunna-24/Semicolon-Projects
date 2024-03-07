package personalTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumTest {
    @Test
    public void testThatMaximumNumberIsReturned(){
        int result = Maximum.max(10,1,1);
        assertEquals(10,result);
    }
    @Test
    public void testThatNegativeHighestCanBeGotten(){
        int result = Maximum.maxNegative(-3,-10,-30);
        assertEquals(-3, result);
    }
}
