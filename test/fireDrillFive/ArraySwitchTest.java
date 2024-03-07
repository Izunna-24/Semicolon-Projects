package fireDrillFive;

import fireDrillFive.ArraySwitch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraySwitchTest {

    @Test
    public void arrayOfNumbers() {
        Assertions.assertArrayEquals(new boolean[] {true, false, false, true}, ArraySwitch.arrayOfNumbers(2, 3, 7, 8));

    }
}