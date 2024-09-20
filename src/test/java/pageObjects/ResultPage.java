package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ResultPage extends BasePage{
	
	public ResultPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Tablets with Call Facility']")
	WebElement clickTabletWithCallFacility;
	
	@FindBy(xpath="(//select[@class='Gn+jFg'])[1]")
	WebElement selectMinPriceDrpdwn;
	
	@FindBy(xpath="(//select[@class='Gn+jFg'])[2]")
	WebElement selectMaxPriceDrpdwn;
	
	@FindBy(xpath="//div[@class='XqNaEv eJE9fb']")
	WebElement clickCheckBoxFAssured;
	
	@FindBy(xpath = "//div[@class='fxf7w6 rgHxCQ' and text()='Brand']")
	WebElement clickdrpdownBrand;
	
	@FindBy(xpath = "//div[text()='Apple']")
	WebElement clickCheckboxApple;
	
	@FindBy(xpath="//div[@class='ewzVkT _3DvUAf']")
	List<WebElement> clickallcheckboxes;
	
	
	
	
	
	public void clickTabletWithCallFacility()
	{
		clickTabletWithCallFacility.click();
	}
	
	public void selectMinPriceDrpdwn()
	{
		Select selectmindrpdwn = new Select(selectMinPriceDrpdwn);
		selectmindrpdwn.selectByValue("10000");
	}
	
	public void selectMaxPriceDrpdwn()
	{
		Select selectmaxdrpdwn = new Select(selectMaxPriceDrpdwn);
		selectmaxdrpdwn.selectByValue("Max");
	}
	
	public void clickCheckBoxFAssured()
	{
		clickCheckBoxFAssured.click();
	}
	
	public void clickdrpdownBrand()
	{
		clickdrpdownBrand.click();
	}
	
	public void clickCheckboxApple() {
		clickCheckboxApple.click();
	}
	
	public void clickAllcheckboxes()
	{
		for(int i=0;i<=clickallcheckboxes.size()-1;i++)
		{
			clickallcheckboxes.get(i).click();
		}
	}

}
