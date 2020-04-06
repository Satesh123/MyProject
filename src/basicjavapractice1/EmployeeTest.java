package basicjavapractice1;

public class EmployeeTest {


    public static void main(String[] args) {
    //using Employee class method.
        Employee empOne = new Employee("John");
        empOne.setAge(35);
        empOne.setDesignation("Manager");
        empOne.setSalary(1500);

        Employee empTwo = new Employee("David");
        empTwo.setAge(28);
        empTwo.setDesignation("Developer");
        empTwo.setSalary(1200);

        Employee empThree = new Employee("Smith");
        empThree.setAge(32);
        empThree.setDesignation("QA");
        empThree.setSalary(1000);

        Employee empFour = new Employee("Max");
        empFour.setAge(26);
        empFour.setDesignation("Marketing");
        empFour.setSalary(1250);


    }
}
