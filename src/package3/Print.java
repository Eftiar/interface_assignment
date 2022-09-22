package package3;

public class Print {
    public static void main(String[]args){
        HanifBus h = new HanifBus();
        h.speedLimit();h.accelerating();h.breaking();h.honking();h.wheel();

        ObhaiCng c = new ObhaiCng();
        c.speedLimit();c.accelerating();c.breaking();c.honking();c.chokeLever();

        SuperCar s = new SuperCar();
        s.speedLimit();s.accelerating();s.breaking();s.honking();s.wheel();s.chokeLever();
    }
}
