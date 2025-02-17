package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.RandomUtility;

public class SubCategoryPage {
public WebDriver driver;
	
	public SubCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']//child::i[@class='fas fa-arrow-circle-right']") WebElement subCategory;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']") WebElement subcategoryCreateButton;
	@FindBy(xpath = "//select[@class='form-control selectpicker']") WebElement categoryField;
	@FindBy(xpath = "//input[@id='subcategory']") WebElement SubcategoryField;
	@FindBy(xpath = "//input[@id='main_img']") WebElement fileChoose;
	@FindBy(xpath = "//button[@type='submit']") WebElement saveButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement alertSuccessDisplay;
	String imageuploadpath = "C:\\Users\\USER\\Pictures\\download.jpg";
	
	public void selctionOfSubCategoryPage()
	{
		subCategory.click();
	}
	
	public void selectionfSubCategoryCreateButton()
	{
		subcategoryCreateButton.click();
	}
	
	public void categorySelectedFromDropDown()
	{
		PageUtility pageutility = new PageUtility();
		pageutility.selectValueFromDropDownUsingIndex(categoryField, 4);
	}
	
	public void enteringSubcategoryName()
	{
		RandomUtility randomutility = new RandomUtility();
		String Subcategoryadding = randomutility.createsubCategoryName();
		SubcategoryField.sendKeys(Subcategoryadding);
	}
	
	public void imageuploadingForSubCategoryCreate()
	{
		FileUploadUtility fileuploadutility = new FileUploadUtility();
		fileuploadutility.FileUploadUsingSendKeys(fileChoose, imageuploadpath);
	}
	
	public void buttonClickForCreatingSubCategory()
	{
		saveButton.click();
	}
	
	public String alertdisplay()
	{
		String alertDisplayfromScreen = alertSuccessDisplay.getText();
		System.out.println(alertDisplayfromScreen);
		return alertDisplayfromScreen;
	}
	
	
	
	
}