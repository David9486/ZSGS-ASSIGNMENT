public class FlightTicket implements Ticket{
    String destination;
    int fare;
    String className;
    String flightName;

    public void bookTicket() {
        System.out.println("-------FLIGHT BOOKING---------");
        System.out.println("enter the destination: ");
        this.destination = this.sc.next();
        System.out.println("enter the fare price: ");
        this.fare = this.sc.nextInt();
        System.out.println("enter the class type: ");
        this.className = this.sc.next();
        System.out.println("enter the flight name: ");
        this.flightName = this.sc.next();
    }

    public void display() {
        System.out.println("DESTINATION: " + this.destination);
        System.out.println("TICKET PRICE: " + this.fare);
        System.out.println("CLASS NAME: " + this.className);
        System.out.println("FLIGHT NAME: " + this.flightName);
    }
}
