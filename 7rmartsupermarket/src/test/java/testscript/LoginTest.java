package testscript;

import org.testng.annotations.Test;
import org.testng.Assert;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


import pages.LoginPage;

public class LoginTest extends Base {
	@Test (description = " verify whether user is able to Login with valid username and password")
	public void verifyWheatherTheUserIsAbleToNavigateToTheHomePageafterEnterCorrectUserNameANDPassword(){
		String userName = "admin";
		String Password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(Password);
		loginpage.clickOnLoginButton();
		boolean tileIsAvailable=loginpage.isDashboardTileAvailable();
		Assert.assertTrue(tileIsAvailable,"User should not be able redirected to the dashboard.");
	}
	@Test(priority =1, description ="Verify whether user should not able to Login with a invalid username and valid password")
	public void verifyWhetherUserShouldNotAbleToLoginWithInvalidUserNameAndValidPassword(){
		String UserName = "admin12345672";
		String Password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(UserName);
		loginpage.enterPasswordOnPasswordField(Password);
		loginpage.clickOnLoginButton();
		boolean alertIsAvailable=loginpage.isAlertDisplayed();
		Assert.assertTrue(alertIsAvailable,"User should be redirected to the dashboard with an invalid username and valid password");
	}
	@Test(priority =2, description ="Verify whether user should not able to Login with a valid username and invalid password")
	public void verifyWhetherUserShouldNotAbleToLoginWithValidUserNameAndInvalidPassword(){
		String UserName = "admin";
		String Password = "admin12312312";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(UserName);
		loginpage.enterPasswordOnPasswordField(Password);
		loginpage.clickOnLoginButton();
		boolean alertIsAvailable=loginpage.isAlertDisplayed();
		Assert.assertTrue(alertIsAvailable,"User should be redirected to the dashboard with a valid username and invalid password");
	}
	@Test(priority =3, description ="Verify whether user should not able to Login with an invalid username and invalid password")
	public void verifyWhetherUserShouldNotAbleToLoginWithInvalidUserNameAndInvalidPassword(){
		String UserName = "admin5464646";
		String Password = "admin12312312";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(UserName);
		loginpage.enterPasswordOnPasswordField(Password);
		loginpage.clickOnLoginButton();
		boolean alertIsAvailable=loginpage.isAlertDisplayed();
		Assert.assertTrue(alertIsAvailable,"User should be redirected to the dashboard with an invalid username and invalid password");
	 }
}
