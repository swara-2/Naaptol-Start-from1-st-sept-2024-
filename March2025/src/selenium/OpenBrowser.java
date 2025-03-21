package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
public static WebDriver Browser(String url) {
	System.setProperty("webdriver.chrome.driver","E:\\sellenum very important\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
     driver.get(url);
     driver.manage().window().maximize();
	return driver;
     
    
}
}