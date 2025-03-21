package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestNgSwagLab {
		
		@FindBy(xpath="//input[@placeholder='Username']")private WebElement username;
	    @FindBy(xpath="//input[@placeholder='Password']")private WebElement password; 
        @FindBy(xpath="(//a[@role='button'])[4]")private WebElement fb;
	    public  TestNgSwagLab(WebDriver driver) {
	    	PageFactory.initElements(driver, this);
	    }
	    
	    public void enterName(String name) {
	    	username.sendKeys(name);
	    }
	    public void enterPassword(String pass) {
	    password.sendKeys(pass);
	    }
	    public void fbLogin() {
	    	fb.click();
	    }
}


