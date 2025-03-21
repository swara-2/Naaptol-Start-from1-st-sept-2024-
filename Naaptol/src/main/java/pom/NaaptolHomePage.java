package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NaaptolHomePage  {
	@FindBy(xpath="//a[@id=\"login-panel-link\"]")private WebElement login;
	@FindBy(xpath="//a[@id=\"registration-panel-link\"]")private WebElement trackorder;
	@FindBy(xpath="//div[@class='cate_head']")private WebElement shoppingcategories;
	@FindBy(xpath="//input[@id=\"header_search_text\"]")private WebElement searchfield;
	@FindBy(xpath="//div[@class=\"grid_Square \"]")private List<WebElement> listofProducts;
	@FindBy(xpath="(//a[@href='javascript:autoSuggestion.headerSearch()'])[2]")private WebElement searchbutton;
	@FindBy(xpath="(//a[@id=\"cart-panel-link\"])[2]")private WebElement addToCart;
	@FindBy(xpath="//ul[@id=\"shopCartHead\"]")private WebElement addtocartpopup;
	@FindBy(xpath="(//input[@type=\"text\"])[3]")private WebElement loginMobile;
	@FindBy(xpath="//div[@class=\"fancybox-skin\"]")private WebElement loginpopup;
	@FindBy(xpath="(//li[@id=\"cshow1\"])[1]")private WebElement ShoppingCategoriesFootwear;
	
	public  NaaptolHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	public void ClickOnLogin() {
		login.click();
	}
	public boolean popupLogin() {
		return loginpopup.isDisplayed();
	}
	public void Displayedloginpopup(String mobile) {
		loginMobile.sendKeys();
	}
	public void ClickOnTrackOrder() {
		trackorder.click();
	}
	public void MoveOnShoppingCategories(WebDriver driver) {
		Actions action=new Actions(driver);
		action.moveToElement(shoppingcategories);
		action.perform();
	}
	public boolean footwearisDisplayed() {
		return ShoppingCategoriesFootwear.isDisplayed();
	}
	/*public boolean ProductsList() {
    	return listofProducts.isDisplayed();
	}*/
	
	public void SearchOnSearchField(String product) {
		searchfield.sendKeys(product);
	}
		public void ClickOnSearchButton() {
		searchbutton.click();
	}
		public void ClickOnAddToCart() {
			addToCart.click();
		}
		public boolean AddToCartPopUp() {
			return addtocartpopup.isDisplayed();
		}
		
		

}
