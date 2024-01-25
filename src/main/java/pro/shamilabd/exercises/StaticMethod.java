package pro.shamilabd.exercises;

public class StaticMethod {
    public static void main(String[] args) {
        Hello hello = null;
        hello.print(); // not NPE, Hello world!
    }
}

class Hello {
    public static void print() {
        System.out.println("Hello world!");
    }
}
