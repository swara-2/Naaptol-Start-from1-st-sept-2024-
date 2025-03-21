package pom;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Parametrization;


public class ProceedToCheckOutPage{

	
	@FindBy(xpath="(//a[@class=\"red_button2\"])[1]")private WebElement checkOut;
	@FindBy(xpath="//input[@id=\"gc-registration-basic-panel-mobile\"]")private WebElement registerMobileNumber;
	@FindBy(xpath="//input[@id=\"gc-registration-basic-panel-submit\"]")private WebElement continueButton;
	@FindBy(xpath="//input[@id=\"gc-registration-otp-panel-otp\"]")private WebElement OTP;
	@FindBy(xpath="//input[@id=\"gc-registration-otp-panel-submit\"]")private WebElement submitButton;
	@FindBy(xpath="//select[@name=\"fktitle_id\"]")private WebElement selectTitle;
	@FindBy(xpath="(//input[@type=\"text\"])[1]")private WebElement Name;
	@FindBy(xpath="(//input[@type=\"text\"])[2]")private WebElement LastName;
	@FindBy(xpath="//textarea[@name=\"address\"]")private WebElement CompleteAddress;
	@FindBy(xpath="//input[@name=\"landmark\"]")private WebElement LandMark;
	@FindBy(xpath="//input[@name=\"pincode\"]")private WebElement PinCode;
	@FindBy(xpath="//select[@name=\"state\"]")private WebElement selectState;
	@FindBy(xpath="//select[@name=\"city\"]")private WebElement selectCity;
	@FindBy(xpath="//input[@name=\"mobile\"]")private WebElement Mobile;
	//@FindBy(xpath="//input[@name=\"landline\"]")private WebElement LandNumber;
	@FindBy(xpath="//a[@id=\"addEditButton\"]")private WebElement saveAndProceed;

	public  ProceedToCheckOutPage(WebDriver driver) {
	  PageFactory.initElements(driver,this);
	}
		
		
		public void checkOut() {
			checkOut.click();
		}

		public void RegisterMobileNumber(String number) {
			registerMobileNumber.sendKeys(number);
		}
		
		public void clickOnContinueButton() {
			continueButton.click();
		}
	   public void enterOTP(String otp) {
			OTP.sendKeys(otp);
		}
		public void clickOnSubmitButton() {
			submitButton.click();
		}
		public void selectTitle() {
			Select select=new Select(selectTitle);
			select.selectByIndex(3);
		}
		
		public void enterName() throws EncryptedDocumentException, IOException {
			String name=Parametrization.getTestData(0, 0,"sheet1");
			Name.sendKeys(name);
		}
		public void enterlastName() throws EncryptedDocumentException, IOException {
			String lastname=Parametrization.getTestData(0,1,"sheet1");
			LastName.sendKeys(lastname);
		}
		public void selectState() throws InterruptedException {
			Select select=new Select(selectState);
			select.selectByVisibleText("GUJARAT");
			Thread.sleep(6000);
		}
		public void selectCity() throws InterruptedException  {
			Select select=new Select(selectCity);
			select.selectByVisibleText("UPLETA");
			Thread.sleep(6000);
		}
		
		public void entercompleteAddress() throws EncryptedDocumentException, IOException {
			String address=Parametrization.getTestData(1,0,"sheet1");
			CompleteAddress.sendKeys(address);
		}
		public void enterLandmark() throws EncryptedDocumentException, IOException {
			String landmark=Parametrization.getTestData(2,0,"sheet1");
			LandMark.sendKeys(landmark);
		}
		public void enterpincode() throws EncryptedDocumentException, IOException {
			String pincode=Parametrization.getTestData(3,0,"sheet1");
			PinCode.sendKeys(pincode);
		}
		public void enterMobile() throws EncryptedDocumentException, IOException {
			String mobile=Parametrization.getTestData(4,0,"sheet1");
			Mobile.sendKeys(mobile);
		}
		/*public void enterLandNumber() throws EncryptedDocumentException, IOException {
			String landnumber=Parametrization.getTestData(5,0,"sheet1");
			LandNumber.sendKeys(landnumber);
		}*/
		public void SaveAndProceed() {
			saveAndProceed.click();
		}
}

