package procedures;

import org.openqa.selenium.WebDriver;
import pageobjects.CartPage;

public class CartPageProcedures {
    private CartPage cartPage;

    public CartPageProcedures(WebDriver driver) {
        this.cartPage = new CartPage(driver);
    }

    public void proceedToCheckout() {
        cartPage.clickOnCheckoutButton();
    }
}