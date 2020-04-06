package Junit;

import PageObjectModel.*;
import org.junit.runner.JUnitCore;


public class RunnerClass {

    public static void main(String[] args){

        JUnitCore.runClasses(nopRegistration.class);
    }
}
