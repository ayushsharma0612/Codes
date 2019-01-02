package PageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import Generic.WebDriverCommonLib;

public class InboxPage extends BasePage {
	
	private WebDriver driver;
	
	WebDriverCommonLib wlib=new WebDriverCommonLib(driver);
	
	
	@FindBy(xpath="//div[text()='New Message']")
	private WebElement composPopUp;
	
	@FindBy(xpath="//textarea[@role='combobox']")
	private WebElement toField;
	
	@FindBy(xpath="//input[@name='subjectbox']")
	private WebElement subjectField;
	
	@FindBy(xpath="//div[@aria-label='Message Body']")
	private WebElement txtBdy;
	
	@FindBy(xpath="//div[contains(@data-tooltip,'Send')]")
	private WebElement sendBtn;
	
	@FindBy(xpath="span[text()='Message sent.']")
	private WebElement verifySent;
	
	public InboxPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	

 public void verifyComposeBox()
 {
	 String expMsg="New Message";
	 String actMsg=composPopUp.getText();
	 Assert.assertEquals(expMsg, actMsg);
	 Reporter.log("Compose page is verified",true);
 }
 
 
 
 public void enterToAndSub() throws InterruptedException
 {
	 wlib.enterData(toField, "ashish.93kumark@gmail.com");
	 wlib.enterData(subjectField, "Bhai tu kesaaa ha	!");
	 wlib.enterData(txtBdy, "Hey Bro what's up! How life going on");
	 Thread.sleep(3000);
	 sendBtn.click();
	 
 }
 
 public void verifySentMessage()
 {
	 String expMsg="Message sent.";
	 String actMsg=verifySent.getText();
	 Assert.assertEquals(actMsg, expMsg);
	 Reporter.log("Message sent successfully",true);
 }
 
 
	
		
	}
	
	
	
	
	

