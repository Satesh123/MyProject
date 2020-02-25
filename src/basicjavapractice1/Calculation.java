package basicjavapractice1;

public class Calculation {

    int a = 25;
    int b = 30;
    int c;
    public void sum(){
        c = a+b;
        System.out.println(c);
    }
    public void subtract(){
        c = a - b;
        int d = 10;
        System.out.println(c+d);
    }
    public static void main(String[] args){
        Calculation cal = new Calculation();
        cal.sum();
        cal.subtract();
    }
            }
