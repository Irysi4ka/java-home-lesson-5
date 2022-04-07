package by.automation.qa;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class WeightCalculatorTest extends AbstractTestClass {


    @Test
    public void testInputNameWeightHeightWith50() throws InterruptedException {
        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(chromeDriver);
        chromeDriver.get(WEB_URL);

        weightCalculatorPage
                .typeName("Ivan")
                .typeHeight("50")
                .typeWeight("30")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);

        Assert.assertEquals(weightCalculatorPage.getMESSAGE_RESULT(),"Значительный избыток массы тела, тучность");

    }

    @Test(enabled = false)
    public void testInputNameWeightHeightWith300() throws InterruptedException {
        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(chromeDriver);
        chromeDriver.get(WEB_URL);

        weightCalculatorPage
                .typeName("Ivan")
                .typeHeight("300")
                .typeWeight("30")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void testInputNameWeightHeightWith301() throws InterruptedException {
        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(chromeDriver);
        chromeDriver.get(WEB_URL);

        weightCalculatorPage
                .typeName("Ivan")
                .typeHeight("301")
                .typeWeight("30")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void testInputNameWeightHeightWith0() throws InterruptedException {
        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(chromeDriver);
        chromeDriver.get(WEB_URL);

        weightCalculatorPage
                .typeName("Ivan")
                .typeHeight("0")
                .typeWeight("30")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

    @Test(enabled = false)
    public void testInputNameWeightHeightWithMinus1() throws InterruptedException {
        WeightCalculatorPage weightCalculatorPage = new WeightCalculatorPage(chromeDriver);
        chromeDriver.get(WEB_URL);

        weightCalculatorPage
                .typeName("Ivan")
                .typeHeight("-1")
                .typeWeight("30")
                .selectGender("M")
                .pressButtonSubmit();

        Thread.sleep(5000);
    }

}
