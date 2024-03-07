package television;

public class Television {
    private int volume;
    private boolean isOn;
    public boolean getIsOn() {
        return isOn;
    }

    public void tvOnAndOff() {
        isOn = !isOn;
    }

    public void increaseVolume() {
        if (isOn && volume >= 0 && volume < 100){
            volume++;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void decreaseVolume() {
        if(isOn && volume > 0 && volume <= 100){
            volume--;
        }
    }
}
