package pom;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage extends BasePage {
	@FindBy(xpath="//a[@id=\"cart-panel-button-0\"]")private WebElement clickHereToBuy;
	//@FindBy(xpath="//div[@id='mainMenuContent"]//ul//li//a//span")private List<WebElement> products;
	@FindBy(xpath="//div[@class=\"cart_info\"]//h2")private WebElement productNameOnCart;
	@FindBy(xpath="//li[@class='head_UPrice']")private List <WebElement> productPriceOnCart;
	@FindBy(xpath="//li[@class='head_ship']")private List <WebElement> productShippingPriceOnCart;
	@FindBy(xpath="//li[@class=\"head_qty\"]")private List <WebElement> quantity;
	@FindBy(xpath="//p[@class=\"chintu\"]")private List <WebElement> remove;
	@FindBy(xpath="(//a[@ class=\"link_Continue\"])[1]")private WebElement continueShopping;
	@FindBy(xpath="//ul[@id=\"size_box_0\"]//li")private List <WebElement> sizeoptions;
	@FindBy(xpath="(//a[text()=\"Remove\"])[1]")private WebElement removeElement;
	@FindBy(xpath="//ul[@id=\"cartData\"]")private List <WebElement> itemInCart;
	@FindBy (xpath="(//span[@class=\"font-bold\"])[4]")private WebElement noProduct;
	@FindBy(xpath="//li[@class=\"head_Amount\"]")private List <WebElement> OrderAmount;
	@FindBy(xpath="//li[@class=\"totalCart\"]//label")private WebElement totalAmount;
	
	
	public AddToCartPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
    }
	public void ClickHereToBuy() {
		clickHereToBuy.click();
	}
	public String GetProductNameOnCart() {
		return productNameOnCart.getText();
	}
	public double GetProductPriceOnCart(int index) {
		//String P=productPriceOnCart.getText().replace("Rs.","");
		return  Double.parseDouble(removeCommaFromString(productPriceOnCart.get(index).getText().substring(3)));
		//return P;
	}
	public double GetProductShippingPriceOnCart(int index) {
		return Double.parseDouble(removeCommaFromString(productShippingPriceOnCart.get(index).getText().substring(3)));
	}
	public void clickOnContinueShopping() {
		continueShopping.click();
	}
	public int ItemInCart() {
		return itemInCart.size();
	}
	public void SelectSizeOption(String targetSize) {
		for(WebElement option:sizeoptions) {
			if(option.getText().equals(targetSize)) {
				option.click();
				System.out.println("selected size:"+targetSize);
				break;
			}}}
	public void clickOnRemove() {
		removeElement.click();
		}
	public boolean NoProduct() {
		return noProduct.isDisplayed();
	}
	public double VerifyorderAmount(int index) {
		return Double.parseDouble(removeCommaFromString(OrderAmount.get(index).getText()));
	}
	public void UpdateQuantity(int index,String newquantity) throws InterruptedException {
		if(quantity.size()>0) {
          System.out.println("found"+quantity.size());
		quantity.get(index).click();
		Thread.sleep(2000);
		quantity.get(index).clear();
		quantity.get(index).clear();
		quantity.get(index).sendKeys(newquantity);
	}else
	{
		System.out.println("quantity is not visible");
	}
	}
	public String VerifyTotalAmount() {
		return totalAmount.getText();
	}
	
}
		
	

			