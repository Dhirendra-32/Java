package Oops.Interface;

public class Bicycle implements Vehicle{
    int gear;
    int speed;

    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    @Override
    public void speedUp(int newSpeed){
        speed=speed+newSpeed;
    }

    @Override
    public void applyBreaks(int decrement) {
        speed=speed-decrement;
    }

    public void printState(){
        System.out.println("speed "+speed +" gear "+ gear);
    }

}
