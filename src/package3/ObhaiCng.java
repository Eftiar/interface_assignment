package package3;

import package2.Cng;

public class ObhaiCng implements Cng {

    public static final int SPEED_LIMIT = 60;

    ObhaiCng(){
         System.out.println("\nPrinting Obhai activity");
    }

    @Override
    public void breaking() {
        System.out.println("CNG Hydrolic Bracking system");
    }

    @Override
    public void accelerating() {
        System.out.println("CNG accelerating system");

    }

    @Override
    public void honking() {
        System.out.println("CNG honk");

    }

    @Override
    public void chokeLever() {
        System.out.println("CNG chokelever(different activity)");

    }

    public void speedLimit(){
        System.out.println("CNG speed limit : " +SPEED_LIMIT);
    }

}
