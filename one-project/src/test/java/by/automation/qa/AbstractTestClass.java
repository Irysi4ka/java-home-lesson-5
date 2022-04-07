package by.automation.qa;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class AbstractTestClass {
    final static String WEB_URL = "https://svyatoslav.biz/testlab/wt/";

    public static ChromeDriver chromeDriver;

    @BeforeTest
    public static void openChrome(){
        chromeDriver = new ChromeDriver();
        System.out.println("Chrome start");
    }

    @AfterTest
    public static void closeDriver(){
        System.out.println("Chrome close");
        chromeDriver.quit();
    }


}
