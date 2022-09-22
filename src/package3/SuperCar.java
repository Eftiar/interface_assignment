package package3;

import package2.Bus;
import package2.Cng;

class SuperCar implements Bus, Cng {

    public static final int SPEED_LIMIT = 2000;

    SuperCar(){
        System.out.println("\nPrinting Supercar activity");
    }

    @Override
    public void breaking() {
        System.out.println("Supercar Hydrolic Bracking system");
    }

    @Override
    public void accelerating() {
        System.out.println("Supercar acceleration system");
    }

    @Override
    public void honking() {
        System.out.println("Supercar honking system");
    }

    @Override
    public void wheel() {
        System.out.println("Supercar wheel system");
    }

    @Override
    public void chokeLever() {
        System.out.println("Supercar chokeLever system");
    }

    public void speedLimit(){
        System.out.println("Supercar speed limit : " +SPEED_LIMIT);
    }
}
