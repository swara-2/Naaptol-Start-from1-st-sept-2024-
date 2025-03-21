package test;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.NaaptolHomePage;
import utility.Reports;

@Listeners(test.Listeners.class)
public class NaaptolHomePageTest extends BaseTest  {
	@BeforeTest
	public void configureReporting() {
		reports=Reports.ConfigureReports();
	}
	@BeforeMethod
	public void openBrowser() {
	driver=Browser.LaunchBrowser();
	}
	
	@Test
	 public void verifyLoginPopup() {
	 test=reports.createTest("Verify login PopUp");
	 NaaptolHomePage naaptolhomepage=new NaaptolHomePage(driver);
	 naaptolhomepage.ClickOnLogin();
	 naaptolhomepage.Displayedloginpopup("8160913665");
	Assert.assertTrue(naaptolhomepage.popupLogin());
	}

		
	@Test
	public void VerifyClickOnTrackOrder()     {
	test=reports.createTest("Verify Track order");
	NaaptolHomePage naaptolhomepage=new NaaptolHomePage(driver);
	naaptolhomepage.ClickOnTrackOrder();
	Assert.assertTrue(naaptolhomepage.popupLogin());//it shows loginpopup
	}
	
   @Test
    public void VerifyShoppingCategories()     {
	test=reports.createTest("Verify Shopping Categories Options");
	NaaptolHomePage naaptolhomepage=new NaaptolHomePage(driver);
	naaptolhomepage.MoveOnShoppingCategories(driver); 
	Assert.assertTrue(naaptolhomepage.footwearisDisplayed());
	}
   
   @Test
	public void VerifySearchField()      {
	 test=reports.createTest("Verify search page");
	NaaptolHomePage naaptolhomepage=new NaaptolHomePage(driver);
	naaptolhomepage.SearchOnSearchField("toys");  
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	naaptolhomepage.ClickOnSearchButton();
	//String actualTitle=driver.getTitle();
	//System.out.println(actualTitle);
	//String expectedPartialText="Search Result";
	//Assert.assertTrue(actualTitle.contains(expectedPartialText));
	Assert.assertTrue(driver.getTitle().contains("Search Result"));
	}
   
   @Test
	public void Verifyaddtocart()     {
	  test=reports.createTest("Verify add to cart popup");
	NaaptolHomePage naaptolhomepage=new NaaptolHomePage(driver);
	naaptolhomepage.ClickOnAddToCart();  
	Assert.assertTrue(naaptolhomepage.AddToCartPopUp());
   }
  /* public void VerifyProducts()     {
		  test=reports.createTest("Verify Products");
		NaaptolHomePage naaptolhomepage=new NaaptolHomePage(driver);
		naaptolhomepage.ProductsList();  
		Assert.assertTrue(naaptolhomepage.ProductList()>0);
	   }*/
	
   
   
   
   }
		
	


