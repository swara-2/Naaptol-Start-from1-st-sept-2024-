package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tables {
	public static void main(String[]args) {
	WebDriver driver=OpenBrowser.Browser("https://demo.guru99.com/test/web-table-element.php");
   // WebElement head=driver.findElement(By.xpath("(//table)//thead"));//for heading
   // System.out.println(head.getText());
//   List<WebElement> head=driver.findElements(By.xpath("(//table)//tr//th"));//for heading
//       
//   for(int i=0;i<=head.size();i++) {
//	   String value=head.get(i).getText();
//	   System.out.println(value);
//	   System.out.println(i);
//	   }
//	
	List<WebElement> all=driver.findElements(By.xpath("(//table)//tr//td"));//for all
    for(int i=1;i<=all.size();i++) {
     // String value=all.get(i).getText();
      String company=driver.findElement(By.xpath("(//table)//tr["+i+" ]//td[1]")).getText();
      String price=driver.findElement(By.xpath("(//table)//tr["+i+" ]//td[4]")).getText();
      System.out.println(company+"="+price);
  }
//      List<WebElement>price= driver.findElements(By.xpath("//table//td[4]"));//for max
//      List<WebElement>company=driver.findElements(By.xpath("//table//td[1]"));
//      double max=0;
//      int index=0;
//      for(int i=0;i<price.size();i++) {
//    	 String Pprice= price.get(i).getText();
//    	double D= Double.parseDouble(Pprice);
//    	//System.out.println(D);
//    	if(D>max) {//700
//    		max=D;
//    		index=i;
//    	}}
//    	//System.out.print(max);
//    	//System.out.print(company.get(index).getText());
//    	
//	 
//     double min=max; //for min
//     int minindex=0;
//     for(int i=0;i<price.size();i++) {
//   	 String Pprice= price.get(i).getText();
//   	double D= Double.parseDouble(Pprice);
//   	//System.out.println(D);
//   	if(D<min) {
//   		min=D;
//   		index=i;
//   	}}
//   	System.out.print(min);
//   	System.out.print(company.get(minindex).getText()); 	
//      
	}}
