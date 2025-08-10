import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //a.to create a new array list, add some colours (string) and print out the collection.
        ArrayList<String>arr=new ArrayList<>();
        arr.add("blue");
        arr.add("red");
        arr.add("green");
        arr.add("yellow");
        //System.out.println(arr);
        //(-------------------------------------)
        //b. to iterate through all elements in an array list.
        /*Iterator<String>it=arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
        //(-------------------------------------)
        //c. to insert an element into the array list at the first position.
        /*System.out.println("enter the element you want to insert:");
        arr.add(0,sc.next());
        System.out.println(arr);*/
        //(-------------------------------------)
        //d. to retrieve an element (at a specified index) from a given array list.
       /* System.out.println("enter the index number: ");
        System.out.println(arr.get(sc.nextInt()));*/
        //(-------------------------------------)
        //e. to update specific array element by given element.
        /*System.out.println("enter the index:");
        int index=sc.nextInt();
        System.out.println("enter the element:");
        String element= sc.next();
        arr.set(index, element);
        System.out.println(arr);*/
        //(-------------------------------------)
        //f.to remove the third element from an array list.
        /*arr.remove(3);
        System.out.println(arr);*/
        //(-------------------------------------)
        //g. to search an element in an array list.
        /*System.out.println("enter the element to search:");
        if(arr.contains(sc.next())){
            System.out.println("the element is present in the list");
        }else System.out.println("the element is not present");*/
        //(-------------------------------------)
        //h. to sort a given array list
        /*Collections.sort(arr);
        System.out.println(arr);*/
        //(-------------------------------------)
        //i. to copy one array list into another.
        /*ArrayList<String>arr1=new ArrayList<>();
        arr1.addAll(arr);
        System.out.println(arr1);*/
        //(-------------------------------------)
        //j. to shuffle elements in an array list.
        Collections.shuffle(arr);
        System.out.println(arr);
    }
}