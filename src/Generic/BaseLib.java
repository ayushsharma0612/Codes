package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseLib {
	
	public static WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser","baseurl"})
	public void precondition(String browserName,String url)
	{
		
		//System.out.println(browserName+","+url);
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./exefile/chromedriver");
			driver=new ChromeDriver();
			Reporter.log("chrome launched",true);
		}
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./exefile/geckodriver");
			driver=new FirefoxDriver();
			Reporter.log("firefox launched",true);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		Reporter.log("Navigated to BaseUrl:"+ url,true);
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		String scriptName = result.getMethod().getMethodName();
		
		
		if(result.isSuccess())
		{
			Reporter.log(scriptName+"script is passed", true);
		}
		else
		{
			WebDriverCommonLib wlib=new WebDriverCommonLib(driver);
			wlib.getscreenshot(scriptName);
			Reporter.log("Screenshot has been taken",true);
		}
	//	driver.close();
		Reporter.log("Browser Closed",true);
		
		
	}
	
	
	
	
	
	
}
