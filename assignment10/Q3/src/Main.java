import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
      //a.append the specified element to the end of a hash set.
        Set<Integer>s=new LinkedHashSet<>();
        Scanner sc=new Scanner(System.in);
        /*System.out.println("enter how many elements:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter the elements "+i+1+"to add:");
            s.add(sc.nextInt());
        }
        System.out.println(s);*/
        //(----------------------------------------)
        //b. iterate through all elements in a hash list.
        HashSet<Integer>hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        /*Iterator<Integer>it=s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
        //(----------------------------------------)
        //c. get the number of elements in a hash set
        //System.out.println(s.size());
        //(----------------------------------------)
        //d. empty the hash set.
        //s.clear();
        //System.out.println();
        //(----------------------------------------)
        //test a hash set is empty or not.
        /*if (s.isEmpty()) {
            System.out.println("the hashset is empty!");
        }else System.out.println("the hashset is not empty!");*/
        //(----------------------------------------)
        //f. clone a hash set to another hash set.
            HashSet<Integer> s2 = (HashSet<Integer>) hs.clone();
            System.out.println("=====original hashset=====");
            System.out.println(hs);
            System.out.println("=====cloned hashset=====");
            System.out.println(s2);
        //(----------------------------------------)
        //g.convert a hash set to an array.
        //Object[] arr= s.toArray();
        //System.out.println(Arrays.toString(arr));
        //(----------------------------------------)
        //h.convert a hash set to a tree set.
        //TreeSet<Integer>tr=new TreeSet<>(s);
        //System.out.println(tr);
        //(----------------------------------------)
        //i.convert a hash set to a List/ArrayList.
        /*ArrayList<Integer>arr=new ArrayList<>(s);
        System.out.println(arr);*/
        //(----------------------------------------)
        //j. compare two hash set.
        /*HashSet<Integer>s1=new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);
        if(s.containsAll(s1)) {
            System.out.println("both are equal");
        }else System.out.println("they are not equal");*/
    }
}