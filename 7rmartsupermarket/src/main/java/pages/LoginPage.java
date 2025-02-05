package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{	
	public WebDriver driver;
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath = "//input[@type='text']") WebElement userNameField;
	@FindBy(xpath = "//input[@type='password']") WebElement passwordField;	
	@FindBy(xpath = "//button[@class='btn btn-dark btn-block']") WebElement loginButton;
	@FindBy(xpath = "//div[contains(@class, 'alert-class-name')]") WebElement tileIsAvailable;
	@FindBy(xpath = "//div[contains(@class,'alert')]") WebElement alertIsAvailable;
	public void enterUserNameOnUserNameField(String username){
		userNameField.sendKeys(username);
	}	
	public void enterPasswordOnPasswordField(String password){
		passwordField.sendKeys(password);
	}
	public void clickOnLoginButton(){
		loginButton.click(); 
	}
	public boolean isDashboardTileAvailable(){
        return tileIsAvailable.isDisplayed();
    }
    public boolean isAlertDisplayed() {
        return alertIsAvailable.isDisplayed();
	}
}
