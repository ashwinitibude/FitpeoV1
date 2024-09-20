package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@class='Pke_EE']")
	WebElement txtSearchBox;
	
	@FindBy(xpath="//li[@class='_3D0G9a']")
	List<WebElement> autosuggestiondropdown;
	
	
	
	
	
	public void txtSearchBox(String tsb)
	{
		txtSearchBox.sendKeys(tsb);
	}
	
	public void autoSuggestionDropdown()
	{
		System.out.println("Size Of Dropdown:"+autosuggestiondropdown.size());
		
		for(int i=1;i<=autosuggestiondropdown.size()-1;i++)
		{
			System.out.println(autosuggestiondropdown.get(i).getText());
			
			if(autosuggestiondropdown.get(i).getText().equals("ipad 9th gen"))
			{
				autosuggestiondropdown.get(i).click();
				break;
			}
		}
		
		
	}
	
	
	
	
	
}
