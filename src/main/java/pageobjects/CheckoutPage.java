package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	private WebDriver driver;

	private By firstNameTextField = By.xpath("//input[@placeholder='First Name']");
	private By lastNameTextField = By.xpath("//input[@placeholder='Last Name']");
	private By postalCodeTextField = By.id("postal-code");
	private By continueButton = By.id("continue");
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	public CheckoutPage sendfirstNameTextField(String firstNameText) {

		driver.findElement(firstNameTextField).sendKeys(firstNameText);
		return this;
	}

	public CheckoutPage sendlastNameTextField(String lastNameText) {
		driver.findElement(lastNameTextField).sendKeys(lastNameText);
		return this;
	}

	public CheckoutPage sendpostalCodeTextField(String postalCodeText) {
		driver.findElement(postalCodeTextField).sendKeys(postalCodeText);
		return this;
	}

	public CheckoutPage clickOnConinueButton(WebElement continueButton) {
		continueButton.click();
		return this;
	}

}
