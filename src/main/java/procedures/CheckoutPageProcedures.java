package procedures;

import org.openqa.selenium.WebDriver;

import data.CheckoutPageData;
import pageobjects.CheckoutPage;

public class CheckoutPageProcedures {

	
	public  static void fillOutDataUser(CheckoutPageData data,WebDriver driver) {
		CheckoutPage checkoutPage =new CheckoutPage(driver);
		checkoutPage.sendfirstNameTextField(data.getFirstName());
		checkoutPage.sendlastNameTextField(data.getPassword());
		checkoutPage.sendpostalCodeTextField(data.getPostalCode());
		
	}
}
