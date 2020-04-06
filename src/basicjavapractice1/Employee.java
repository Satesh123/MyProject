package basicjavapractice1;

public class Employee {
 //instance variable
    String Name;
    String Designation;
    int Salary;
    int Age;
//creating method for using EmployeeTest class.
    public Employee(String Name){
        this.Name = Name;
        System.out.println("Name: " + Name);
    }
    public void setDesignation(String empDesignation){
        Designation = empDesignation;
        System.out.println("Designation: " + Designation);
    }
    public void setSalary(int empSalary){
        Salary = empSalary;
        System.out.println("Salary: " + Salary);
    }
    public void setAge(int empAge){
        Age = empAge;
        System.out.println("Age: " + Age);
    }


}
