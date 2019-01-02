package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class BasePage {
	
	@FindBy(xpath="//img[contains(@src,'logo')]")
	private WebElement logo;
	
	@FindBy(xpath="//div[text()='Compose']")
	private WebElement composBtn;
	
	public BasePage(WebDriver driver)
	{	
		PageFactory.initElements(driver, this);
	}
	
	public void verifyLogo()
	{
		Assert.assertTrue(logo.isDisplayed());
		Reporter.log("Logo is displayed",true);
	}
	
	public void clickOnCompose() throws InterruptedException
	{
      Thread.sleep(3000);
		composBtn.click();
	}
	
	
	

}
