package basicjavapractice1;

public class Constructor1 {

    public Constructor1(int id, String name){

        System.out.println(id);
        System.out.println(name);

    }


    public static void main(String[] args) {
        Constructor1 obj = new Constructor1(50, "xyz");

    }
}
