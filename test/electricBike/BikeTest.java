package electricBike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private Bike bike;

    @BeforeEach
    public void setUp() {
        bike = new Bike();
    }

    @Test
    public void testThatBikeCanBeTurnedOn() {
        assertFalse(bike.getIsOn());
        bike.turnOn();
        assertTrue(bike.getIsOn());
    }

    @Test
    public void testThatBikeIsOn_BikeCanTurnOff() {
        assertFalse(bike.getIsOn());
        bike.turnOn();
        assertTrue(bike.getIsOn());
        bike.turnOff();
        assertFalse(bike.getIsOn());
    }

    @Test
    public void testThatBikeIsOnGearOne_SpeedWillIncreaseByOne() {
        assertFalse(bike.getIsOn());
        bike.turnOn();
        assertTrue(bike.getIsOn());
        bike.accelerate();
        assertEquals(1, bike.getSpeedometer());
    }

    @Test
    public void testThatWhenSpeedIsAboveTwenty_GearChangesFromOneToTwo() {
        assertFalse(bike.getIsOn());
        bike.turnOn();
        assertTrue(bike.getIsOn());
        for (int index = 0; index < 21; index++) {
            bike.accelerate();
        }
        assertEquals(2, bike.getGear());
    }

    @Test
    public void testThatGearAtTwo_IncreasesSpeedByTwo() {
        assertFalse(bike.getIsOn());
        bike.turnOn();
        assertTrue(bike.getIsOn());
        for (int index = 0; index < 21; index++) {
            bike.accelerate();
        }
        bike.accelerate();
        assertEquals(23, bike.getSpeedometer());

    }

    @Test
    public void testThatWhenSpeedIsAboveThirty_GearChangesFromTwoToThree() {
        assertFalse(bike.getIsOn());
        bike.turnOn();
        assertTrue(bike.getIsOn());
        for (int index = 0; index < 26; index++) {
            bike.accelerate();
        }
        assertEquals(31, bike.getSpeedometer());
        assertEquals(3, bike.getGear());
    }

    @Test
    public void testThatGearAtThree_IncreasesSpeedByThree() {
        assertFalse(bike.getIsOn());
        bike.turnOn();
        assertTrue(bike.getIsOn());
        for (int index = 0; index < 26; index++) {
            bike.accelerate();
        }
        assertEquals(31, bike.getSpeedometer());
        assertEquals(3, bike.getGear());
        bike.accelerate();
        assertEquals(34, bike.getSpeedometer());
    }

    @Test
    public void testThatWhenSpeedIsAboveForty_GearChangesFromThreeToFour() {
        assertFalse(bike.getIsOn());
        bike.turnOn();
        assertTrue(bike.getIsOn());
        for (int index = 0; index < 30; index++) {
            bike.accelerate();
        }
        assertEquals(43, bike.getSpeedometer());
        assertEquals(4, bike.getGear());
    }

    @Test
    public void testThatGearAtFour_IncreasesSpeedByFour() {
        assertFalse(bike.getIsOn());
        bike.turnOn();
        assertTrue(bike.getIsOn());
        for (int index = 0; index < 30; index++) {
            bike.accelerate();
        }
        assertEquals(43, bike.getSpeedometer());
        assertEquals(4, bike.getGear());
        bike.accelerate();
        assertEquals(47, bike.getSpeedometer());
    }

    @Test
    public void testThatGearAtOne_SpeedIsZero() {
        assertFalse(bike.getIsOn());
        bike.turnOn();
        assertTrue(bike.getIsOn());
        bike.decelerates();
        assertEquals(0, bike.getSpeedometer());

    }

    @Test
    public void testThatBikeIsOnGearOne_SpeedWillDecreaseByOne() {
        assertFalse(bike.getIsOn());
        bike.turnOn();
        assertTrue(bike.getIsOn());

        for (int index = 0; index < 19; index++) {
            bike.accelerate();
        }
        assertEquals(19, bike.getSpeedometer());
        assertEquals(1, bike.getGear());
        bike.decelerates();
        assertEquals(18, bike.getSpeedometer());

    }

    @Test
    public void testThatGearAtTwo_WhenSpeedIsBelowTwentyOne_GearChangesToOne() {
        assertFalse(bike.getIsOn());
        bike.turnOn();
        assertTrue(bike.getIsOn());
        for (int count = 0; count < 21; count++) {
            bike.accelerate();
        }
        assertEquals(21, bike.getSpeedometer());
        assertEquals(2, bike.getGear());
        bike.decelerates();
        assertEquals(19, bike.getSpeedometer());

    }

    @Test
    public void testThatGearAtTwo_SpeedDecreasesByTwo() {
        assertFalse(bike.getIsOn());
        bike.turnOn();
        assertTrue(bike.getIsOn());
        for (int count = 0; count < 24; count++) {
            bike.accelerate();
        }
        assertEquals(27, bike.getSpeedometer());
        bike.decelerates();
        assertEquals(25, bike.getSpeedometer());
    }

    @Test
    public void testThatGearAtThree_WhenSpeedIsBelowThirtyOne_GearChangesToTwo() {
        assertFalse(bike.getIsOn());
        bike.turnOn();
        assertTrue(bike.getIsOn());
        for (int count = 0; count < 26; count++) {
            bike.accelerate();
        }
        assertEquals(31, bike.getSpeedometer());
        assertEquals(3, bike.getGear());
        bike.decelerates();
        assertEquals(2, bike.getGear());

    }

    @Test
    public void testThatGearAtThree_SpeedDecreasesByThree() {
        assertFalse(bike.getIsOn());
        bike.turnOn();
        assertTrue(bike.getIsOn());
        for (int count = 0; count < 28; count++) {
            bike.accelerate();
        }
        assertEquals(37, bike.getSpeedometer());
        bike.decelerates();
        assertEquals(34, bike.getSpeedometer());
    }

    @Test
    public void testThatGearAtFour_WhenSpeedIsBelowForty_GearChangesToFour() {
        assertFalse(bike.getIsOn());
        bike.turnOn();
        assertTrue(bike.getIsOn());
        for (int count = 0; count < 30; count++) {
            bike.accelerate();
        }
        assertEquals(43, bike.getSpeedometer());
        assertEquals(4, bike.getGear());
        bike.decelerates();
        assertEquals(3, bike.getGear());

    }
    @Test
    public void testThatGearAtFour_SpeedDecreasesByFour() {
        assertFalse(bike.getIsOn());
        bike.turnOn();
        assertTrue(bike.getIsOn());
        for (int count = 0; count < 31; count++) {
            bike.accelerate();
        }
        assertEquals(47, bike.getSpeedometer());
        assertEquals(4,bike.getGear());
        bike.decelerates();
        assertEquals(43, bike.getSpeedometer());
    }
}


