package testscript;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.CategoryPage;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class CategoryTest extends Base {
	@Test (description = "check the user can create a new category")
	public void verifyWheathertheUserCanCreateACategory()
	{
		String expectedAlertMessageForUserCreate =" \nAlert!\nCategory Created Successfully";
		String userName = ExcelUtilities.getString(1, 0, "LoginPage");
		String Password = ExcelUtilities.getString(1, 1, "LoginPage");;
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(Password); 
		loginpage.clickOnLoginButton();
		CategoryPage categorypage = new CategoryPage(driver);
		categorypage.categoryTabSelection();
		categorypage.categoryCreateButtonselection();
		categorypage.enterCategoryName();
		categorypage.selectingTheGroupsForCategoryDisplay();
		categorypage.fileUploadforCategoryCreate();
		categorypage.selectionofCategoryDisplayinTopMenu();
		categorypage.pagescrollingdown();
		categorypage.createdCategorySavingtoTheList();
		String actualAlertMessage=categorypage.alertDisplay();
		assertEquals(actualAlertMessage, expectedAlertMessageForUserCreate,"Category is not created and it is not displayed in the list");
	}
}