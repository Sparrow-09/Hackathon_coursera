package testCases;

import org.testng.annotations.Test;

import pageObjects.ForEnterprisePage;
import pageObjects.FormFillingPage;
import pageObjects.ForBusinessPage;
import testBase.BaseClass;

public class TC_005_FormFilling extends BaseClass {
	
	
	@Test(priority=11)
	public void Enterprise()
	{
		ForEnterprisePage chp=new ForEnterprisePage(driver);
		chp.navigatetohome();
		chp.clickEnterprise();
	}
	
	


	@Test(priority = 12)
	public void form()
	{
		ForBusinessPage fup = new ForBusinessPage(driver);
		fup.navigatetoform();
	}
	
	@Test(priority = 13)
	public void startfillingform() throws InterruptedException
	{
		FormFillingPage ffp = new FormFillingPage(driver);
		ffp.Namefilling();
		Thread.sleep(3000);
	
	}
	
	@Test(priority = 14)
	public void messageDisplay() throws InterruptedException
	{
		FormFillingPage ffp = new FormFillingPage(driver);
		Thread.sleep(2000);
		ffp.errormsgdisp();
		ffp.errormsg1();
	}
}
