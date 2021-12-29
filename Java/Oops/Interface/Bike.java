package Oops.Interface;

public class Bike implements Vehicle{
    int speed;
    int gear;
    public void printState(){
        System.out.println(" speed "+speed +" gear "+ gear);
    }
    @Override
    public void changeGear(int a) {
        gear = a;
    }
    @Override
    public void speedUp(int a) {
        speed= speed+a;
    }
    @Override
    public void applyBreaks(int a) {
        speed=speed-a;
    }

}
