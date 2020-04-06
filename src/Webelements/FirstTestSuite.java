package Webelements;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;

@RunWith(Suite.class)
@Suite.SuiteClasses({SearchBox.class,AlertHandel.class, Dropdown.class, TextLabels.class,
        DoubleClickTest.class, dragAnddropTest.class, totalTestCase.class})
public class FirstTestSuite {}
