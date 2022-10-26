package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	
	@FindBy(xpath="//input[@id='user_login']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='user_pass']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='rememberme']")
	private WebElement checkBox;
	
	@FindBy(xpath="//input[@id='wp-submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath="//a[contains(text(),'Lost your password?')]")
	private WebElement lostPwd;
	

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(WebElement userName) {
		this.userName = userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public void setCheckBox(WebElement checkBox) {
		this.checkBox = checkBox;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public void setSubmitBtn(WebElement submitBtn) {
		this.submitBtn = submitBtn;
	}

	public WebElement getLostPwd() {
		return lostPwd;
	}

	public void setLostPwd(WebElement lostPwd) {
		this.lostPwd = lostPwd;
	}
}
