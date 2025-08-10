import arithmetic.Arithmetic;
import stringutils.Stringutils;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*2. Create a Java application that demonstrates the use of user-defined packages by organising classes based on their functionality:
     --- arithmetic: This package should include a class that defines methods to perform the following operations on two numbers:
    a. Addition
    b. Subtraction
    c. Multiplication
    d. Division
    e. Modulo
--- stringutils: This package should include a class that defines methods for:
    a. Concatenating two strings
    b. Reversing a string
    c. Finding the length of a string
    In your main class (outside those packages), import the above packages and demonstrate the usage of all the methods.*/
        Scanner sc=new Scanner(System.in);
        /*Arithmetic a=new Arithmetic();
        System.out.println("enter the number1:");
        int m=sc.nextInt();
        System.out.println("enter the number2:");
        int n=sc.nextInt();
        System.out.println("sum: "+a.add(m,n));
        System.out.println("subtraction: "+a.sub(m,n));
        System.out.println("multiply: "+a.mul(m,n));
        System.out.println("division: "+a.div(m,n));
        System.out.println("modulus: "+a.mod(m,n));*/

        Stringutils str=new Stringutils();
        System.out.println("enter the string1:");
        String k=sc.nextLine();
        System.out.println("enter the string2:");
        String l=sc.nextLine();
        System.out.println("concatenation: "+str.concate(k,l));
        System.out.println("reverse: "+str.reverseStr(k));
        System.out.println("len: "+str.lengthStr(k));



    }
}