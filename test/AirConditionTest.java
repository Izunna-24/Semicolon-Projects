import airCondition.AirCondition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {
    private AirCondition airCondition;

    @BeforeEach
    public void setUp(){
        airCondition = new AirCondition();
    }

    @Test
    public void testThatAcIsOff_AcCanBeTurnedOn(){
        assertFalse(airCondition.getIsOn());
        airCondition.turnAcOnAndOff();
        assertTrue(airCondition.getIsOn());
    }

    @Test
    public void testThatAcIsOn_AcCanBeTurnedOff(){
        assertFalse(airCondition.getIsOn());
        airCondition.turnAcOnAndOff();
        assertTrue(airCondition.getIsOn());

        airCondition.turnAcOnAndOff();
        assertFalse(airCondition.getIsOn());
    }

    @Test
    public void testThatAcIsOn_AcCanIncreaseTemperature(){
        airCondition.turnAcOnAndOff();
        assertTrue(airCondition.getIsOn());
        assertEquals(16, airCondition.getTemperature());

        airCondition.increaseTemperature();
        assertEquals(17, airCondition.getTemperature());

    }
    @Test
    public void testThatAcIsOn_AcCanDecreaseTemperature(){
        airCondition.turnAcOnAndOff();
        assertTrue(airCondition.getIsOn());
        assertEquals(16, airCondition.getTemperature());

        airCondition.increaseTemperature();
        assertEquals(17, airCondition.getTemperature());

        airCondition.decreaseTemperature();
        assertEquals(16,airCondition.getTemperature());


    }

    @Test
    public void testThatAcIsOn_AcTemperatureCanNotIncreaseBeyondThirty(){
        airCondition.turnAcOnAndOff();
        assertTrue(airCondition.getIsOn());
        assertEquals(16, airCondition.getTemperature());

        airCondition.increaseTemperature();
        assertEquals(17, airCondition.getTemperature());

        for (int count = 1; count < 17; count++){
            airCondition.increaseTemperature();
        }
        assertEquals(30, airCondition.getTemperature());

    }

    @Test
    public void testThatAcIsOn_AcTemperatureDoesNotDecreaseBelowSixteen(){
        airCondition.turnAcOnAndOff();
        assertTrue(airCondition.getIsOn());
        assertEquals(16, airCondition.getTemperature());

        airCondition.decreaseTemperature();
        assertEquals(16, airCondition.getTemperature());

        for (int count = 1; count < 6; count++){
            airCondition.decreaseTemperature();
        }
        assertEquals(16, airCondition.getTemperature());
    }
}
