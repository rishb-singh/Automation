package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.BaseClass;

public class Dashboard extends BaseClass {
	public Dashboard() {
	
		PageFactory.initElements(driver, this);
	}
@FindBy (xpath="//body/div[@id='__next']/div[@id='sticky-header-root']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]/i[1]")
WebElement dashboardDropdown;

@FindBy (xpath="//div[contains(text(),'vijay+10@vinsol.com')]")
WebElement userEmail;

public void clickDashboardDropdown() {
	dashboardDropdown.click();
}

public void validateUser() {
	String actualEmail= "vijay+10@vinsol.com";
	Assert.assertEquals(actualEmail, userEmail.getText());
	System.out.println(userEmail.getText());
}
}
