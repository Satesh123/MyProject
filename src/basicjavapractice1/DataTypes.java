package basicjavapractice1;

public class DataTypes {
 /*
        Data types are divided into two groups:

        Primitive data types - includes byte, short, int, long, float, double, boolean and char
        Non-primitive data types - such as String, Arrays and Classes.

        Primitive number types are divided into two groups:

        Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals.
         Valid types are byte, short, int and long. Which type you should use, depends on the numeric value.

        Floating point types represents numbers with a fractional part, containing one or more decimals.
        There are two types: float and double.

        Even though there are many numeric types in Java, the most used for numbers are int (for whole numbers)
         and double (for floating point numbers).

  */
    public static void main(String[] args){
        char k = 'S'; // Stores a single character/letter or ASCII values
        String s1 = "Satesh Chaudhari";
        byte b1 = 120; //range from -128 to 127
        short b2 = 3243; //range from -32, 768 to 32767
        int b3 = 33434343; // // range from  -2,147,483,648 to 2,147,483,647
        long b4 = 343432423424L; //range from  -9,223,372,036,854,775,808 to    9,223,372,036,854,775,807
        float f1= 12.44f; // range holding 6 to 7 decimal digits
        double d1 = 23434.343d; // range holding 15 decimal digits
        boolean  bb = true; // Store true or false values

        System.out.println("Print the Char value : " + k);
        System.out.println("Print the string value: " + s1);
        System.out.println("Print the value: " + b1);
        System.out.println("Print the short value: " + b2);
        System.out.println("Print the int value: " + b3);
        System.out.println("Print the long value: " + b4);
        System.out.println("Print the float value: " + f1);
        System.out.println("Print the double value: " + d1);
        System.out.println("Print the boolean value: " + bb);

    }
}
