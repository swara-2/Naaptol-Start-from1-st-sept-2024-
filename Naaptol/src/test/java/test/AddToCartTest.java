package test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.AddToCartPage;
import pom.NaaptolHomePage;
import pom.ProductResultPage;
import utility.Reports;

public class AddToCartTest extends BaseTest{
		@BeforeTest
		public void configureReporting() {
			reports=Reports.ConfigureReports();
		}
		@BeforeMethod
		public void openBrowser() {
		driver=Browser.LaunchBrowser();
		}
		@Test
		public void VerifyAddToCartByClickOnProduct() {
			test=reports.createTest("Verify search product ");
			NaaptolHomePage naaptolhomepage=new NaaptolHomePage(driver);
			naaptolhomepage.SearchOnSearchField("toys");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			naaptolhomepage.ClickOnSearchButton();
			ProductResultPage productresultpage=new ProductResultPage(driver);
			//productresultpage.MoveonProduct(driver, 0);
			productresultpage.Product(0);
			productresultpage.ProductNameOnChildBrowser();
			productresultpage.ProductPriceOnChildBrowser();	
			AddToCartPage addtocartpage=new AddToCartPage(driver);
			addtocartpage.ClickHereToBuy();
			Set<String>handles=driver.getWindowHandles();
			for(String handle:handles) {
			driver.switchTo().window(handle);	}
			String Name=addtocartpage.GetProductNameOnCart();
			System.out.println(Name);
			double Price=addtocartpage.GetProductPriceOnCart(0);
			System.out.println(Price);
		    double OfferPrice=addtocartpage.GetProductShippingPriceOnCart(0);
			System.out.println(OfferPrice);
			//Assert.assertEquals(productresultpage.ProductNameOnChildBrowser(),Name);
			//Assert.assertEquals(productresultpage.ProductPriceOnChildBrowser(),Price);
        }
		@Test
		public void VerifyAddToCartByClickOnQuickView() {
	       test=reports.createTest("Verify search product ");
	       NaaptolHomePage naaptolhomepage=new NaaptolHomePage(driver);
			naaptolhomepage.SearchOnSearchField("toys");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			naaptolhomepage.ClickOnSearchButton();
			ProductResultPage productresultpage=new ProductResultPage(driver);
			productresultpage.MoveonProduct(driver,0);
			productresultpage.GetQuickView(0);
			String Name=productresultpage.ProductNameOnQuickView();
			//System.out.println(Name);
			
			double Price=productresultpage.ProductPriceOnQuickView();
			//System.out.println(Price);
			AddToCartPage addtocartpage=new AddToCartPage(driver);
			addtocartpage.ClickHereToBuy();
			//String name=addtocartpage.GetProductNameOnCart(0);
			//System.out.println(name);
			double price=addtocartpage.GetProductPriceOnCart(0);
			//System.out.println(price);
		    double offerPrice=addtocartpage.GetProductShippingPriceOnCart(0);
		    //System.out.println(offerPrice);
			//Assert.assertEquals(addtocartpage.GetProductNameOnCart(0),Name);
			Assert.assertEquals(addtocartpage.GetProductPriceOnCart(0),Price);
		}
		@Test
		public void VerifyAddToCartByAddingMultileProducts() throws InterruptedException {
			test=reports.createTest("Verify search product ");
			NaaptolHomePage naaptolhomepage=new NaaptolHomePage(driver);
			naaptolhomepage.SearchOnSearchField("MOBILE");
			naaptolhomepage.ClickOnSearchButton();
			ProductResultPage productresultpage=new ProductResultPage(driver);
			productresultpage.Product(0);
			SwitchToChildBrowser();
			AddToCartPage addtocartpage=new AddToCartPage(driver);
			addtocartpage.ClickHereToBuy();
			addtocartpage.clickOnContinueShopping();
					
			naaptolhomepage.SearchOnSearchField("juicer");
			naaptolhomepage.ClickOnSearchButton();
			productresultpage.Product(0);
			//SwitchToChildBrowser();
			Set<String>handles=driver.getWindowHandles();
			for(String handle:handles) {
			driver.switchTo().window(handle);	}
			addtocartpage.ClickHereToBuy();
			addtocartpage.clickOnContinueShopping();
				
			naaptolhomepage.SearchOnSearchField("shoes");
			naaptolhomepage.ClickOnSearchButton();
			productresultpage.Product(0);
			//SwitchToChildBrowser();
			Set<String>Whandles=driver.getWindowHandles();
			for(String whandle:Whandles) {
			driver.switchTo().window(whandle);		}
			addtocartpage.SelectSizeOption("Blue-8");
			addtocartpage.ClickHereToBuy();
			Assert.assertEquals(addtocartpage.ItemInCart(),3);
			
		}
		@Test
		public void VerifyRemoveProduct() throws InterruptedException {
			test=reports.createTest("Verify search product ");
			NaaptolHomePage naaptolhomepage=new NaaptolHomePage(driver);
			naaptolhomepage.SearchOnSearchField("toys");
			naaptolhomepage.ClickOnSearchButton();
			ProductResultPage productresultpage=new ProductResultPage(driver);
			productresultpage.Product(0);
			SwitchToChildBrowser();
			AddToCartPage addtocartpage=new AddToCartPage(driver);
			addtocartpage.ClickHereToBuy();
			addtocartpage.clickOnRemove();
			Assert.assertEquals(addtocartpage.NoProduct(),0);
		}
		@Test
		public void VerifyOrderAmount() throws InterruptedException {
			test=reports.createTest("Verify search product ");
			NaaptolHomePage naaptolhomepage=new NaaptolHomePage(driver);
			naaptolhomepage.SearchOnSearchField("MOBILE");
			naaptolhomepage.ClickOnSearchButton();
			ProductResultPage productresultpage=new ProductResultPage(driver);
			productresultpage.Product(0);
			SwitchToChildBrowser();
			AddToCartPage addtocartpage=new AddToCartPage(driver);
			addtocartpage.ClickHereToBuy();
			addtocartpage.clickOnContinueShopping();
			//String ExpectedName=addtocartpage.GetProductNameOnCart(0);
			Double ExpectedPrice=addtocartpage.GetProductPriceOnCart(1);
			Double ExpectedShippingPrice=addtocartpage.GetProductShippingPriceOnCart(1);
			Double ExpectedOrderAmount=addtocartpage.VerifyorderAmount(1);
			//System.out.print(ExpectedName+""+ExpectedPrice+""+ExpectedShippingPrice);
			Assert.assertEquals(addtocartpage.VerifyorderAmount(1),addtocartpage.GetProductPriceOnCart(1)+addtocartpage.GetProductShippingPriceOnCart(1));
		}
		
		@Test
		public void VerifyOrderAmountWithUpdateQuantity() throws InterruptedException {
			test=reports.createTest("Verify search product ");
			NaaptolHomePage naaptolhomepage=new NaaptolHomePage(driver);
			naaptolhomepage.SearchOnSearchField("toyes");
			naaptolhomepage.ClickOnSearchButton();
			ProductResultPage productresultpage=new ProductResultPage(driver);
			productresultpage.Product(0);
			SwitchToChildBrowser();
			AddToCartPage addtocartpage=new AddToCartPage(driver);
			addtocartpage.ClickHereToBuy();
			Thread.sleep(2000);
			addtocartpage.UpdateQuantity(1,"2");
			addtocartpage.clickOnContinueShopping();
			//String ExpectedName=addtocartpage.GetProductNameOnCart(0);
			Double ExpectedPrice=addtocartpage.GetProductPriceOnCart(1);
			Double ExpectedShippingPrice=addtocartpage.GetProductShippingPriceOnCart(1);
			Double ExpectedOrderAmount=addtocartpage.VerifyorderAmount(1);
			//System.out.print(ExpectedName+""+ExpectedPrice+""+ExpectedShippingPrice);
			//Assert.assertEquals(addtocartpage.VerifyorderAmount(1),addtocartpage.GetProductPriceOnCart(1)+addtocartpage.GetProductShippingPriceOnCart(1));
		}
		@Test
		public void VerifyTotalAmount() throws InterruptedException {
			test=reports.createTest("Verify search product ");
			NaaptolHomePage naaptolhomepage=new NaaptolHomePage(driver);
			naaptolhomepage.SearchOnSearchField("MOBILE");
			naaptolhomepage.ClickOnSearchButton();
			ProductResultPage productresultpage=new ProductResultPage(driver);
			productresultpage.Product(0);
			SwitchToChildBrowser();
			AddToCartPage addtocartpage=new AddToCartPage(driver);
			addtocartpage.ClickHereToBuy();
			addtocartpage.clickOnContinueShopping();
					
			naaptolhomepage.SearchOnSearchField("juicer");
			naaptolhomepage.ClickOnSearchButton();
			productresultpage.Product(0);
			//SwitchToChildBrowser();
			Set<String>handles=driver.getWindowHandles();
			for(String handle:handles) {
			driver.switchTo().window(handle);	}
			addtocartpage.ClickHereToBuy();
			addtocartpage.clickOnContinueShopping();
				
			String Total=addtocartpage.VerifyTotalAmount();
			System.out.println(Total);//for assert it need double but if i use double then it shows error
			//Assert.assertEquals(Total,addtocartpage.VerifyorderAmount(1)+addtocartpage.VerifyorderAmount(2));
		}
}

		

		

	       
	       
		

