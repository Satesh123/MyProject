package Inheritance;

public class Salary extends Employee {
    private double salary; // Annual Salary

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);

    }

    @Override
    public void mailcheck() {
        System.out.println("Whithin mailCheck of Salary class");
        System.out.println("Mailing check to " + getName() + "with salary " + salary);

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computrPay() {
        System.out.println("Computing salary pay for " + getName());
        return salary / 52;
    }
}
