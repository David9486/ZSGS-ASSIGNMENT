public class FullTimeEmployee implements Employee{
    double amount;
    int deductionAmount;
    double salary;

    public FullTimeEmployee(double amount, int deductionAmount) {
        this.amount = amount;
        this.deductionAmount = deductionAmount;
    }

    @Override
    public void calculateSalary() {
        if(deductionAmount<amount) {
            salary = amount - deductionAmount;
            System.out.println("salary for full time employee is: " + salary);
        }
        else{
            System.out.println("enter the correct deduction amount");
        }
    }
}
