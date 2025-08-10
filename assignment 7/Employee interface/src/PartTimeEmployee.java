public class PartTimeEmployee implements Employee{
    int wages;
    int numberOfHours;
    double partSalary;

    public PartTimeEmployee(int wages, int numberOfHours) {
        this.wages = wages;
        this.numberOfHours = numberOfHours;
    }

    @Override
    public void calculateSalary() {
        partSalary=wages*numberOfHours*7*4;
        System.out.println("salary for part time employee is: "+partSalary);
    }
}
