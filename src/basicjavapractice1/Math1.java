package basicjavapractice1;

public class Math1 {

    int a = 100;
    int b = 200;
    int c;

    public void add(){
        c = a + b;
        System.out.println(c);
    }
    public void subtract(){
        c = a - b;
        System.out.println(c);
    }
    public void multiply(){
        c = a * b;
        System.out.println(c);
    }
    public void davide(){
        c = a / b;
        System.out.println(c);
    }
    public void modular(){
        c = a % b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Math1 obj = new Math1();
        obj.add();
        obj.subtract();
        obj.multiply();
        obj.davide();
        obj.modular();
    }

}
