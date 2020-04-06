package Inheritance;

public class VirtualDemo {
    public static void main(String[] args) {
        Salary s = new Salary("David ", "London Road ", 101, 10000.00);
        Employee e = new Employee("Smith ", "London Street ", 102);
       // System.out.println("Call mailCheck using Salary reference---");
        s.mailcheck();
      //  System.out.println("\n Call mailCheck using Employee reference--");
        e.mailcheck();
    }
}
