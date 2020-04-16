package basicjavapractice1;

public class PassingArraysToMethods {


    public void myList(int[] numbers) {
        int sum = 0;
        for (int val : numbers) {
            sum += val;
        }
        System.out.println("Total: " + sum);
    }

    public void avgList(int[] numbers) {

        int num = 0;
        int sum = 0;
        for (int val : numbers) {
            num = numbers.length;
            sum += val;

        }
        System.out.println("Avg is: " + sum / num);
        System.out.println(num);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        PassingArraysToMethods newList = new PassingArraysToMethods();
        newList.myList(new int[]{2, 5, 7, 10, 15, 20, 26});
        newList.avgList(new int[]{25, 35, 39, 40, 48, 58});
    }
}
