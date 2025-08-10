import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        Manager manage=new Manager();
        System.out.println("1.add a product\n"+"2.View All Products\n"+"3.Update Product\n"+"4.Delete Product\n"+"5.exit");
        System.out.println("enter the correct choice:");
        switch(sc.nextInt()){
            case 1:
                manage.addProd();
                break;
            case 2:
                manage.viewProd();
                break;
            case 3:
                manage.updateProd();
                break;
            case 4:
                manage.deleteProd();
                break;
            case 5:
                break;
            default:System.out.println("enter the correct choice");
        }
    }
}