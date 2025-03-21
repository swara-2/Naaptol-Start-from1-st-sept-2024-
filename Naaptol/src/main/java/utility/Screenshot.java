package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void TakeScreenshot (WebDriver driver,String name) throws IOException {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\Automation Programs(1-sept)\\Naaptol(1st sept 2024)\\Naaptol\\Screenshots\\"+name+".png");
		FileHandler.copy(source, destination);
		
	}
}
