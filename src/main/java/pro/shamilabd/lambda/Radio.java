package pro.shamilabd.lambda;

public class Radio implements ElectricityConsumer {
    @Override
    public void switchOn() {
        musicOn();
    }

    public void musicOn() {
        System.out.println("Radio turn On");
    }
}
