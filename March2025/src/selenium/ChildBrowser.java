package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowser {
	public static void main(String[]args) throws InterruptedException {
	WebDriver driver=OpenBrowser.Browser("https://www.naaptol.com");
	Thread.sleep(2000);
	WebElement search=driver.findElement(By.xpath("//input[@id='header_search_text']"));
	search.click();
	search.sendKeys("toys");
	
	WebElement ck=driver.findElement(By.xpath("(//div[@class='search'])[2]"));
	Thread.sleep(2000);
	ck.click();
	driver.findElement(By.xpath("//div[@id='productItem1']")).click();
	    //System.out.print(driver.getWindowHandle());//main page id
	
       Set<String>handles=driver.getWindowHandles();
      // System.out.print(handles);
       Iterator<String>i=handles.iterator();
//       System.out.print(i.next());// to checks IDS but not switch so current page   
//        System.out.print(driver.getTitle());//
       while(i.hasNext()) {
          String s=i.next();
	  driver.switchTo().window(s);
	  String title=driver.getTitle();
	  System.out.print(title);
		}
		


}}
