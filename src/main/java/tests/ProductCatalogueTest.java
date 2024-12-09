package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import procedures.ProductCatalogueProcedures;
import utils.BrowserUtils;

public class ProductCatalogueTest  {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		// invoke edge browser
		driver = BrowserUtils.getDriver();
		// need to creat file proeprt to get this url from it **
		// driver.get(Properties.URL)
		driver.get("https://www.saucedemo.com/");

	}

	ProductCatalogueProcedures productCatalogueProcedures = new ProductCatalogueProcedures();

	 @Test(dependsOnMethods = {"tests.LandingPageTest.testLogin"})
	public void testAddItemsLessThanTenDollarsToCart() {
		 
		productCatalogueProcedures.addItemsLessThanTenDollarsToCart();

	}
}
