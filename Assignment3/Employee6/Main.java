//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee("DAVID FINCHER","2001",20000,"CHENNAI");
        Employee emp2=new Employee("CHRISTOPER NOLAN","2000",25000,"USA");
        Employee emp3=new Employee("VINCE GILLIGAN","2001",20000,"CHENNAI");
        Employee.display(emp1,emp2,emp3);
    }
}