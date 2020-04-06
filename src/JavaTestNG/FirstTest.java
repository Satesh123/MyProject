package JavaTestNG;

import org.junit.Test;
import org.junit.jupiter.api.Order;


public class FirstTest {

   @Test
     public void myAsetup(){
        System.out.println("Opening Browser");
    }

    @Test
   public void myBlogin(){
        System.out.println("Login Test");
    }

    @Test
    public void myCteardown(){
        System.out.println("Closeing a Browser");
    }
}
