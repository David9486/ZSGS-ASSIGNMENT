public class BusTicket implements Ticket{
    String destination;
    String ticNumber="";
    int fare;
    String busNumber;
    String travelsName;
    @Override
    public void bookTicket() {
        System.out.println("-------BUS BOOKING---------");
        System.out.println("enter the destination: ");
        this.destination = this.sc.next();
        System.out.println("enter the fare price: ");
        this.fare = this.sc.nextInt();
        System.out.println("enter the bus number: ");
        this.busNumber = this.sc.next();
        System.out.println("enter the travels name: ");
        this.travelsName = this.sc.next();
        System.out.println("enter the berth you wish (U/L)");
        char c =sc.next().charAt(0);
        if(c=='U'||c=='u'){
            ticNumber+=c;
        }
        else if(c=='L'||c=='l'){
            ticNumber+=c;
        }
        ticNumber=ticNumber+(1 + (int)(Math.random() * 10));

    }
    @Override
    public void display() {
        System.out.println("---------YOUR TICKET INFO----------");
        System.out.println("DESTINATION: " + this.destination);
        System.out.println("TICKET PRICE: " + this.fare);
        System.out.println("TICKET NUMBER: "+this.ticNumber);
        System.out.println("BUS NUMBER: " + this.busNumber);
        System.out.println("TRAVELS NAME: " + this.travelsName);
        System.out.println("TICKET NUMBER: "+ticNumber);
    }
}
