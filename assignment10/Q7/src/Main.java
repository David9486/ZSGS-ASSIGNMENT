import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1.associate the specified value with the specified key in a HashMap
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(1,"red");
        hm.put(2,"green");
        hm.put(3,"yellow");
        hm.put(4,"blue");
        hm.put(5,"black");
        //System.out.println("enter the number of elements:");
        //int num=sc.nextInt();
        /*for(int i=0;i<num;i++){
            System.out.println("enter the key:");
            int key=sc.nextInt();
            System.out.println("enter the value:");
            String value=sc.next();
            hm.put(key,value);
        }*/
        //(-------------------------------------------------)

        //2.count the number of key-value (size) mappings in a map.
        //System.out.println("number of key-value pairs: "+hm.size());
        //(-------------------------------------------------)

        //3.copy all of the mappings from the specified map to another map.
        /*HashMap<Integer,String>hm1=new HashMap<>();
        hm1.putAll(hm);
        System.out.println(hm1);*/
        //(-------------------------------------------------)

        //4.remove all of the mappings from a map.
        //hm.clear();
        //System.out.println("the map after removing all mapping is: "+hm);
        //(-------------------------------------------------)

        //5.check whether a map contains key-value mappings (empty) or not.
        /*System.out.println("enter the key to check in map:");
        int key=sc.nextInt();
        System.out.println("enter the value to check in map:");
        String value=sc.next();
        if(hm.containsKey(key)&&hm.containsValue(value)){
            System.out.println("the given key value pair exist in the map");
        }else System.out.println("the given key value pair doesn't exist in the map");*/
        //(-------------------------------------------------)

        //6.get a shallow copy of a HashMap instance.
        //HashMap<Integer,String>cloneMap=(HashMap<Integer, String>) hm.clone();
        //System.out.println(cloneMap);
        //(-------------------------------------------------)

        //7.test if a map contains a mapping for the specified key.
        /*System.out.println("enter the key to check:");
        int k= sc.nextInt();
        if(hm.containsKey(k)){
            System.out.println("the given key is present in the map");
        }else System.out.println("the given key is not present in the map");*/
        //(-------------------------------------------------)

        //8.test if a map contains a mapping for the specified value.
        /*System.out.println("enter the value to check:");
        String v=sc.next();
        if(hm.containsValue(v)){
            System.out.println("the value is present in the map");
        }else System.out.println("the value is not present in the map");*/
        //(-------------------------------------------------)

        //9.create a set view of the mappings contained in a map.
        //System.out.println("the set view of the map is: "+hm.entrySet());
        //(-------------------------------------------------)

        //10.get the value of a specified key in a map
        System.out.println("enter the key to get the value:");
        int k1= sc.nextInt();
        System.out.println("the value of the key "+k1+" : "+hm.get(k1));



    }
}