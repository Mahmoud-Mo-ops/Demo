package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import procedures.CartPageProcedures;
import utils.BrowserUtils;

public class CartPageTest {
    private WebDriver driver;
    private CartPageProcedures cartPageProcedures;

    @BeforeMethod
    public void setUp() {
        driver = BrowserUtils.getDriver();
        driver.get("https://www.saucedemo.com/");
        
        // Assuming you need to log in first
       // LandingPage landingPage = new LandingPage(driver);
       // landingPage.login("standard_user", "secret_sauce");
        
        // Navigate to the cart page
        driver.get("https://www.saucedemo.com/cart.html");
        
      //  cartPageProcedures = new CartPageProcedures(driver);
    }

    @Test
    public void proceedToCheckout() {
        cartPageProcedures.proceedToCheckout();
        // Add assertions to verify the checkout process was initiated
    }
}