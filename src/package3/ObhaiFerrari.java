package package3;

import package2.Ferrari;

public class ObhaiFerrari implements Ferrari {

    public static final int SPEED_LIMIT = 60;

    ObhaiFerrari(){
         System.out.println("\nPrinting Obhai activity");
    }

    @Override
    public void breaking() {
        System.out.println("Ferrari Hydrolic Bracking system");
    }

    @Override
    public void accelerating() {
        System.out.println("Ferrari accelerating system");

    }

    @Override
    public void honking() {
        System.out.println("Ferrari honk");

    }

    @Override
    public void chokeLever() {
        System.out.println("Ferrari chokelever(different activity)");

    }

    public void speedLimit(){
        System.out.println("Ferrari speed limit : " +SPEED_LIMIT);
    }

}
