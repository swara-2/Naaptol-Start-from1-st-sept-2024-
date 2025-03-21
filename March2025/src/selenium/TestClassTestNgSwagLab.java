package selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestClassTestNgSwagLab {
	
	public static WebDriver driver ;
	@AfterMethod
	public void end(){
		driver.close();
	}
	@BeforeMethod
	public void openB() {
	driver=OpenBrowser.Browser("https://www.saucedemo.com/");
	}
	
	@Test
	public void loginOne() {
		
		TestNgSwagLab testng=new TestNgSwagLab(driver) ;
		testng.enterName("standard_user");
		testng.enterPassword("secret_sauce");
    	}
	@Test
	public void loginTwo() {
		
		TestNgSwagLab testng=new TestNgSwagLab(driver) ;
		testng.enterName("locked_out_user");
		testng.enterPassword("secret_sauce");
    	}
	@Test
	public void loginThree() {
		
		TestNgSwagLab testng=new TestNgSwagLab(driver) ;
		testng.enterName("problem_user");
		testng.enterPassword("secret_sauce");
    	}
	
	
	@Test
	public void loginFour() {
		
		TestNgSwagLab testng=new TestNgSwagLab(driver) ;
		testng.enterName("performance_glitch_user");
		testng.enterPassword("secret_sauce");
    	}
	@Test
	public void loginFive() {
		
		TestNgSwagLab testng=new TestNgSwagLab(driver) ;
		testng.enterName("error_user");
		testng.enterPassword("secret_sauce");
    	}
	@Test
	public void loginSix() {
		
		TestNgSwagLab testng=new TestNgSwagLab(driver) ;
		testng.enterName("visual_user");
		testng.enterPassword("secret_sauce");
    	}
	
	
}
