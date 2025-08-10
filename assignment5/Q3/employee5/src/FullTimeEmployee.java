public class FullTimeEmployee extends Employee {
    double baseSalary;
    int deduction;
    double  salary;

    public FullTimeEmployee(double salary, int deduction) {
        this.baseSalary = salary;
        this.deduction = deduction;
    }

    @Override
    public void calculateSalary() {
        super.calculateSalary();
       salary=baseSalary-deduction;
       System.out.println("THE SALARY OF FULL TIME EMPLOYEE IS: "+salary);
    }
}
