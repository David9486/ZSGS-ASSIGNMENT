import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int strToInt(String str) throws InputMismatchException {
        return Integer.parseInt(str);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("enter the string:");
            System.out.println(strToInt(sc.next()));
        }catch(Exception e){
            throw new InputMismatchException("error! mismatch input: "+e.getMessage());
        }
    }
}