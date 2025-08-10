public class Circle extends Point{
    private int radius;
    double area;

    public void setRadius(int radius) {
        if(radius<0){
            this.radius=1;
        }else this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    public void area(){
       System.out.println("enter the point x: ");
       System.out.println("enter the point y: ");
       setPoints(sc.nextInt(),sc.nextInt());
       System.out.println("enter the radius: ");
       setRadius(sc.nextInt());
       System.out.println("the circle center are: "+this.getX()+" , "+this.getY());
       area=3.14*radius*radius;
       System.out.println("the area is: "+area);
    }
}
