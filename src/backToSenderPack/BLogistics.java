package backToSenderPack;

public class BLogistics {
    private final int BASEPAY = 5000;
    public boolean hasRiders() {
        return true;
    }
    public int dailyPayment(int deliveries) {
        int riderWage = BASEPAY;

        if(deliveries < 0) {throw new IllegalArgumentException("No deliveries made!");
        }
        else if (deliveries > 100) {throw new IllegalArgumentException("Deliveries exceeded per day!!");
        }
        else if  (deliveries <= 50) {
            riderWage += deliveries * 160;
        } else if (deliveries <= 59) {
            riderWage += deliveries * 200;
        } else if (deliveries <= 69) {
            riderWage += deliveries * 250;
        } else {
            riderWage += deliveries * 500;
        }

        return riderWage;
    }
}
