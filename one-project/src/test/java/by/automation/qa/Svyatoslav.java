package by.automation.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Svyatoslav extends WebDriverSetting {

    private final String WEB_URL = "https://svyatoslav.biz/testlab/wt/";
    private final String INPUT_NAME_XPATH = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
    private final String INPUT_HEIGHT_XPATH = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
    private final String INPUT_WEIGHT_XPATH = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
    private final String CLICK_RADIO_BUTTON_MAN_XPATH = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
    private final String CLICK_RADIO_BUTTON_WOMEN_XPATH = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[2]";
    private final String CLICK_BUTTON_XPATH = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";

    @Test
    public void testInputNameWeightHeightWith50() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("50");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("30");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputNameWeightHeightWith300() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("300");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("30");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }


    @Test
    public void testInputNameWeightHeightWith150() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("150");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("30");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputNameWeightHeightWith49() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("49");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("30");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputNameWeightHeightWith301() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("301");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("30");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputNameWeightHeightWith0() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("0");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("30");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputNameWeightHeightWithMinus1() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("-1");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("30");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputNameWeightHeightWith10000() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("10000");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("30");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputNameWeightHeightWithEmpty() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("30");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }


    @Test
    public void testInputNameWeightHeightWithSymbol() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("text");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("30");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputNameWeightHeightWithMark() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("!?");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("30");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputNameWeightHeightWithSpace() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys(" "); //one space
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("30");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputNameHeightWeightWith3() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("3");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputNameHeightWeightWith250() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("250");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputNameHeightWeightWith500() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("500");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputNameHeightWeightWith501() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("501");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputNameHeightWeightWith2() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("2");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputNameHeightWeightWith0() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("0");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputNameHeightWeightWithMinus1() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("-1");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputNameHeightWeightWith10000() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("10000");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputNameHeightWeightWithSymbol() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("test");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputNameHeightWeightWithMark() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("-");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputNameHeightWeightWithEmpty() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputNameHeightWeightWithSpace() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys(" "); //one space
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputHeightWeightNameWithString() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputHeightWeightNameWithEmpty() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputHeightWeightNameWithOneSmallLetter() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("a");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputHeightWeightNameWithOneCapitalLetter() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("B");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputHeightWeightNameWithMark() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("(");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputHeightWeightNameWithNumber() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("1");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputHeightWeightNameWithNumber0() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("0");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputHeightWeightNameWithSpace() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys(" "); //one space
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputHeightWeightNameWithTwoWords() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Two words");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testInputHeightWeightNameWithNumberSpaceAndNumber() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys(" 2");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("50");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testClickRadioButtonMan() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Ivan");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("195");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("90");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_MAN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testClickRadioButtonWomen() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Inna");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("55");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_WOMEN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testClickRadioButtonEmpty() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Inna");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("160");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("55");
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testClickButton() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("Anna");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("170");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("60");
        chromeDriver.findElement(By.xpath(CLICK_RADIO_BUTTON_WOMEN_XPATH)).click();
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

    @Test
    public void testClickButtonEmpty() throws InterruptedException {
        chromeDriver.get(WEB_URL);

        chromeDriver.findElement(By.xpath(INPUT_NAME_XPATH)).sendKeys("");
        chromeDriver.findElement(By.xpath(INPUT_HEIGHT_XPATH)).sendKeys("");
        chromeDriver.findElement(By.xpath(INPUT_WEIGHT_XPATH)).sendKeys("");
        chromeDriver.findElement(By.xpath(CLICK_BUTTON_XPATH)).click();

        Thread.sleep(5000);
    }

}
