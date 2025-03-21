package utility;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public void screen(WebDriver driver,String name) throws IOException {
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination=new File("G:\\Software Testing\\Automation\\Automation\\June-2024\\screenshot swag"+name+".png");
    FileHandler.copy(source,destination);
}}
