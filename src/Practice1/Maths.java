package Practice1;

public class Maths {
  //Variables
    double i;
    double j;
    double k;

    // Methods

    public void add(double i, double j){
        k = i+j;
     }
     public void subtract(double i, double j){
        k = i-j;
     }
     public void multiply(double i, double j){
        k = i*j;
    }
    public void divide(double i, double j){
        k = i/j;
    }
    public void modular(double i, double j){
        k = i % j;
    }
    public void sroot(double i){
        k = Math.sqrt(i);
    }
     public void hello(String name, String msg){
        System.out.println("Hello, My name is  "+ name + " and I am learning " + msg);
     }
     public static void main(String[] args){

        Maths m = new Maths();
        m.hello("Satish", "Java");

        m.add(400, 200);
        System.out.println(m.k);

        m.subtract(400, 200);
        System.out.println(m.k);

        m.multiply(400, 200);
        System.out.println(m.k);

        m.divide(400, 200);
        System.out.println(m.k);

        m.modular(10, 200);
        System.out.println(m.k);

        m.sroot(81);
        System.out.println(m.k);
     }
}
