import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* 3. Design a class`Employee with private data members: employee ID, name, designation, department,
        and monthly salary. Use proper getter and setter methods to access and update these fields.
        Add a method to calculate and return the annual salary of the employee.*/
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter Employee ID: ");
        emp.setEmpId(sc.nextInt());
        sc.nextLine(); // Consume newline

        System.out.print("Enter Name: ");
        emp.setEmpName(sc.nextLine());

        System.out.print("Enter Designation: ");
        emp.setDesignation(sc.nextLine());

        System.out.print("Enter Department: ");
        emp.setDepartment(sc.nextLine());

        System.out.print("Enter Monthly Salary: ");
        emp.setSalary(sc.nextDouble());

        System.out.println("------ Employee Details ------");
        emp.empDetails();


    }
}