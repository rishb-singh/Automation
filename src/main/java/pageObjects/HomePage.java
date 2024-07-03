package pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class HomePage extends BaseClass {
	

	public HomePage() {
		super();
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//header/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]/span[1]/span[1]")
	WebElement loginButton;
	public SignUpPage clickOnLogIn() {
		loginButton.click();
		return new SignUpPage();
	}
}

