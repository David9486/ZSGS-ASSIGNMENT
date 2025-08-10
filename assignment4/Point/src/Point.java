import java.util.Scanner;

public class Point {
    Scanner sc=new Scanner(System.in);
    int x;
    int y;
   public void setPoints(int x,int y){
       this.x=x;
       this.y=y;
   }
   public int getX(){
       return x;
   }

    public int getY() {
        return y;
    }
    public void printPoint(){
       System.out.println("the coordinates are: "+x+" , "+y);
    }
    public static void main(String[] args) {
        Circle c=new Circle();
        c.area();
    }
}
