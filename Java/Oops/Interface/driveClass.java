package Oops.Interface;

public class driveClass {

    public static void main(String[] args) {
        /* Creating instance of Bicycle class */
        Bicycle bcl = new Bicycle();
        bcl.changeGear(6);
        bcl.speedUp(7);
        bcl.applyBreaks(2);
        bcl.printState();
        /* Creating instance of Bike class */
        Bike bk = new Bike();
        bk.changeGear(10);
        bk.speedUp(15);
        bk.applyBreaks(6);
        bk.printState();

    }
}
