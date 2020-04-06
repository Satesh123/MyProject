package Webelements;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {
    public static void main(String[] args) {

       // JUnitCore.runClasses(FirstTestSuite.class);


        Result result =  JUnitCore.runClasses(FirstTestSuite.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Result == " + result.wasSuccessful());

    }


}
