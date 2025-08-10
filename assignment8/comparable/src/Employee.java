public class Employee implements Comparable<Employee>{
    String name;
    int empId;

    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    @Override
    public int compareTo(Employee e) {
        return this.empId-e.empId;
    }
    @Override
    public String toString(){
        return name+" "+empId;
    }
}
