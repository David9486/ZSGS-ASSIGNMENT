//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp=new Employee(101,"Developer");
        Person per=new Person("David",200000,emp);
        Person per1=(Person) per.clone();//shallow copy
        System.out.println(per.e.designation);
        System.out.println(per1.e.designation);
        per.e.designation="Tester";      //changing value
        System.out.println(per.e.designation);
        System.out.println(per.e.designation);
//this program makes shallow copy

    }
}