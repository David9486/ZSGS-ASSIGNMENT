package Travel;
import  Travel.Booking.Ticket;
public class User {
    private String userName;
    private String emailId;
    private String gender;

    public User(String userName, String emailId, String gender) {
        this.userName = userName;
        this.emailId = emailId;
        this.gender = gender;
    }
    Ticket tic=new Ticket("tic001","CHENNAI",2000);
    public void ticDetails(){
        System.out.println("---------TICKET DETAILS----------");
        System.out.println("PASSENGER NAME: "+userName);
        System.out.println("EMAIL ID: "+emailId);
        System.out.println("Gender: "+gender);
        System.out.println("TICKET ID: "+tic.getTicketId());
        System.out.println("DESTINATION: "+tic.getDestination());
        System.out.println("TICKET FARE: "+tic.getFare());

    }

}
