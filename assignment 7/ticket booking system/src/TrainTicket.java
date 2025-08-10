public class TrainTicket implements Ticket{
    String destination;
    int fare;
    String compartment;
    String trainName;
    String seatNumber="";

    public void bookTicket() {
        System.out.println("-------TRAIN BOOKING---------");
        System.out.println("enter the destination: ");
        this.destination = this.sc.next();
        System.out.println("enter the fare price: ");
        this.fare = this.sc.nextInt();
        System.out.println("enter the compartment type: ");
        this.compartment = this.sc.next();
        System.out.println("enter the train name: ");
        this.trainName = this.sc.next();
        System.out.println("enter the berth you wish (U/L)");
        char c =sc.next().charAt(0);
        if(c=='U'||c=='u'){
            seatNumber+=c;
        }
        else if(c=='L'||c=='l'){
            seatNumber+=c;
        }
        seatNumber=seatNumber+(1 + (int)(Math.random() * 100));
    }

    public void display() {
        System.out.println("---------YOUR TICKET INFO----------");
        System.out.println("DESTINATION: " + this.destination);
        System.out.println("TICKET PRICE: " + this.fare);
        System.out.println("COMPARTMENT TYPE: " + this.compartment);
        System.out.println("TRAIN NAME: " + this.trainName);
        System.out.println("SEAT NUMBER: "+seatNumber);
    }
}
