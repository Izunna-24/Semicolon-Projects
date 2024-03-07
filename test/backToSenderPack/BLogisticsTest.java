package backToSenderPack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BLogisticsTest {


    @Test
    public void blogistics_hasRidersTest() {
        BLogistics bLogistics = new BLogistics();
        bLogistics.hasRiders();
        assertTrue(bLogistics.hasRiders());
    }
    @Test
    public void paymentForDeliveryLessThan50Is_160Test(){
        BLogistics bLogistics = new BLogistics();
        bLogistics.hasRiders();
        assertEquals(6_440, bLogistics.dailyPayment(9));
    }

    @Test
    public void paymentForDeliveryLessThan59IsTest(){
        BLogistics bLogistics = new BLogistics();
        bLogistics.hasRiders();
        int actual = bLogistics.dailyPayment(57);
        int expected = 16_400;
        assertEquals(expected, actual);
    }
    @Test
    public void paymentForDeliveryLessThan69Test(){
        BLogistics bLogistics = new BLogistics();
        bLogistics.hasRiders();
        int actual = bLogistics.dailyPayment(69);
        int expected = 22_250;
        assertEquals(expected, actual);
    }

    @Test
    public void paymentForDeliveryGreaterThan69Test(){
        BLogistics bLogistics = new BLogistics();
        bLogistics.hasRiders();
        int actual = bLogistics.dailyPayment(70);
        int expected = 40_000;
        assertEquals(expected, actual);
    }

    @Test
    public void paymentForDeliveryLessThan0ThrowsExceptionTestTest(){
        BLogistics bLogistics = new BLogistics();
        assertThrows(IllegalArgumentException.class, ()-> bLogistics.dailyPayment(-1));
    }

    @Test
    public void paymentForDeliveryGreaterThan100ThrowsExceptionTestTest(){
        BLogistics bLogistics = new BLogistics();
        assertThrows(IllegalArgumentException.class, ()-> bLogistics.dailyPayment(105));
    }
}
