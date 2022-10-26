package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobsSearchPage {

	@FindBy(xpath="//input[@id='search_keywords']")
	public WebElement searchKeywords;
	
	@FindBy(xpath="//input[@id='search_location']")
	public WebElement searchLocation;
	
	@FindBy(xpath="//div[@class='search_submit']/input")
	public WebElement searchSubmitBtn;
	
	@FindBy(xpath="//h3[contains(text(),'Banking clerk')]")
	public WebElement searchInput;
	
	@FindBy(xpath="//div[@class='job_application application']/input")
	public WebElement applyForJob;
	
	@FindBy(xpath="//a[@class='job_application_email']")
	public WebElement  emailTxt;
}
