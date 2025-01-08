package pro.shamilabd.lambda;

import java.util.ArrayList;
import java.util.List;

public class Switcher {

    private final List<ElectricityConsumer> subscribers = new ArrayList<>();

    public void addElectricity(ElectricityConsumer consumer) {
        subscribers.add(consumer);
    }

    public void removeElectricity(ElectricityConsumer consumer) {
        subscribers.remove(consumer);
    }

    public void switchOn() {
        for (ElectricityConsumer e : subscribers) {
            e.switchOn();
        }
    }

    public void execTest(Test test) {
        System.out.println(test.changeVal(5));
    }
}

