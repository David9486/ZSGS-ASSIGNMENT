import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee>emp=new ArrayList<>();
        emp.add(new Employee("DAVID",10000,1001));
        emp.add(new Employee("BRAD PITT",20000,1002));
        emp.add(new Employee("BEN AFFLECK",15000,1003));
        emp.add(new Employee("CHRIS EVANS",2000,1004));
        Collections.sort(emp,new EmpSort());
        /*for(Employee emps:emp){
            System.out.println(emp);
        }*/
        System.out.println(emp);



    }
}