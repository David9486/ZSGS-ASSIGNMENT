//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void method1() {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("error:" + e.getMessage());
        }

    }

    public static void method2() {
        method3();
    }

    public static void method3() {
        int div = 50 / 0;
    }

    public static void main(String[] args) {
        method1();
    }
}