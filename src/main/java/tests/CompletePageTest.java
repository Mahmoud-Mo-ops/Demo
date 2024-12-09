package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BrowserUtils;
import procedures.CompletePageProcedures;

public class CompletePageTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = BrowserUtils.getDriver();
        driver.get("https://www.saucedemo.com/checkout-complete.html");
    }

    @Test
    public void verifiedConfirmationText() {
        String confirmationText = CompletePageProcedures.extractConfirmationText(driver);
        Assert.assertEquals(confirmationText, "Thank you for your order!");
    }
}