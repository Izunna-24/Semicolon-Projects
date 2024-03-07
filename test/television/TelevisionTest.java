package television;

import television.Television;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
   private Television television;

   @BeforeEach
    public void setUp(){
       television = new Television();
    }

    @Test
    void testThatTvIsOff_TvCanBeTurnedOn(){
        assertFalse(television.getIsOn());
        television.tvOnAndOff();
        assertTrue(television.getIsOn());
   }

    @Test
    void testThatTvIsOn_TvCanBeTurnedOff(){
       assertFalse(television.getIsOn());
        television.tvOnAndOff();
        assertTrue(television.getIsOn());
        television.tvOnAndOff();
        assertFalse(television.getIsOn());

    }

    @Test
    void testThatTvIsOn_TvCanIncreaseVolume(){
       assertFalse(television.getIsOn());
       television.tvOnAndOff();
       assertTrue(television.getIsOn());
       television.increaseVolume();
       assertEquals(1, television.getVolume());
    }

    @Test
    void testThatTvIsOff_VolumeWillNotIncrease(){
        assertFalse(television.getIsOn());
        television.tvOnAndOff();
        assertTrue(television.getIsOn());
        television.tvOnAndOff();
        assertFalse(television.getIsOn());
        television.increaseVolume();
        assertEquals(0, television.getVolume());
    }

    @Test
    void testThatTvIsOn_VolumeIsIncreased_VolumeCanDecrease(){
        assertFalse(television.getIsOn());
        television.tvOnAndOff();
        assertTrue(television.getIsOn());
        television.increaseVolume();
        assertEquals(1, television.getVolume());
        television.decreaseVolume();
        assertEquals(0,television.getVolume());

   }

    @Test
    void testThatTvIsOff_VolumeWillNotDecrease(){
        assertFalse(television.getIsOn());
        television.tvOnAndOff();
        assertTrue(television.getIsOn());
        television.tvOnAndOff();
        assertFalse(television.getIsOn());
        television.decreaseVolume();
        assertEquals(0, television.getVolume());
    }

    @Test
    void testThatTvIsOn_VolumeWillNotIncreaseBeyondHundred(){
        assertFalse(television.getIsOn());
        television.tvOnAndOff();
        assertTrue(television.getIsOn());
       for (int count = 0; count < 110; count++){
            television.increaseVolume();
       }
       assertEquals(100,television.getVolume());

    }

    @Test
    void testThatTvIsOn_VolumeWillNotDecreaseBelowZero(){
        assertFalse(television.getIsOn());
        television.tvOnAndOff();
        assertTrue(television.getIsOn());
        for (int count = 0; count < 10; count++){
            television.increaseVolume();
        }
        assertEquals(10,television.getVolume());
        for (int count = 0; count < 11; count++) {
            television.decreaseVolume();
        }
        assertEquals(0,television.getVolume());


    }
}
