import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ATM  {
    public static void atmPin() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter the ATM pin:");
            int pin = sc.nextInt();
            if (pin > 1000 && pin < 9999) {
                System.out.println("the pin is valid");
            } else {
                System.out.println("the pin is invalid");
            }
        } catch (InputMismatchException e) {
            System.out.println("error!! enter the correct input format" );
        }

    }

    public static void main(String[] args) {
        atmPin();
    }
}