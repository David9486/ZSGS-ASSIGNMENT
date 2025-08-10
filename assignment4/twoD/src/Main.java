import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ThreeD three=new ThreeD();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the x point: ");
        three.setX1(sc.nextInt());
        System.out.println("enter the y point: ");
        three.setY1(sc.nextInt());
        System.out.println("enter the z point: ");
        three.setZ1(sc.nextInt());
        ThreeD three1=new ThreeD(1,2,3,4);
        three.distance(three,three1);
    }
}