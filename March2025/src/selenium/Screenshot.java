package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static WebDriver driver;
	public static void main(String[]args) throws IOException {
	  driver=OpenBrowser.Browser("https://www.facebook.com");
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\sellenum very important\\SCREENSHOT\\amazon.png");
		FileHandler.copy(source, destination);

}}
