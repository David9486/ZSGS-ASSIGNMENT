public class PartTimeEmployee extends Employee{
    int wages;
    int numberOfHours;
    double salary;

    public PartTimeEmployee(int wages, int numberOfHours) {
        this.wages = wages;
        this.numberOfHours = numberOfHours;
    }

    @Override
    public void calculateSalary() {
        salary=wages*numberOfHours*7*4;
        System.out.println("salary for part time employee is: "+salary);
    }
}
