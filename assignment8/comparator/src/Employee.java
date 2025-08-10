public class Employee {
    String name;
    int salary;
    int empId;
    public Employee(String name, int salary, int empId) {
        this.name = name;
        this.salary = salary;
        this.empId = empId;
    }

    @Override
    public String toString() {
        return name+" "+salary+" ";
    }
}
