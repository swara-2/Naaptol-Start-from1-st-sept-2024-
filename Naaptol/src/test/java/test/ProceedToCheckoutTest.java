package test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.AddToCartPage;
import pom.NaaptolHomePage;
import pom.ProceedToCheckOutPage;
import pom.ProductResultPage;
import utility.Parametrization;
import utility.Reports;

public class ProceedToCheckoutTest extends BaseTest{
	@BeforeTest
	public void ConfuguringReports() {
		reports=Reports.ConfigureReports();
	}
	@BeforeMethod
	public void openBrowser() {
		driver=Browser.LaunchBrowser();
	}
	@Test
	public void CheckOutTest() throws InterruptedException, EncryptedDocumentException, IOException {
		NaaptolHomePage naaptolhomepage=new NaaptolHomePage(driver);
		naaptolhomepage.SearchOnSearchField("toys");
		naaptolhomepage.ClickOnSearchButton();
		ProductResultPage productresultpage=new ProductResultPage(driver);
		productresultpage.Product(0);
		Set<String>handles=driver.getWindowHandles();
       	Iterator<String> i=handles.iterator();
    		driver.switchTo().window(i.next());
    		driver.switchTo().window(i.next());
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AddToCartPage addtocartpage=new AddToCartPage(driver);
		addtocartpage.ClickHereToBuy();
		ProceedToCheckOutPage proceedtocheckoutpage=new ProceedToCheckOutPage(driver);
		proceedtocheckoutpage.checkOut();
		proceedtocheckoutpage.RegisterMobileNumber("8469268638");
		proceedtocheckoutpage.clickOnContinueButton();
	    proceedtocheckoutpage.enterOTP("");
		Thread.sleep(30000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		proceedtocheckoutpage.clickOnSubmitButton();
		proceedtocheckoutpage.selectTitle();
		proceedtocheckoutpage.enterName();
		proceedtocheckoutpage.enterlastName();
		proceedtocheckoutpage.selectState();
		proceedtocheckoutpage.selectCity();//city selected and then deselected ,so not clicking on save button.
		proceedtocheckoutpage.entercompleteAddress();
		proceedtocheckoutpage.enterLandmark();
		proceedtocheckoutpage.enterpincode();
		proceedtocheckoutpage.enterMobile();
		//proceedtocheckoutpage.enterLandNumber();
		proceedtocheckoutpage.SaveAndProceed();
	}
	
	}
