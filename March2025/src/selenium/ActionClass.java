package selenium;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=OpenBrowser.Browser("https://demoqa.com/text-box");
	WebElement text=driver.findElement(By.xpath("(//span[@class='text'])[1]"));
	//WebElement permanat=driver.findElement(By.xpath("(//div[@class='col-md-9 col-sm-12'])[4]"));
	Actions action =new Actions(driver);
//	action.contextClick(text);
//	action.perform();
	WebElement name=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
	name.sendKeys("Swara");
	//Thread.sleep(2000);
	action.keyDown(Keys.CONTROL);
	
	action.sendKeys("a");
	action.keyUp(Keys.CONTROL);
	action.build().perform();
	Thread.sleep(2000);
	
	action.keyDown(Keys.CONTROL);
	action.sendKeys("c");
	action.keyUp(Keys.CONTROL);
	action.build().perform();
	
	action.sendKeys(Keys.TAB);
	action.build().perform();
	
	action.keyDown(Keys.CONTROL);
	action.sendKeys("v");
	action.keyUp(Keys.CONTROL);
	action.build().perform();
	


	}
}
