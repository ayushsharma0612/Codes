package Generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverCommonLib {
	
	 public WebDriver driver;
	 
	 public WebDriverCommonLib (WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 
	 public void getscreenshot(String ScriptName)
	 {
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File srcfile=ts.getScreenshotAs(OutputType.FILE);
		 File destfile=new File("./screenshots/"+ ScriptName+".png");
		 try
		 {
			 FileUtils .copyFile(srcfile, destfile);
		 }
		 catch(IOException e)
		 {
			 e.printStackTrace();
		 }
	 } 
		public void enterData(WebElement ele,String Data)
		{
		ele.sendKeys(Data);
		
		}
		 
	 }
			
	 

