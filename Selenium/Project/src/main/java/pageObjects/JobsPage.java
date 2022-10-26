package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobsPage {

	@FindBy(xpath="//h1[@class='entry-title']")
	public WebElement headingTxt;
	
	@FindBy(xpath="//article[@id='post-16']//img[1]")
	public WebElement urlOfImg;
	
	@FindBy(xpath="//h2[contains(text(),'Quia quis non')]")
	public WebElement secHeadingTxt;
	
	@FindBy(xpath="//ul[@id='primary-menu']//a[text()='Jobs']")
	public WebElement primaryJobs;
	
	@FindBy(xpath="//ul[@id='primary-menu']//a[text()='Post a Job']")
	public WebElement primary;
	
	
}
