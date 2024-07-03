package pageObjects;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class SignUpPage extends BaseClass {

	public SignUpPage() {
	PageFactory.initElements(driver, this);	
	
	}
	@FindBy(xpath="//*[@id=\"login-cta\"]/a")
	public WebElement signInButton;
	public SignInPage clickOnSignIn() throws InterruptedException {

		Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login-cta']/a")));
		signInButton.click();
		return new SignInPage();
	}
}

