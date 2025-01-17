package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private WebDriver driver;

    private By checkoutButton = By.id("checkout");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public CartPage clickOnCheckoutButton() {
        WebElement button = driver.findElement(checkoutButton);
        button.click();
        return this;
    }
}