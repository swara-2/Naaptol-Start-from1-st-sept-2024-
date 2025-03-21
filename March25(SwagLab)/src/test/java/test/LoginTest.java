package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Listeners;
import pojo.Browser;
import pom.LoginPage;

@Listeners(test.Listener.class)
public class LoginTest {
		
	public static WebDriver driver ;
	@AfterMethod
	public void end(){
		driver.close();
	}
	@BeforeMethod
	public void openB() {
	driver=Browser.BrowserMethod("https://www.saucedemo.com/");
	}
	
	@Test
	public void loginOne() {
		LoginPage one=new LoginPage(driver) ;
		one.enterName("standard_user");
		one.enterPassword("secret_sauce");
		one.clickLogin();
    	}
	@Test
	public void loginTwo() {
		LoginPage two=new LoginPage(driver) ;
		two.enterName("locked_out_user");
		two.enterPassword("secret_sauce");
		two.clickLogin();
    	}
	@Test
	public void loginThree() {
		
		LoginPage three=new LoginPage(driver) ;
		three.enterName("problem_user");
		three.enterPassword("secret_sauce");
		three.clickLogin();
    	}
	
	
	@Test
	public void loginFour() {
		LoginPage four=new LoginPage(driver) ;
		four.enterName("performance_glitch_user");
		four.enterPassword("secret_sauce");
		four.clickLogin();
    	}
}
