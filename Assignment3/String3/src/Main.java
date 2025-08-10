import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string you wish:");
        String s=sc.nextLine();
        MyString n=new MyString(s);
        System.out.println("1.To find length\n"+"2.To find a character at index\n"+"3.To find if two string are equal\n"+"4.To convert to uppercase\n"+"5.To convert to uppercase\n"+"6.To find sub string\n"+"7.Concatenation of Strings\n"+"8.To check a sub string(contain)\n"+"9.index of character\n"+"10.replace a character\n");
        System.out.println("enter your choice:");
        switch(sc.nextInt()) {
            case 1:
                System.out.println("length of the String is: " + n.length());
                break;
            case 2:
                System.out.println("enter the index number:");
                System.out.println(n.CharAt(sc.nextInt()));
                break;
            case 3:
                sc.nextLine();
                System.out.println("enter the other string to check ");
                String k=sc.nextLine();
                System.out.println(n.equals(s,k));
                break;
            case 4:
                System.out.println("the string after uppercase is: " + n.toUpperCase());
                break;
            case 5:
                System.out.println("the string after lowercase is: " + n.toLowerCase());
                break;
            case 6:
                System.out.println("enter the starting index:");
                int start = sc.nextInt();
                System.out.println("enter the last index:");
                int last = sc.nextInt();
                System.out.println(n.substring(start, last));
                break;
            case 7:
                sc.nextLine();
                System.out.println("enter the other string to concat:");
                System.out.println("the string after concat is: " + n.concat(s, sc.nextLine()));
                break;
            case 8:
                sc.nextLine();
                System.out.println("enter the substring to check:");
                System.out.println(n.contains(s, sc.nextLine()));
                break;
            case 9:
                System.out.print("enter the character:");
                String c = sc.next();
                System.out.println("index is: " + n.indexOf(c.charAt(0)));
                break;
            case 10:
                sc.nextLine();
                System.out.println("enter the new character:");
                char new1 = sc.next().charAt(0);
                System.out.println("enter the old character to replace:");
                char old = sc.next().charAt(0);
                System.out.println(n.replace(old, new1));
                break;
            default:System.out.println("enter the correct choice");
        }
    }
}