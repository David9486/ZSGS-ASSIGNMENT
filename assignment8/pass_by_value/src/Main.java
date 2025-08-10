//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void changeInt(int a){
        a=10;
    }
    public static void stringChange(String b){
        b="hello java!";
    }
    public static void changeArray(int[] arr){
        arr[0]=3;
    }
    public static void main(String[] args) {
        int a=5;
        int[] arr={1,4,3};
        String b="hello python!";//value String doesn't change
        stringChange(b);
        System.out.println(b);
        changeInt(a);
        System.out.println(a); //value integer doesn't change
        changeArray(arr);
        System.out.println(arr[0]); //value of first element changed
    }
}