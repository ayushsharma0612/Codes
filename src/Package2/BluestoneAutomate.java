package Package2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BluestoneAutomate {
	public WebDriver driver;
	
	@BeforeMethod
	
	public void demo()
	{
		System.setProperty("webdriver.gecko.driver","/home/tyss/Desktop/AyushMoudgil/GmailAutomate/exefile/geckodriver");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
	}

	@AfterMethod
	public void shutDown() throws InterruptedException
	{
//		Thread.sleep(5000);
//		driver.quit();
	}
	
	
	@Test
	public void AutomateBluestone() throws InterruptedException
	{
		WebElement ring = driver.findElement(By.xpath("//a[text()='Rings ']"));
		Actions act=new Actions(driver);
		act.moveToElement(ring).perform();
		Thread.sleep(3000);
		WebElement innertxt = driver.findElement(By.xpath("//div[text()='Popular Ring Types ']/..//a[text()='Diamond']"));
		Thread.sleep(4000);
			act.click(innertxt).perform();
//		
//			WebDriverWait wdw=new WebDriverWait(driver,15);
//			wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Price']")));
//			WebElement txt = driver.findElement(By.xpath("//span[text()='Price']"));
//			Thread.sleep(3000 );
//			act.click(txt).perform();
//			
//			List<WebElement> lst = driver.findElements(By.xpath("//span[@data-tagcategory='Price']"));
//			int count = lst.size();	
//			System.out.println(count);
//			
//			for(int i=0;i<count;i++)
//			{
//				String txt1 = lst.get(i).getText();
//				System.out.println(txt1);
//			}
			
			WebDriverWait wdw=new WebDriverWait(driver, 10);
			//wdw.until(ExpectedConditions.refreshed(By.xpath("//a[@class='link-overlay']")));
	List<WebElement> lst = driver.findElements(By.xpath("//a[@class='link-overlay']"));
			int count = lst.size(); 	
			System.out.println(count);
			
			//wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath(" Popular ")));
//			WebElement singlseldrpdwn = driver.findElement(By.xpath("//span[contains(@class,'view-by-wrap')]"));
//			Thread.sleep(4000);
//			act.click(singlseldrpdwn).perform();
//			
//			WebElement optnindrpdwn = driver.findElement(By.xpath("//a[text()='Price Low to High ']"));
//			act.click(optnindrpdwn).perform();
//			
////			String txt1 = null;
////			String expMsg=txt1;
////			Assert.assertEquals(txt1, optnindrpdwn);
			
			
	}
		
	
	
}
