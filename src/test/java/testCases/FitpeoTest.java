package testCases;

import org.testng.annotations.Test;

import freemarker.log.Logger;
import pageObjects.HomePage;
import pageObjects.ResultPage;
import testBase.BaseClass;

public class FitpeoTest extends BaseClass{
	
	@Test
	public void TestFotpeo() throws InterruptedException
	{
		logger.info("Execution Started");
		
		HomePage hp = new HomePage(driver);
		hp.txtSearchBox("ipad");
		hp.autoSuggestionDropdown();
	
		
		
		ResultPage rp = new ResultPage(driver);
		rp.clickTabletWithCallFacility();
		rp.selectMinPriceDrpdwn();
		rp.selectMaxPriceDrpdwn();
	
		rp.clickCheckBoxFAssured();
	
		rp.clickdrpdownBrand();
	
		rp.clickCheckboxApple();
		
		rp.clickAllcheckboxes();
		Thread.sleep(30000);
		
		
		logger.info("Execution Finished");
	}

}
