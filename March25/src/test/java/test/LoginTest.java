package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.LoginPage;


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
	@Test
	public void loginFive() {
		LoginPage five=new LoginPage(driver) ;
		five.enterName("error_user");
		five.enterPassword("secret_sauce");
		five.clickLogin();
    	}
	@Test
	public void loginSix() {
		LoginPage six=new LoginPage(driver) ;
		six.enterName("visual_user");
		six.enterPassword("secret_sauce");
		six.clickLogin();
    	}
	

}
