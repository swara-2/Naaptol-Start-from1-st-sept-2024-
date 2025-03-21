package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver BrowserMethod(String url) {
		System.setProperty("webDriver.chrome.driver","E:\\sellenum very important\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	   driver.get(url);
	   driver.manage().window().maximize();
	   
	    return driver;
	}

}
