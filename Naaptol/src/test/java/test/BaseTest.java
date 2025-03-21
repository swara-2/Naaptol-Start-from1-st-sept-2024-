package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pom.NaaptolHomePage;

public class BaseTest {
	public static WebDriver driver;
	public NaaptolHomePage naaptolhomepage;
	public ExtentReports reports;
	public ExtentTest test;



public void SwitchToChildBrowser() {
	Set<String>handles=driver.getWindowHandles();
   	Iterator<String> i=handles.iterator();
		//driver.switchTo().window(i.next());
		//driver.switchTo().window(i.next());
		/*while(i.hasNext()) {
			driver.switchTo.window(i.next());
		}*/
}
}