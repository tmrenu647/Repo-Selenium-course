package testscript;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class LoginTest extends Base {
	@Test (description = " verify whether user is able to Login with valid username and password")
	public void verifyWheatherTheUserIsAbleToNavigateToTheHomePageafterEnterCorrectUserNameANDPassword(){
		String username = ExcelUtilities.getString(1, 0, "Loginpage");
        String password = ExcelUtilities.getString(1, 1, "Loginpage");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserNameOnUserNameField(username).enterPasswordOnPasswordField(password).clickOnLoginButton();
        boolean tileIsAvailable = loginPage.isDashboardTileAvailable();
		assertTrue(tileIsAvailable,"User should not be able redirected to the dashboard.");
	}
	@Test(priority =1, description ="Verify whether user should not able to Login with a invalid username and valid password")
	public void verifyWhetherUserShouldNotAbleToLoginWithInvalidUserNameAndValidPassword(){
		String username = "admin12345672";
		String password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username).enterPasswordOnPasswordField(password).clickOnLoginButton();
		boolean alertIsAvailable=loginpage.isAlertDisplayed();
		assertTrue(alertIsAvailable,"User should be redirected to the dashboard with an invalid username and valid password");
	}
	@Test(priority =2, description ="Verify whether user should not able to Login with a valid username and invalid password")
	public void verifyWhetherUserShouldNotAbleToLoginWithValidUserNameAndInvalidPassword(){
		String username = "admin";
		String password = "admin12312312";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username).enterPasswordOnPasswordField(password).clickOnLoginButton();
		boolean alertIsAvailable=loginpage.isAlertDisplayed();
		assertTrue(alertIsAvailable,"User should be redirected to the dashboard with a valid username and invalid password");
	}
	@Test(priority =3, description ="Verify whether user should not able to Login with an invalid username and invalid password")
	public void verifyWhetherUserShouldNotAbleToLoginWithInvalidUserNameAndInvalidPassword(){
		String username = "admin5464646";
		String password = "admin12312312";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(username).enterPasswordOnPasswordField(password).clickOnLoginButton();
		boolean alertIsAvailable=loginpage.isAlertDisplayed();
		assertTrue(alertIsAvailable,"User should be redirected to the dashboard with an invalid username and invalid password");
	 }
}
