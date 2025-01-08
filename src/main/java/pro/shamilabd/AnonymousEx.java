package pro.shamilabd;

public class AnonymousEx { // Нормальный класс

    static class B { } // вложенный класс

    class C { } // внутренний класс

    void foo() {
        class D { } // локальный внутренний класс
    }

    public static void main(String[] args) {
        Base base = new Base() { // анонимный класс со своей реализацией
            @Override
            public void method1() {
                System.out.println("Вызов method1 анонимного класса");
            }
        };
        base.method1(); // Вызов method1 анонимного класса
        base.method2(); // Вызов method2 обычного класса
    }
}

class Base {
    public void method1() {
        System.out.println("Вызов method1 обычного класса");
    }

    public void method2() {
        System.out.println("Вызов method2 обычного класса");
    }
}
