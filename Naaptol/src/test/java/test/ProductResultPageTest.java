package test;
import java.time.Duration;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.NaaptolHomePage;
import utility.Reports;
import pom.ProductResultPage;

@Listeners(test.Listeners.class)

public class ProductResultPageTest extends BaseTest{
	@BeforeTest
	public void configureReporting() {
		reports=Reports.ConfigureReports();
	}
	@BeforeMethod
	public void openBrowser() {
	driver=Browser.LaunchBrowser();
	}
	@Test
	public void Verifysearchproduct() {
		test=reports.createTest("Verify search product ");
		NaaptolHomePage naaptolhomepage=new NaaptolHomePage(driver);
		naaptolhomepage.SearchOnSearchField("toys");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		naaptolhomepage.ClickOnSearchButton();
		ProductResultPage productresultpage=new ProductResultPage(driver);
		//productresultpage.MoveonProduct(driver, 0);
		String title=productresultpage.GetTitle(0);
		System.out.println(title);
		String offerprice=productresultpage.GetOfferPrice(0);
		System.out.println(offerprice);
		Assert.assertEquals(productresultpage.GetTitle(0), title);
	}
	
	@Test
	public void VerifyProductOnQuickView(){
		test=reports.createTest("Verify Product On Quik View");
		NaaptolHomePage naaptolhomepage=new NaaptolHomePage(driver);
		naaptolhomepage.SearchOnSearchField("toys");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		naaptolhomepage.ClickOnSearchButton();
		ProductResultPage productresultpage=new ProductResultPage(driver);
		String title=productresultpage.GetTitle(0);
		System.out.println(title);
		String price=productresultpage.GetOfferPrice(0);
		System.out.println(price);
		productresultpage.MoveonProduct(driver,0);
		productresultpage.GetQuickView(0);
		productresultpage.ProductNameOnQuickView();
		productresultpage.ProductPriceOnQuickView();
		Assert.assertEquals(productresultpage.ProductNameOnQuickView(), title);
		//Assert.assertEquals(productresultpage.ProductPriceOnQuickView(),price);//price in double so I comment this
	}
	@Test
	public void VerifyProductOnChildBrowser() {
		test=reports.createTest("Verify product on ChildBrowser");
		NaaptolHomePage naaptolhomepage=new NaaptolHomePage(driver);
		naaptolhomepage.SearchOnSearchField("toys");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		naaptolhomepage.ClickOnSearchButton();
		ProductResultPage productresultpage=new ProductResultPage(driver);
		String title=productresultpage.GetTitle(0);
		System.out.println(title);
		String price=productresultpage.GetOfferPrice(0);
		System.out.println(price);
		productresultpage.Product(0);
		//SwitchToChildBrowser();
		Set<String>handles=driver.getWindowHandles();
		for(String handle:handles) {
		driver.switchTo().window(handle);	}
		productresultpage.ProductNameOnChildBrowser();
		productresultpage.ProductPriceOnChildBrowser();
		Assert.assertEquals(productresultpage.ProductNameOnChildBrowser(),title);
		//Assert.assertEquals(productresultpage.ProductPriceOnChildBrowser(),price);
	}

}
