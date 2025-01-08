package pro.shamilabd.lambda;

public class Lamp implements ElectricityConsumer {
    @Override
    public void switchOn() {
        lightOn();
    }

    public void lightOn() {
        System.out.println("Lamp turn On");
    }
}
