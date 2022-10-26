package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobsAdmin {

	@FindBy(xpath = "//li[@id='menu-posts-job_listing']//a")
	public WebElement jobsListing;

	@FindBy(xpath = "//a[@class='page-title-action']")
	public WebElement jobsAddNew;

	@FindBy(xpath = "//input[@id='_company_website']")
	public WebElement companyWebsite;

	@FindBy(xpath = "//input[@id='_company_name']")
	public WebElement companyName;

	@FindBy(xpath = "//input[@id='_company_tagline']")
	public WebElement companyTagline;

	@FindBy(xpath = "//p[contains(@class,'form-field-checkbox')]//input[@type='checkbox']")
	public WebElement checkBox;

	@FindBy(xpath = "//input[@id='_job_expires']")
	public WebElement calendar;

	@FindBy(xpath = "//td[contains(@class,'ui-datepicker-today')]")
	public WebElement date;
	
	@FindBy(xpath ="//textarea[@id='post-title-0']")
	public WebElement position;

	@FindBy(xpath ="//input[@id='_job_location']")
	public WebElement jobLocation;
	
	@FindBy(xpath="//button[contains(text(),'Publish…')]")
	public WebElement publishBtn;
	
	@FindBy(xpath="//div[@class='editor-post-publish-panel__header-publish-button']//button[contains(text(),'Publish')]")
	public WebElement publish;
	
	@FindBy(xpath="//div[@class='editor-post-publish-panel__header-published']")
	public WebElement verifyTxt;

	
	
}
