public class Audi extends Car{
    String modelType;
    public void display(){
        System.out.println("MODEL TYPE: "+modelType);
        System.out.println("OWNERSHIP COST: "+ownerShipCost);
        System.out.println("SEAT CAPACITY: "+seatCapacity);
        System.out.println("WARRANTY: "+warranty);
        System.out.println("FUEL TYPE: "+fuelType);
    }
}
