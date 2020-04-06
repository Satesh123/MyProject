package basicjavapractice1;

public class Array {

    public static void main(String[] args) {

        int[] rolNum = {2, 3, 5, 8, 9, 15, 17, 21};


        for (int val : rolNum){ // using enhanced for loop.
            System.out.println(val);
        }
        int sum = 0;
        for (int val : rolNum){
            sum += val;
        }
        System.out.println("Total: " + sum);

    }
}
