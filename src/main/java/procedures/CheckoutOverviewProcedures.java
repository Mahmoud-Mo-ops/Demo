package procedures;

import org.openqa.selenium.WebDriver;

import pageobjects.CheckoutOverviewPage;

public class CheckoutOverviewProcedures {
	private static WebDriver driver;

	public static void gotToCompletePage() {
		CheckoutOverviewPage checkoutOverview = new CheckoutOverviewPage(driver);
		checkoutOverview.ClickOnfindFinishButton(null);
	}

}
