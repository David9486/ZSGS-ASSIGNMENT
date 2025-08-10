import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //a. create a new tree set, add some colours (string) and print out the tree set.
        TreeSet<String>tr=new TreeSet<>();
        Scanner sc=new Scanner(System.in);
        tr.add("blue");
        tr.add("red");
        tr.add("green");
        tr.add("yellow");
        /*System.out.println("enter the number of elements to add:");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.println("add the colors");
            tr.add(sc.next());
        }*/
        //System.out.println(tr);
        //(--------------------------------------------------)
        //b. iterate through all elements in a tree set.
        /*Iterator<String> it=tr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
        //(--------------------------------------------------)
        //c. add all the elements of a specified tree set to another tree set.
        /*TreeSet<String>tr1=new TreeSet<>(tr);
        System.out.println(tr1);*/
        //(--------------------------------------------------)
        //d.create a reverse order view of the elements contained in a given tree set.
        //System.out.println(tr.descendingSet());
        //(--------------------------------------------------)
        //e. get the first and last elements in a tree set.
        /*System.out.println("the first element is: "+tr.first());
        System.out.println("the last element is: "+tr.last());*/
        //(--------------------------------------------------)
        //f. clone a tree set list to another tree set.
        /*TreeSet<String>tr1=(TreeSet<String>) tr.clone();
        System.out.println("the original treeset: "+tr);
        System.out.println("the cloned treeset: "+tr1);*/
        //(--------------------------------------------------)
        //g. get the number of elements in a tree set.
            //System.out.println(tr.size());
        //(--------------------------------------------------)
        //h.compare two tree sets.
        //Create a TreeSet that stores a set of numbers,
        /*TreeSet<String> tr1=new TreeSet<>();
        System.out.println("enter the number of elements to add:");
        int num=sc.nextInt();
        for(int i=0;i<num;i++) {
            System.out.println("add the colors");
            tr.add(sc.next());
        }
        if(tr.equals(tr1)){
            System.out.println("both the treeset are equal");
        }else System.out.println("both the treeset are not equal");*/
        //(--------------------------------------------------)
        //i. find the numbers less than 7 in a tree set.
        TreeSet<Integer>tree=new TreeSet<>();
        tree.add(1);
        tree.add(2);
        tree.add(8);
        tree.add(5);
       //System.out.println("the numbers less than 7 are: "+tree.headSet(7));*/
        //(--------------------------------------------------)
        //j. get the element in a tree set which is greater than or equal to the given element
        //System.out.println("enter the element to compare with the tree set:");
        //int compareNumber=sc.nextInt();
        //System.out.println("the number that is greater than or equal to "+compareNumber+" are: "+tree.ceiling(compareNumber));
        //(--------------------------------------------------)
        //k. get the element in a tree set which is less than or equal to the given element.
        //System.out.println("the number that is less than or equal to "+compareNumber+" are: "+tree.floor(compareNumber));
        //(--------------------------------------------------)
        //l.get the element in a tree set which is strictly greater than or equal to the given element.
        /*System.out.println("enter the number:");
        int check=sc.nextInt();
        System.out.println("the number that is greater than or equal to "+check+" are: "+tree.ceiling(check));
        //(--------------------------------------------------)
        //m. get an element in a tree set which is strictly less than the given element.
        System.out.println("the number that is less than or equal to "+check+" are: "+tree.floor(check));*/
        //(--------------------------------------------------)
        //n.retrieve and remove the first element of a tree set.
        /*System.out.println("removed and returned: "+tree.pollFirst());
        System.out.println("the treeSet after pollFirst() operation: "+tree);*/
        //(--------------------------------------------------)
        //o. retrieve and remove the last element of a tree set.
        /*System.out.println("removed last element and returned: "+tree.pollLast());
        System.out.println("the treeSet after pollFirst() operation: "+tree);*/
        //(--------------------------------------------------)
        //p.remove a given element from a tree set.
        System.out.println("enter the element you want to remove:");
        tr.remove(sc.next());
        System.out.println("the treeSet after removing the element is: "+tr);




    }
}