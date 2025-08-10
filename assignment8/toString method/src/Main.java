import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student stud =new Student("David",1001,"CSE");
        System.out.println(stud); //automatically calls toString method
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr)); //tostring method to print array of elements directly
    }
}