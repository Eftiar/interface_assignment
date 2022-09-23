package package3;

public class Main {
    public static void main(String[]args){
        HanifAudi h = new HanifAudi();
        h.speedLimit();h.accelerating();h.breaking();h.honking();h.wheel();

        ObhaiFerrari c = new ObhaiFerrari();
        c.speedLimit();c.accelerating();c.breaking();c.honking();c.chokeLever();

        SuperCar s = new SuperCar();
        s.speedLimit();s.accelerating();s.breaking();s.honking();s.wheel();s.chokeLever();
    }
}
