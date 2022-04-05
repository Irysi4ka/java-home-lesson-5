package by.automation.qa;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeightCalculatorTest {
    public static ChromeDriver chromeDriver;
    private final static String WEB_URL = "https://svyatoslav.biz/testlab/wt/";

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

    @Test
    public void testInputNameWeightHeightWith50() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(chromeDriver);

        weightCalculatorPage.typeName("Ivan");
        weightCalculatorPage.typeHeight("50");
        weightCalculatorPage.typeWeight("30");
        weightCalculatorPage.selectGender("M");
        weightCalculatorPage.pressButtonSubmit();

        Thread.sleep(5000);
    }
}
