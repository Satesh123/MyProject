package basicjavapractice1;/*
    Finding a Character in a String
    The indexOf() method returns the index (the position) of the first occurrence of a specified text
    in a string (including whitespace):
 */


public class StringIndex {

    public static void main(String[] args){
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));
    }
}
