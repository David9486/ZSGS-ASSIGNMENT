import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
        Scanner sc=new Scanner(System.in);
        PriorityQueue<String>pq=new PriorityQueue<>();
        pq.add("red");
        pq.add("blue");
        pq.add("green");
        pq.add("yellow");
        //System.out.println(pq);
        /*System.out.println("enter the number of elements to add");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.println("enter the colors:");
            pq.add(sc.next());
        }*/
        //(--------------------------------------------------)

        //2. iterate through all elements in priority queue.
        /*Iterator<String> it=pq.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }*/
        //(--------------------------------------------------)

        //3.add all the elements of a priority queue to another priority queue.
        /*PriorityQueue<String> pq1=new PriorityQueue<>(pq);
        System.out.println("the new priority queue: "+pq1);*/
        //(--------------------------------------------------)

        //4.insert a given element into a priority queue.
        /*System.out.println("enter the element to insert into the queue:");
        String ele=sc.next();
        pq.offer(ele);
        System.out.println("the queue after insertion is: "+pq);*/
        //(--------------------------------------------------)

        //5.remove all the elements from a priority queue.
        /*pq.clear();
        System.out.println("the queue after deletion is: "+pq);*/
        //(--------------------------------------------------)

        //6.count the number of elements in a priority queue.
        //System.out.println("the number of elements in the queue is: "+pq.size());
        //(--------------------------------------------------)

        //7.compare two priority queues.
        /*PriorityQueue<String>pq2=new PriorityQueue<>();
        pq2.add("red");
        pq2.add("blue");
        pq2.add("green");
        pq2.add("yellow");
        //System.out.println(pq2);
        ArrayList<String>arr=new ArrayList<>(pq);
        ArrayList<String>arr1=new ArrayList<>(pq2);
        if(arr.equals(arr1)){
            System.out.println("both the queues are equal");
        }else System.out.println("the both the queues are not equal");*/
        //(--------------------------------------------------)

        //8.retrieve the first element of the priority queue.
        //System.out.println("the first element of the queue is: "+pq.peek());
        //(--------------------------------------------------)

        //9. retrieve and remove the first element.
        //System.out.println("the element that's removed: "+pq.poll());
        //System.out.println("the queue after poll operation is: "+pq);
        //(--------------------------------------------------)

        //10.convert a priority queue to an array containing all of the elements of the queue
        Object[] arr=pq.toArray();
        System.out.println("the converted array from priorty Queue is: "+Arrays.toString(arr));

    }
}