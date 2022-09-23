package package3;

import package2.Audi;

public class HanifAudi implements Audi {

    public static final int SPEED_LIMIT = 100;

    HanifAudi(){
        System.out.println("\nPrinting Hanif activity");
    }

    @Override
    public void breaking() {
        System.out.println("Audi Hydrolic Bracking system");
    }

    @Override
    public void accelerating() {
        System.out.println("Audi accelerating system");
    }

    @Override
    public void honking() {
        System.out.println("Audi honk");
    }

    @Override
    public void wheel() {
        System.out.println("Audi wheel(different activity)");
    }

    public void speedLimit(){
        System.out.println("Audi speed limit : " +SPEED_LIMIT);
    }
}
