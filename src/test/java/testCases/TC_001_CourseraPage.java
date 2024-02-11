package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CourseraPage;
import testBase.BaseClass;

public class TC_001_CourseraPage extends BaseClass {
	
	
	@Test(priority=1)
	public void check_survey_visibility() {
		try {
			CourseraPage cpage = new CourseraPage(driver);
			cpage.SurveyDisplay();
			}
			catch(Exception e) {
				e.printStackTrace();
				
			}
	}
	@Test(priority=2)
	public void Verify_CourseraPage() {
		try {
		CourseraPage cpage = new CourseraPage(driver);
		String get_Page = cpage.Verify_CourseraPage();
		Assert.assertEquals(get_Page, "Coursera","Coursera Page successfully displayed");
		}
		catch(Exception e) {
			e.printStackTrace();
			Assert.fail("Coursera Page did not displayed");
		}
	}    }
