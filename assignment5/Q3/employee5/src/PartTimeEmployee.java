public class PartTimeEmployee extends Employee{
    int wages;
    int numbersOfHours;
    double salary;

    public PartTimeEmployee(int wages, int numbersOfHours) {
        this.wages = wages;
        this.numbersOfHours = numbersOfHours;
    }

    @Override
    public void calculateSalary() {
        super.calculateSalary();
        salary=wages*numbersOfHours*7*4;
        System.out.println("THE SALARY OF PART TIME EMPLOYEE IS: "+salary);
    }
}
