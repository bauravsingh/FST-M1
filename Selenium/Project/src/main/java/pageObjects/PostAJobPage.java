package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostAJobPage {
	
	@FindBy(xpath="//input[@id='create_account_email']")
	public WebElement accountEmail;
	
	@FindBy(xpath="//input[@id='job_title']")
	public WebElement jobTitile;
	
	@FindBy(xpath="//input[@id='job_location']")
	public WebElement jobLocation;
	
	@FindBy(xpath="//select[@id='job_type']")
	public WebElement jobType;
	
	@FindBy(xpath="//div[@id='page']/div[@id='content']//input[@id='application']")
	public WebElement application;
	
	@FindBy(xpath="//input[@id='company_name']")
	public WebElement companyName;
	
	@FindBy(xpath="//input[@id='company_website']")
	public WebElement compWebsite;
	
	@FindBy(xpath="//input[@id='company_tagline']")
	public WebElement compaTagLine;
	
	@FindBy(xpath="//input[@id='company_video']")
	public WebElement compaVedio;
	
	@FindBy(xpath="//input[@id='company_twitter']")
	public WebElement compaTwitter;
	
	@FindBy(xpath="//input[@id='company_logo']")
	public WebElement compaLogo;
	
	@FindBy(xpath="//input[@name='submit_job']")
	public WebElement submitJob;
	
	@FindBy(xpath="//form[@id='submit-job-form']//input[@name='submit_job']")
	public WebElement previewBtn;
	
	@FindBy(xpath="//div[@class='job_listing_preview single_job_listing']//h1")
	public WebElement jobList;
	
	@FindBy(xpath="//iframe[@id='job_description_ifr']")
	public WebElement jobDescription;
	
	@FindBy(xpath="//body[@id='tinymce']//p")
	public WebElement textElement;

	
}
