public class Operators {
    /*
    Java divides the operators into the following groups:
    Arithmetic operators : +, -, *, /, %, ++(Increment), --(Decrement)]
    Assignment operators : =, +=, -=, *=, /=, %=, &=, |=, ^=, >>=, <<=
    Comparison operators : ==, !=, >, <, >=, <=
    Logical operators : && 	Logical and	Returns true if both statements are true
                        || 	Logical or	Returns true if one of the statements is true
                        !	Logical not	Reverse the result, returns false if the result is true
    Bitwise operators

     */

    public static void main(String[] args) {
        int num1 = 200;
        int num2 = 100;
        int num3;

        num3 = num1 + num2;
        System.out.println("Print addition of two number " + num3);

        num3 = num1 - num2;
        System.out.println("Print subtraction of two number " + num3);

        System.out.println("Print Multiplication of two number " + (num1 * num3));
        System.out.println("Print Division of two number " + (num1 / num3));
        System.out.println("Print Modulo operator returns remainder of two number " + (num1 % num3));

        //Assignment Operators  =, +=, -=, *=, /=, %=

        num2 = num1;
        System.out.println("Assigning the value to other variables " + num2);

        num2 += num1;
        System.out.println("num2 = num2 + num1 : "+ num2);

        num2 -= num1;
        System.out.println("num2 = num2 - num1: "+ num2);

        num2 *= num1;
        System.out.println("num2 = num2 * num1: "+ num2);

        num2 /= num1;
        System.out.println("num2 = num2 / num1: "+num2);

        num2 %= num1;
        System.out.println("num2 = num2 % num1: "+num2);

        //Auto Increment and decrement  ++ , -- ( Mainly used in the loop conditions)
        //num2 = 100;

        num1++;
        num2--;

        System.out.println("num1++: " + num1);
        System.out.println("num2-- : " + num2);

        //Logical operators

        boolean boo;
        int a = 50;
        int b = 10;
        int c = 60;


        boo = a > b  && a > c;    //Logical and	Returns true if both statements are true
        System.out.println(boo);

        boo = a > b || a > c;   // 	Logical or	Returns true if one of the statements is true
        System.out.println(boo);

        boo = !(a > b || a > c); //Logical not	Reverse the result, returns false if the result is true
        System.out.println(boo);


    }
}
