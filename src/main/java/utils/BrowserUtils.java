package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserUtils {
    public static WebDriver getDriver() {
        return new EdgeDriver();
    }
    
    
}