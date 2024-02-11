package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.LanguageLearning;
import testBase.BaseClass;

public class TC_004_LanguageLearning extends BaseClass{
	
	
	@Test(priority=9)
	public void search_Language()
	{
		try {
		LanguageLearning lobj=new LanguageLearning(driver);
		lobj.search_Language();
		}catch(Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test(priority=10)
	public void show_FiveCourses()
	{
		try {
			LanguageLearning lobj=new LanguageLearning(driver);
			lobj.LanguageOne();
			Thread.sleep(2000);
			lobj.LanguageTwo();
			Thread.sleep(2000);
			lobj.LanguageThird();
			Thread.sleep(2000);
			lobj.LanguageFourth();
			Thread.sleep(2000);
			lobj.LanguageFifth();
			
			}catch(Exception e) {
				e.printStackTrace();
				Assert.fail();
				
				
			}
	}
}

