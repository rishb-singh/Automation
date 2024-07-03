package testcases;
import org.testng.annotations.Test;
import base.BaseClass;
import pageObjects.Dashboard;
import pageObjects.HomePage;
import pageObjects.SignInPage;
import pageObjects.SignUpPage;

public class Login extends BaseClass {
	HomePage homepage;
	SignUpPage signuppage;
	SignInPage signinpage;
	Dashboard dashboard;
	@Test
	public void login() throws InterruptedException{
		homepage = new HomePage();
		signuppage=homepage.clickOnLogIn();	
		signinpage=signuppage.clickOnSignIn();
		signinpage.enterEmail();	
		signinpage.enterPassword();	
		dashboard = signinpage.clickLogin();
		dashboard.clickDashboardDropdown();
		dashboard.validateUser();
		
	
	}

}
