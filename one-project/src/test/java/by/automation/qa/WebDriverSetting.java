package by.automation.qa;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSetting {
    public static ChromeDriver chromeDriver;

    @BeforeAll
    public static void openChrome(){
        chromeDriver = new ChromeDriver();
        System.out.println("Chrome start");
    }

    @AfterAll
    public static void closeDriver(){
        System.out.println("Chrome close");
        chromeDriver.quit();
    }

}
