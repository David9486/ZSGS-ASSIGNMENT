public class Employee {
    private int empId;
    private String empName;
    private String designation;
    private String department;
    private double salary;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public double getAnnualSalary(){
        return salary*12;
    }
    public void empDetails(){
        System.out.println("EMPLOYEE ID: "+empId);
        System.out.println("EMPLOYEE NAME: "+empName);
        System.out.println("EMPLOYEE DESIGNATION: "+designation);
        System.out.println("EMPLOYEE DEPARTMENT: "+department);
        System.out.println("EMPLOYEE MONTHLY SALARY: "+salary);
        System.out.println("EMPLOYEE YEARLY SALARY: "+getAnnualSalary());
    }
}
