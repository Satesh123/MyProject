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

        int totalnum = 0;
        int sum = 0;
        for (int val : numbers) {
            totalnum = numbers.length;
            sum += val;

        }
        System.out.println("Avg is: " + sum / totalnum);
        System.out.println(totalnum);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        PassingArraysToMethods newList = new PassingArraysToMethods();
        newList.myList(new int[]{2, 5, 7, 10, 15, 20, 26});
        newList.avgList(new int[]{25, 35, 39, 40, 48, 58});
    }
}
