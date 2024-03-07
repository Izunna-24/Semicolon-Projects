package nigeriaGeopoliticalZones;

import nigeriaGeopoliticalZones.GeoPoliticalZones;
import nigeriaGeopoliticalZones.Nigeria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NigeriaTest {

    @Test
    public void stateIsEntered_stateGivesGeopoliticalZone() {
        assertEquals(GeoPoliticalZones.NORTH_CENTRAL, Nigeria.knowYourZone("FCT"));
    }
}