package pom;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductResultPage extends BasePage {
	@FindBy(xpath="//div[@class=\"grid_Square \"]")private List<WebElement> Products;
	@FindBy(xpath="//a[@class=\"bt_compare icon chat quickFancyBox\"]")private List<WebElement> QuickView;
    @FindBy(xpath="//div[@class=\"item_title\"]")private List<WebElement>TitleName;
    @FindBy(xpath="//span[@class=\"offer-price\"]")private List<WebElement> OfferPrice;
    @FindBy(xpath="//div[@id=\"square_Details\"]//h1")private WebElement TitleOnQuickView;
    @FindBy(xpath="(//div[@id=\"square_Details\"]//ul//li//span)[7]")private WebElement PriceOnQuickView;
    @FindBy(xpath="//div[@id=\"square_Details\"]//h1")private WebElement TitleOnChildBrowser;
    @FindBy(xpath="(//div[@id=\"square_Details\"]//li//span)[7]")private WebElement PriceOnChildBrowser;
    @FindBy(xpath="//span[@class=\"ship-price\"]")private WebElement shippingPriceOnQuickView;
    public ProductResultPage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
    public void MoveonProduct(WebDriver driver,int index) {
    	Actions action=new Actions( driver);
    	action.moveToElement(Products.get(index));
		action.perform();;
    }
    public void Product(int index) {
    	Products.get(index).click();
    }
    public String GetTitle(int index) {
    	return TitleName.get(index).getText();
    }
    public String GetOfferPrice(int index) {
    	return OfferPrice.get(index).getText();
    	
    }
    public void GetQuickView(int index) {
    	QuickView.get(index).click();
    }
    public String ProductNameOnQuickView() {
    	 return TitleOnQuickView.getText();
    }
    public double ProductPriceOnQuickView() {
   	  String[]p=PriceOnQuickView.getText().split(" ");
   	return Double.parseDouble(removeCommaFromString(p[0]));
    }
    public double ShippingPriceOnQuikView() {
    	String[]Q=shippingPriceOnQuickView.getText().split(" ");
    	return Double.parseDouble(removeCommaFromString(Q[0]));
    }
    public String ProductNameOnChildBrowser() {
    	   	return TitleOnChildBrowser.getText();
    }
    public double ProductPriceOnChildBrowser() {
    	String[]P=PriceOnChildBrowser.getText().split(" ");
    	return Double.parseDouble(removeCommaFromString(P[0]));
    }
    
    
}

