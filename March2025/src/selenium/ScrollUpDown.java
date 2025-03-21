package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollUpDown {
   public static void main(String[]args) throws InterruptedException {
  	WebDriver driver=OpenBrowser.Browser("https://www.naukri.com");
    WebElement MNC=driver.findElement(By.xpath("//span[@title='MNC']"));
    WebElement scroll=driver.findElement(By.xpath("//span[@title='Project Mgmt']"));
  //((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",MNC);
    Thread.sleep(3000);
  MNC.click();
   }

}
