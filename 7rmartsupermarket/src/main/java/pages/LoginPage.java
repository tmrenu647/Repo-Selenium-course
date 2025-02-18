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
	@FindBy(xpath = "//*[@id=\"login-form\"]/div/div/div[1]/input") WebElement userNameField;
	@FindBy(xpath = "//*[@id=\"login-form\"]/div/div/div[2]/input") WebElement passwordField;	
	@FindBy(xpath = "//button[@class='btn btn-dark btn-block']") WebElement loginButton;
	@FindBy(xpath = "/html/body/div/nav/ul[2]/li/a") WebElement tileIsAvailable;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")  WebElement alertIsAvailable;
	public LoginPage enterUserNameOnUserNameField(String userName1){
		userNameField.sendKeys(userName1);
		return this;
	}	
	public LoginPage enterPasswordOnPasswordField(String Password){
		passwordField.sendKeys(Password);
		return this;
	}
	public LoginPage clickOnLoginButton(){
		loginButton.click(); 
		return this;
	}
	public boolean isDashboardTileAvailable(){
        return tileIsAvailable.isDisplayed();
    }
    public boolean isAlertDisplayed() {
        return alertIsAvailable.isDisplayed();
	}
}
