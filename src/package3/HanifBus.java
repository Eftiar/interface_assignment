package package3;

import package2.Bus;

public class HanifBus implements Bus {

    public static final int SPEED_LIMIT = 100;

    HanifBus(){
        System.out.println("\nPrinting Hanif activity");
    }

    @Override
    public void breaking() {
        System.out.println("Bus Hydrolic Bracking system");
    }

    @Override
    public void accelerating() {
        System.out.println("Bus accelerating system");
    }

    @Override
    public void honking() {
        System.out.println("Bus honk");
    }

    @Override
    public void wheel() {
        System.out.println("Bus wheel(different activity)");
    }

    public void speedLimit(){
        System.out.println("Bus speed limit : " +SPEED_LIMIT);
    }
}
