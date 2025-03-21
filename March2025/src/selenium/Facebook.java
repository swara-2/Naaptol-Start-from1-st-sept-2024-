package selenium;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook {
//public static void main(String[]args) throws EncryptedDocumentException, IOException, InterruptedException {
	@Test
	public void fb() throws EncryptedDocumentException, IOException, InterruptedException {
	WebDriver driver=OpenBrowser.Browser("https://www.facebook.com/");
	WebElement create=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
    create.click();
    WebElement name=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
    name.sendKeys(Parametrization.Xcel(0, 0));
    //Thread.sleep(2000);
    
    WebElement surname=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
    surname.sendKeys(Parametrization.Xcel(1,0));
    
   WebElement date= driver.findElement(By.xpath("//select[@name='birthday_day']"));
    Select select=new Select(date);
    select.selectByIndex(20);
    
    WebElement radio1=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
    radio1.click();
}}
