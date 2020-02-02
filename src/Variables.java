

/*
          In Java, there are different types of variables, for example:

        String - stores text, such as "Hello". String values are surrounded by double quotes
        int - stores integers (whole numbers), without decimals, such as 123 or -123
        float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        boolean - stores values with two states: true or false

 */

    // Variables example with Local, Instance and Static.
public class Variables {
    int abc = 123; //public variables
    public static void main(String[] args) {
        int abc = 456;   //Local variables.
        System.out.println(abc);
        Variables obj = new Variables();
        obj.subprog();
        System.out.println(obj.abc);
    }
    public void subprog(){

        Variables obj2 = new Variables();
        System.out.println(obj2.abc);
    }

}
