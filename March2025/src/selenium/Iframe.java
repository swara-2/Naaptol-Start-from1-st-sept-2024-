package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Iframe {
	public static void main (String[]args) {
		WebDriver driver=OpenBrowser.Browser("http://demo.automationtesting.in/Frames.html");
	//driver.switchTo().frame("singleframe");//by id
	//driver.switchTo().frame(1);//by index
//		WebElement iframe=driver.findElement(By.xpath("//iframe[@name=\"SingleFrame\"]"));//by webelement
//	driver.switchTo().frame(iframe);
//		WebElement input=driver.findElement(By.xpath("//input[@type='text']"));
//	input.sendKeys("swara");
//	}
	
	//second iframe
	driver.findElement(By.xpath("(//a[@class='analystic'])[2]" )).click();
     WebElement outer=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
     driver.switchTo().frame(outer);
     
     WebElement inner=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
     driver.switchTo().frame(inner);
     
     driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("swara");
	}}
