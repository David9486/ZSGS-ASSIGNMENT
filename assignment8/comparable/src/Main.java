import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee>emp=new ArrayList<>();
        emp.add(new Employee("David",1005));
        emp.add(new Employee("Danny",1001));
        emp.add(new Employee("Kevin",1003));
        emp.add(new Employee("Max",1002));
        Collections.sort(emp);
        System.out.println(emp);
    }
}