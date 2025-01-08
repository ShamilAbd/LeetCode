package pro.shamilabd.lambda;

public class Main {

    public static int modifuInt(int val) {
        return val * val;
    }

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        switcher.addElectricity(lamp);
        switcher.addElectricity(radio);

        String text = "Превышена допустимая нагрузка на выключатель!";
        switcher.addElectricity(
                () -> System.out.println(text));
        switcher.switchOn();

        switcher.execTest(val -> Main.modifuInt(val));
        switcher.execTest(Main::modifuInt);
    }
}
