package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductCataloguePage {
	private WebDriver driver;

	private By productNames = By.className("inventory_item_description");
	private By productPrices = By.className("inventory_item_price");
	private By addToCartButtons = By.className("btn_inventory");
	private By goToShoppingCartButton = By.className("shopping_cart_link");

	public ProductCataloguePage(WebDriver driver) {
		this.driver = driver;
	}

	public List<WebElement> getProductNames() {
		return driver.findElements(productNames);
	}

	public List<WebElement> getProductPrices() {
		return driver.findElements(productPrices);
	}

	public List<WebElement> getAddToCartButtons() {
		return driver.findElements(addToCartButtons);
	}

	public void addItemToCart(WebElement addToCartButton) {
		addToCartButton.click();
	}

	public void goToCart(WebElement goToShoppingCartButton) {
		goToShoppingCartButton.click();
	}
}