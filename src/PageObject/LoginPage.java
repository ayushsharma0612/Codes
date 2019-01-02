package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.WebDriverCommonLib;

public class LoginPage  {
	
	

	private WebDriver driver;
	
	WebDriverCommonLib wlib=new WebDriverCommonLib(driver);
	
	
	
	@FindBy(name="identifier")
	private WebElement untxbx;
	
	@FindBy(id="identifierNext")
    private WebElement nxtbtn;
	
	@FindBy(id="passwordNext")
	private WebElement nxtbtn1;
	
	@FindBy(name="password")
	private WebElement pswdtxbx;
	
	@FindBy(id="gbwa")
	private WebElement sqbtn;
	
	@FindBy(xpath="//span[text()='Gmail']")
	private WebElement gmailBtn;

	
	public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void Login() throws InterruptedException
	{
	
		wlib.enterData(untxbx,"ayushsharma3910@gmail.com");
		Thread.sleep(3000);
		nxtbtn.click();
		Thread.sleep(3000);
		wlib.enterData(pswdtxbx,"");
		nxtbtn1.click();
		sqbtn.click();
		gmailBtn.click();
		
	}

}
