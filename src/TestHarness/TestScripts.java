package TestHarness;

import org.testng.annotations.Test;

import Generic.BaseLib;
import PageObject.InboxPage;
import PageObject.LoginPage;

public class TestScripts extends BaseLib{
	
	@Test
	
	public void login() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.Login();
		InboxPage ib=new InboxPage(driver);
		ib.verifyLogo();
		
		InboxPage ip=new InboxPage(driver);
		ip.clickOnCompose();
		ip.verifyComposeBox();
		ip.enterToAndSub();
		ip.verifySentMessage();
	}
	
	

}
