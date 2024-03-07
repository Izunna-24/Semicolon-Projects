package electricBike;

public class Bike {
    private boolean isOn;
    private int speed;
    private int gear;
    public boolean getIsOn() {
        return isOn;
    }
    public void turnOn() {
        isOn = true;
        gear = 1;
    }

    public void turnOff() {
        isOn = false;
    }

    public void accelerate() {
        if(isOn && gear == 1){
            speed++;
        }
        if(isOn && gear ==2){
            speed += 2;
        }
        if(isOn && gear == 3){
            speed += 3;
        }
        if (isOn && gear == 4){
            speed += 4;
        }
        setGear();
    }
public int getSpeedometer(){
        return speed;
}
public void setGear(){
        if(speed >= 0 && speed <= 20){
            gear = 1;
        }
        if(speed >= 21 && speed <= 30){
            gear = 2;
        }
        if (speed >= 31 && speed <= 40){
            gear = 3;
        }
        if (speed >= 41){
            gear = 4;
        }
}

    public int getGear() {
        return gear;
    }

    public void decelerates() {
        if (isOn && speed > 0){
            if (gear == 1){
                speed--;
            }
            if(gear == 2){
                speed -= 2;
            }
            if (gear == 3){
                speed -= 3;
            }
            if (gear == 4){
                speed -= 4;
            }
            setGear();
        }


    }
}
