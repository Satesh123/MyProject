package basicjavapractice1;

public class Maths {
  //Variables
    int i;
    int j;
    int k;

    // Methods

    public void add(int i, int j){
        k = i+j;
     }
     public void subtract(int i, int j){
        k = i-j;
     }
     public void multiply(int i, int j){
        k = i*j;
    }
    public void divide(int i, int j){
        k = i/j;
    }
    public void modular(int i, int j){
        k = i % j;
    }
    public void sroot(double i){ k = (int) Math.sqrt(i);
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
