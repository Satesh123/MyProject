package Webelements;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class totalTestCase extends TestCase {
    protected double fval1;
    protected double fval2;


    @Before
    public void setUp(){
        fval1 = 2.0;
        fval2 = 3.0;

    }

    @Test
    public void testAdd(){
        System.out.println("No of Test Case = " + this.countTestCases());

        String testName = this.getName();
        System.out.println("Test Case Name = " + testName);

    }
    public void tearDown(){}

}
