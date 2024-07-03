package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class SignInPage extends BaseClass {

	public SignInPage() {
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//input[@id='1-email']")
	WebElement emailField;
	
	@FindBy(xpath="//input[@id='1-password']")
	WebElement passwordField;
	
	@FindBy(xpath="//button[@id='1-submit']")
	WebElement loginCTA;
	
	public void enterEmail() throws InterruptedException {
		emailField.sendKeys("vijay+10@vinsol.com");
	}
	public void enterPassword() {
		passwordField.sendKeys("1234567a!");
	}
	public Dashboard clickLogin() {
		loginCTA.click();
		return new Dashboard();
}
}
