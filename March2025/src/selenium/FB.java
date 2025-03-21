package selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FB {
	public static WebDriver driver;
	@Test
	public void create() {
		 driver=OpenBrowser.Browser("https://www.facebook.com");
	TestNgSwagLab test= new TestNgSwagLab(driver);
	test.fbLogin();

}}
