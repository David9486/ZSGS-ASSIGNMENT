import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //a. append the specified element to the end of a linked list.
        Scanner sc = new Scanner(System.in);
        LinkedList<String> link = new LinkedList<>();
        link.add("red");
        link.add("blue");
        link.add("yellow");
        link.add("green");
        link.add("red");
        /*System.out.println("enter the element:");
        link.addLast(sc.next());
        System.out.println(link);*/
        //(----------------------------------------------)
        //b.iterate through all elements in a linked list.
        /*Iterator<String>it=link.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
        //(----------------------------------------------)
        //c. iterate through all elements in a linked list starting at the specified position.
        /*System.out.println("enter the index to iterate:");
        int index=sc.nextInt();
        for(int i=index;i<link.size();i++){
            System.out.println(link.get(i));
        }*/
        //(----------------------------------------------)
        //d.iterate a linked list in reverse order.
        /*ListIterator<String>lt=link.listIterator(link.size());
        while(lt.hasPrevious()){
            System.out.println(lt.previous());
        }*/
        //(----------------------------------------------)
        //e. insert the specified element at the specified position in the linked list.
        /*System.out.println("enter the index:");
        int index=sc.nextInt();
        System.out.println("enter the element:");
        String element= sc.next();
        link.set(index,element);
        System.out.println(link);*/
        //(----------------------------------------------)
        //f.insert elements into the linked list at the first and last position.
        /*System.out.println("enter the element that you want in first:");
        String first=sc.next();
        System.out.println("enter the element that you want in last:");
        String last= sc.next();
        link.addFirst(first);
        link.addLast(last);
        System.out.println(link);*/
        //(----------------------------------------------)
        //g.insert the specified element at the front of a linked list.
        /*System.out.println("enter the element:");
        link.addFirst(sc.next());
        System.out.println(link);*/
        //(----------------------------------------------)
        //h.insert the specified element at the end of a linked list.
        /*System.out.println("enter the element:");
        link.addLast(sc.next());
        System.out.println(link);*/
        //(----------------------------------------------)
        //i.insert some elements at the specified position into a linked list.
        /*System.out.println("enter the element:");
        String element=sc.next();
        System.out.println("enter the index number:");
        int index=sc.nextInt();
        link.add(index,element);
        System.out.println(link);*/
        //(----------------------------------------------)
        //j.get the first and last occurrence of the specified elements in a linked list.
        System.out.println("enter the element to search:");
        String element=sc.next();
        System.out.println("======first occurrence======");
        System.out.println(link.indexOf(element));
        System.out.println("=====last occurrence=====");
        System.out.println(link.lastIndexOf(element));




    }
}