import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1. associate the specified value with the specified key in a Tree Map.
        Scanner sc=new Scanner(System.in);
        //System.out.println("enter the number of elements to store:");
        //int num=sc.nextInt();
        TreeMap<Integer,String>th=new TreeMap<>();
        th.put(1,"red");
        th.put(2,"green");
        th.put(3,"yellow");
        th.put(4,"blue");
        th.put(5,"black");
        /*for(int i=0;i<num;i++){
            System.out.println("enter the key:");
            int key=sc.nextInt();
            System.out.println("enter the value:");
            String value=sc.next();
            th.put(key,value);
        }*/
        System.out.println(th);

        //(-----------------------------------------------)

        //2.copy a Tree Map content to another Tree Map.
        /*TreeMap<Integer,String>th1=new TreeMap<>();
        th1.putAll(th);
        System.out.println("the copy of another map: "+th1);*/
        //(-----------------------------------------------)

        //3.search a key in a Tree Map.
        /*System.out.println("enter the key to search in map:");
        int k=sc.nextInt();
        if(th.containsKey(k)){
            System.out.println("the key "+k+" is present in the map");
        }else System.out.println("the key "+k+" is not present in the map");*/
        //(-----------------------------------------------)

        //4.search a value in a Tree Map.
        /*System.out.println("enter the value to search in map:");
        String v=sc.next();
        if(th.containsValue(v)){
            System.out.println("the value "+v+" is present in the map");
        }else System.out.println("the value "+v+" is not present in the map");*/
        //(-----------------------------------------------)

        //5. get all keys from the given a Tree Map.
        //System.out.println("the key from the map are: "+th.keySet());
        //(-----------------------------------------------)

        //6.delete all elements from a given Tree Map
        /*th.clear();
        System.out.println("the map after deletion is: "+th);*/
        //(-----------------------------------------------)

        //7. sort keys in Tree Map by using comparator.
        /*Comparator<Integer>com=new Comparator<Integer>(){
            public int compare(Integer i1,Integer i2){
                return i2-i1;
            }
        };
        List<Integer>arr=new ArrayList<>(th.keySet());
        Collections.sort(arr,com);
        System.out.println(arr);*/
        //(-----------------------------------------------)

        //8.get a key-value mapping associated with the greatest key and the least key in a map.
        /*int high=th.lastKey();
        int low=th.firstKey();
        System.out.println("the greatest key "+high+" and its value: "+th.get(high));
        System.out.println("the lowest key"+low+" and its value: "+th.get(low));*/
        //(-----------------------------------------------)

        //9.get the first (lowest) key and the last (highest) key currently in a map.
        //System.out.println("the greatest key is: "+th.lastKey());
        //System.out.println("the lowest key is: "+th.firstKey());
        //(-----------------------------------------------)

        //10.get a reverse order view of the keys contained in a given map.
        //System.out.println("reverse order of keys is: "+th.descendingKeySet());




    }
}