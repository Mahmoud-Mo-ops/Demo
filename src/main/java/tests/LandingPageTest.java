package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import data.LandingPageData;
import procedures.LandingPageProcedures;
import utils.BrowserUtils;

public class LandingPageTest {
	
     WebDriver driver;
     LandingPageData data=new LandingPageData();


    @BeforeMethod
    public void setUp() {
    	//invoke edge browser
        driver = BrowserUtils.getDriver();
        //need to creat file proeprt to get this url from it ** driver.get(Properties.URL)
        driver.get("https://www.saucedemo.com/");

    }

    //LOG IN 
    @Test
    
    public void testLogin() {
    	LandingPageProcedures.LandingPageLogin(data, driver);
        //Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"));
    }

}