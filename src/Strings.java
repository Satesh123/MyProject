/*
    Strings are used for storing text.
    A String variable contains a collection of characters surrounded by double quotes:
 */

public class Strings {

    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args){
        String txt = "ABCDEFGH";
        System.out.println(txt);
        System.out.println("The length of the string is: " + txt.length());
        //the length of a string can be found with the length() method

        Strings obj = new Strings();
        obj.subprog();
        System.out.println(obj.txt);

    }
    public void subprog(){

        String txt1 = "Hello World";
        System.out.println(txt1);
        System.out.println(txt1.toUpperCase()); // Out put "HELLO WORLD"
        System.out.println(txt1.toLowerCase()); //Out put should be "hello world"
    }

}
