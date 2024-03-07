package airCondition;

public class AirCondition {
    private boolean isOn;
    private int temperature = 16;

    public boolean getIsOn() {
        return isOn;
    }

    public void turnAcOnAndOff() {
        isOn = !isOn;
    }


    public void increaseTemperature() {
        if (isOn && temperature >= 16 && temperature < 30) {
            temperature++;
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if (isOn && temperature > 16 && temperature <= 30) {
            temperature--;
        }
    }
}