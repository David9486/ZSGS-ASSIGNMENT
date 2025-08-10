import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ticket tic = null;
        System.out.println("1.BUS BOOKING\n2.TRAIN BOOKING\n3.FLIGHT BOOKING\n4.EXIT\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice: ");
        switch (sc.nextInt()) {
            case 1:
                tic = new BusTicket();
                tic.bookTicket();
                tic.display();
                break;
            case 2:
                tic = new TrainTicket();
                tic.bookTicket();
                tic.display();
                break;
            case 3:
                tic = new FlightTicket();
                tic.bookTicket();
                tic.display();
            case 4:
                break;
            default:
                System.out.println("enter the correct choice");
        }

    }
}