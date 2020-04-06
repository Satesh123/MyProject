package basicjavapractice1;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] myNum = {2, 5, 7, 9, 12, 15, 18, 6, 1, 10, 35, 25};

       for(int val : myNum){
           System.out.println(val + " ");
       }
       int sum = 0;
       for(int val : myNum){
           sum += val;
       }
       System.out.println("Total: " + sum);

       int max = myNum[0];
       for(int val : myNum){
           if(val > max) max = val;
       }
       System.out.println("Max number is: " + max);

       int min = myNum[0];
       for(int val : myNum){
           if(val < min) min = val;
       }
       System.out.println("Small number is: " + min);




    }

}



