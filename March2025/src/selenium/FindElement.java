package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\sellenum very important\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		//Thread.sleep(2000);	
		
		
WebElement Jalert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		Jalert.click();
	//Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
	a.accept();
		
	}

}
