package testscript;



import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import org.testng.annotations.Test;

import pages.AdminUsersPage;

import pages.LoginPage;

import utilities.RandomUtility;

public class AdminUserTest extends Base{
	@Test(description = "Check the new admin user is created" , priority = 2)
	public void verifyWheatherNewAdminUserCanCreate()
	{
		String username ="RenuTM";
		String expectedAlertMessageForUserCreate = "×\nAlert!\nUser Created Successfully";
		int password =1234567;
		String userName = "admin";
		String Password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(Password); 
		loginpage.clickOnLoginButton();
		AdminUsersPage adminpage = new AdminUsersPage(driver);
		adminpage.clickOnAdminUserInfoPage();
		adminpage.newAdminUserCreateButtonSelection();
		adminpage.createNewAdminUserName(username);
		adminpage.createNewAdminUserPassword(password);
		adminpage.typeSelectionFromDropDown();
		adminpage.newAdminUserCreation();
		String actualAlertMessageForUserCreate=adminpage.alertdisplay();
		assertEquals(actualAlertMessageForUserCreate,expectedAlertMessageForUserCreate,"User not created successfully");
		adminpage.alertClick();
	}

@Test(description = "Verify wheather the user can be selected" ,priority = 1)
public void verifyWheathertheEntiredUserIsDisplayedFromList()
{
	String searchUsername ="Renu";
	String userName = "admin";
	String Password = "admin";
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserNameOnUserNameField(userName);
	loginpage.enterPasswordOnPasswordField(Password); 
	loginpage.clickOnLoginButton();
	AdminUsersPage adminpage = new AdminUsersPage(driver);
	adminpage.clickOnAdminUserInfoPage();
	adminpage.searchButtonClick();
	adminpage.searchAdminUserName(searchUsername);
	adminpage.searchtypeSelectionFromDropDown();
	adminpage.searchUserCreated();
	String actualSearchedResultFromTable=adminpage.searchedResultFromTable();
	assertEquals(actualSearchedResultFromTable, searchUsername, "The usernames listed on the table is not according to the searched username");
	
	
}
@Test (description = "Check new user can create with faker" , priority = 3)
public void verifyNewAdminUserCanCreateWithFaker()
{
	String userName = "admin";
	String Password = "admin";
	String expectedAlertMessageForUserCreate = "×\nAlert!\nUser Created Successfully";
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserNameOnUserNameField(userName);
	loginpage.enterPasswordOnPasswordField(Password); 
	loginpage.clickOnLoginButton();
	AdminUsersPage adminpage = new AdminUsersPage(driver);
	adminpage.clickOnAdminUserInfoPage();
	adminpage.newAdminUserCreateButtonSelection();
	adminpage.createFakerUserNameForNewAdminUserCreate();
	adminpage.createFakerPassWordForNewAdminCreate();
	adminpage.typeSelectionFromDropDown();
	adminpage.newAdminUserCreation();
	String actualAlertMessageForUserCreate=adminpage.alertdisplay();
	assertEquals(actualAlertMessageForUserCreate,expectedAlertMessageForUserCreate,"User not created successfully");
}


}